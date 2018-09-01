package edu.zut.cs.rolepower.controller;

import com.alibaba.fastjson.JSON;
import edu.zut.cs.rolepower.model.Role;
import edu.zut.cs.rolepower.service.RoleService;
import edu.zut.cs.user.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @packge_name: edu.zut.cs.rolepower.controller
 * @author: 薛二伟,郭志良
 * @Description:
 * @Date: 2018/8/22 20:10
 */
@RestController
@RequestMapping(value = "/role", produces = "application/json;charset=utf-8")
public class RoleController {

    @Autowired
    RoleService roleAllocationService;

    // 查询所有角色
    @RequestMapping("/search")
    public String selectAll() {
        List<Role> result = roleAllocationService.selectAll();
        return JSON.toJSONString(result);
    }

    // 根据角色id更改角色信息
    @RequestMapping("/update")
    public String update(@RequestBody String str) {
        Map map = JSON.parseObject(str);
        Integer id = Integer.parseInt((String) map.get("id"));
        String roleName = (String) map.get("roleName");
        String description = (String) map.get("description");
        Role role = new Role(id, roleName, description);
        int result = roleAllocationService.update(role);
        return JSON.toJSONString(result);
    }

    // 插入一条角色记录
    @RequestMapping("/add")
    public String insert(@RequestBody String str) {
        Map map = JSON.parseObject(str);
        String roleName = (String) map.get("roleName");
        String description = (String) map.get("description");
        Role role = new Role(roleName, description);
        int result = roleAllocationService.insert(role);
        return JSON.toJSONString(result);
    }

    // 查询角色下的教师
    @RequestMapping("/searchteacher")
    public String selectTeacher(@RequestBody String str) {
        Map map = JSON.parseObject(str);
        Integer roleId = Integer.parseInt((String) map.get("id"));
        List<Teacher> result = roleAllocationService.selectTeacher(roleId);
        return JSON.toJSONString(result);
    }

    // 删除一条角色记录
    @RequestMapping("/delete")
    public String delete(@RequestBody String str) {
        Map map = JSON.parseObject(str);
        Integer roleId = Integer.parseInt((String) map.get("id"));
        int result = roleAllocationService.delete(roleId);
        return JSON.toJSONString(result);
    }

    // 为角色添加教师
    @RequestMapping("/insertTeacher")
    public String insertTeacher(@RequestBody String str) {
        Map map = JSON.parseObject(str);
        Integer roleId = Integer.parseInt((String) map.get("roleId"));
        String teacherIdStr = (String) map.get("teacherId");
        String[] teacherIdArr = teacherIdStr.split(",");  // 将字符串切割成数组
        Integer[] teacherId = new Integer[teacherIdArr.length];
        for (int i = 0, j = teacherIdArr.length; i < j; i++) {  // 将String数组转化为Integer数组
            teacherId[i] = Integer.parseInt(teacherIdArr[i]);
        }
        int result = roleAllocationService.insertTeacher(roleId, teacherId);
        System.out.println(result);
        return JSON.toJSONString(result);
    }

    // 角色删除教师
    @RequestMapping("/deleteTeacher")
    public String deleteTeacher(@RequestBody String str) {
        Map map = JSON.parseObject(str);
        Integer roleId = Integer.parseInt((String) map.get("roleId"));
        Integer teacherId = Integer.parseInt((String) map.get("teacherId"));
        int result = roleAllocationService.deleteTeacher(roleId, teacherId);
        return JSON.toJSONString(result);
    }
}
