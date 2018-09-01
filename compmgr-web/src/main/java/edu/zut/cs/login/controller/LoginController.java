package edu.zut.cs.login.controller;

import com.alibaba.fastjson.JSON;
import edu.zut.cs.login.service.LoginService;
import edu.zut.cs.teacher.service.TeacherService;
import edu.zut.cs.user.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;


/**
 * @packge_name: edu.zut.cs.login.controller
 * @author: 薛二伟
 * @Description:
 * @Date: 2018/8/4 20:03
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {
    @Autowired
    LoginService loginService;

    @Autowired
    TeacherService teacherService;

    /**
     *登录密码验证
     * @param teacherId
     * @param pwd
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
    @PostMapping(value = "/authentication",produces = "application/json;charset=utf-8")
    public String submit(@RequestParam String teacherId, @RequestParam String pwd, HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession httpSession=request.getSession();
        Integer tId=Integer.valueOf(teacherId);
        if (loginService.isTruePassword(tId,pwd)){
            Teacher teacher=teacherService.getTeacherById(tId);
            httpSession.setAttribute("teacher",teacher);
            System.out.println("新建一个session！！");
            System.out.println("账号密码正确");
            return "redirect:/html/apply.html";
        }else{
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("<script>alert('密码错误！！');history.back()</script>");
            return null;
        }
    }

    /**
     * 获取教师信息，登录选择
     * @return
     */
    @PostMapping(value = "/teacherinfo",produces = "application/json;charset=utf-8")
    public @ResponseBody String getUserInfo(){
        List<Teacher> teachers = loginService.getAllTeacherInfo();
        String s= JSON.toJSONString(teachers);
        System.out.println(s);
        return s;
    }

    /**
     *退出登录
     * @param httpSession
     * @param response
     * @throws Exception
     */
    @RequestMapping("/logout")
    public void loginout(HttpSession httpSession,HttpServletResponse response)throws Exception{
        Teacher teacher=(Teacher) httpSession.getAttribute("teacher");
        response.sendRedirect("/compmgr/html/login.html");
        httpSession.invalidate();
    }
}
