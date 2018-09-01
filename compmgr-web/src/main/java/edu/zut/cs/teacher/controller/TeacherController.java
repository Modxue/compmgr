package edu.zut.cs.teacher.controller;

import com.alibaba.fastjson.JSON;
import edu.zut.cs.teacher.service.TeacherService;
import edu.zut.cs.user.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author 侯捷
 * @package_name edu.zut.cs.teacher.controller
 * @date 2018/8/21 23:46
 * @description
 */
@Controller
@RequestMapping("/teacher")
public class TeacherController {

@Autowired
    TeacherService teacherService;
@PostMapping(value="/updatepassword")
    public @ResponseBody
    String updateTeacherPasswordById(
            @RequestParam("id")Integer id,
            @RequestParam("oldPassword") String oldPassword,
            @RequestParam("newPassword") String newPassword)
{
      System.out.print("前台发送过来数据-----");
      System.out.print("id--"+id);
      System.out.print("oldPassword--"+oldPassword);
      System.out.print("newPassword--"+newPassword);
      Integer result=teacherService.updateTeacherPasswordById(id,oldPassword,newPassword);
      String resultJson=JSON.toJSONString(result);
      System.out.println("返回给前台的JSON---"+resultJson);
      return resultJson;
}

@PostMapping(value="/updateinfo")
    public @ResponseBody
    String  updateTeacherInfoById(
        @RequestParam("id")Integer id,
        @RequestParam("teacher")Teacher teacher)
{
    System.out.print("前台发送过来数据-----");
    System.out.print("id--"+id);
    Integer result=teacherService.updateTeacherInfoById(id,teacher);
    String resultJson=JSON.toJSONString(result);
    System.out.println("返回给前台的JSON---"+resultJson);
    return resultJson;
}
}
