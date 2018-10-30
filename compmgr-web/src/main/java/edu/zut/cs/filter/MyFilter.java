package edu.zut.cs.filter;

import edu.zut.cs.user.model.Teacher;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * create_by Intellij IDEA
 *
 * @author zouguo0212@
 * @package_name edu.zut.cs.filter
 * @description
 * @date 2018/10/19 15:42
 */
public class MyFilter implements Filter {

    /** 要检查的 session 的名称 */
    private String sessionKey;

    /** 检查不通过时，转发的URL */
    private String redirectUrl;

    //不检查的url
    private String uncheckedUrls;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("SessionFilter的启动");
        sessionKey= filterConfig.getInitParameter("sessionKey");
        redirectUrl= filterConfig.getInitParameter("redirectUrl");
        uncheckedUrls = filterConfig.getInitParameter("uncheckedUrls");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if (sessionKey==null||sessionKey.equals("")){
            filterChain.doFilter(servletRequest,servletResponse);
            return;
        }

        // 获得在下面代码中要用的request,response,session对象
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        //1.获取请求URL
        String servletPath = request.getServletPath();


        //2.检测1中获取的servletPath是否为不需要检测的URl中的一个.若是,放行
        List<String> urls = Arrays.asList(uncheckedUrls.split(","));
        if (urls.contains(servletPath)
                ||servletPath.endsWith(".js")
                ||servletPath.endsWith(".css")
                ||servletPath.endsWith(".jpg")
                ||servletPath.endsWith(".png")) {
//            System.out.println("放行当前的访问路径："+servletPath);
//            System.out.println("Session中的teacher信息："+teacher);
            filterChain.doFilter(servletRequest,servletResponse);
        }else {
            //3.从session中获取SessionKey对应值,若值不存在,则重定向到redirectUrl
            Object user = request.getSession().getAttribute("teacher");

            if (user != null) {
//                Teacher teacher = (Teacher) user;
//                System.out.println("UserNot Null的teacher信息："+teacher);
                filterChain.doFilter(servletRequest,servletResponse);
            }else{
                    response.sendRedirect(redirectUrl);
                }
            }
    }

    @Override
    public void destroy() {
        System.out.println("SessionFilter的销毁");
    }
}
