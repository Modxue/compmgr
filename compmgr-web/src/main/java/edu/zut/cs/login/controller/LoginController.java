package edu.zut.cs.login.controller;

import edu.zut.cs.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



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

    @RequestMapping(value = "/authentication")
    public String login(@RequestParam String teacherNum, @RequestParam String password, HttpServletRequest request, HttpServletResponse response) throws IOException {
        if (loginService.isTruePassword(teacherNum,password)){
            return "";
        }else{
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("<script>alert('密码错误！！');history.back()</script>");
            return null;
        }
    }
}
