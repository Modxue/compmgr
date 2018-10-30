package edu.zut.cs.wechat.controller;

import com.alibaba.fastjson.JSON;
import edu.zut.cs.teacher.service.TeacherService;
import edu.zut.cs.user.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;


/**
 * create_by Intellij IDEA
 *
 * @author zouguo0212@
 * @package_name edu.zut.cs.wechat.controller
 * @description
 * @date 2018/10/30 15:31
 */
@RequestMapping(value = "/weChat")
@Controller
public class WeChatController {


    @Autowired
    TeacherService teacherService;

    private final static String secrect = "Qp1lX4eq31TCypYqIVtOSRljfDka3SADpvKKy9xeHto";
    private final static String corpid = "ww1f4196b8f50b704b";


    @RequestMapping(value = "/login",produces = "application/json;charset=utf-8")
    public String init(HttpServletRequest request,
            @RequestParam(value = "code")String code,@RequestParam(value = "state") String state) {
        String accessTokenJson = sendGet("https://qyapi.weixin.qq.com/cgi-bin/gettoken",
                "corpid="+corpid+"&corpsecret="+secrect);
        Map map = JSON.parseObject(accessTokenJson);
        String accessToken = (String) map.get("access_token");
        String infoJson = sendGet("https://qyapi.weixin.qq.com/cgi-bin/user/getuserinfo",
                "access_token="+accessToken+"&code="+code);
        map = JSON.parseObject(infoJson);
        String userId = (String) map.get("UserId");
        if (userId!=null) {
            Teacher teacher = teacherService.getTeacherByUserId(userId);
            HttpSession session = request.getSession();
            if (teacher!=null) {
                session.setAttribute("teacher",teacher);
                session.setAttribute("userId",userId);
                return "redirect:/html/testpage.html";
            }
        }
        return "redirect:/html/weChat.html";
    }

    /**
     * 向指定URL发送GET方法的请求
     *
     * @param url
     *            发送请求的URL
     * @param param
     *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return URL 所代表远程资源的响应结果
     */
    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + param;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }

}
