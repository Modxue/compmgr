package edu.zut.cs.rolepower.controller;

import com.alibaba.fastjson.JSON;
import edu.zut.cs.rolepower.service.RoleAllocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @packge_name: edu.zut.cs.rolepower.controller
 * @author: 薛二伟
 * @Description:
 * @Date: 2018/8/22 20:10
 */
@Controller
@RequestMapping(value = "/role")
public class RoleController {

    @Autowired
    RoleAllocationService roleAllocationService;

    @PostMapping(value = "/addrole",produces = "application/json;charset=utf-8")
    public @ResponseBody String getUserInfo(@RequestBody String message)throws Exception{
        System.out.println("前台传的参数：");

        Map map = JSON.parseObject(message);
        System.out.println(map);
        String roleName= (String) map.get("name");
        String description= (String) map.get("description");
        if (!roleAllocationService.isHaveSameName(roleName)){
            if (roleAllocationService.isAddRole(roleName,description)){
                System.out.println("hahahahahahahahahahah!");
                return JSON.toJSONString(1);
            }
            System.out.println("heheheheheheheh!");
            return JSON.toJSONString(-1);
        }

        return JSON.toJSONString(0);
    }
}
