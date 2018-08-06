package edu.zut.cs.login.controller;

import com.alibaba.fastjson.JSON;
import edu.zut.cs.login.service.LoginService;
import edu.zut.cs.user.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

    @RequestMapping(value = "/authentication")
    public String submit(@RequestParam String teacherNum, @RequestParam String password, HttpServletRequest request, HttpServletResponse response) throws IOException {
        if (loginService.isTruePassword(teacherNum,password)){
            return "";
        }else{
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("<script>alert('密码错误！！');history.back()</script>");
            return null;
        }
    }

    @PostMapping(value = "/teacherinfo",produces = "application/json;charset=utf-8")
    public @ResponseBody String getUserInfo(){
        List<Teacher> teachers = loginService.getAllTeacherInfo();
        String s= JSON.toJSONString(teachers);
        System.out.println(s);
        return s;
    }
}
