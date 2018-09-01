package edu.zut.cs.admin.controller;

import com.alibaba.fastjson.JSON;
import edu.zut.cs.admin.service.AdjustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * create_by Intellij IDEA
 *
 * @author zouguo0212@
 * @package_name edu.zut.cs.admin.controller
 * @description
 * @date 2018/9/1 17:39
 */
@Controller
@RequestMapping(value = "/adjust")
public class AdjustRoomController {

    @Autowired
    AdjustService adjustService;

    @PostMapping(value = "/retreat",produces = "application/json;charset=utf-8")
    public @ResponseBody
    String retreatRoom(@RequestBody String str){
        Map map = JSON.parseObject(str);
        System.out.println("接受前台参数："+map);
        Integer id = Integer.valueOf((String) map.get("id"));
        String resultJson = JSON.toJSONString(adjustService.retreatRoom(id));
        return resultJson;
    }


    @PostMapping(value = "/change",produces = "application/json;charset=utf-8")
    public @ResponseBody
    String changeRoom(@RequestBody String str){
        Map map = JSON.parseObject(str);
        System.out.println("接受前台参数："+map);
        Integer id = Integer.valueOf((String) map.get("id"));
        Integer roomId = Integer.valueOf((String) map.get("roomId"));
        String resultJson = JSON.toJSONString(adjustService.changeRoom(id,roomId));
        return resultJson;
    }

}
