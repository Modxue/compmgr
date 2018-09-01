package edu.zut.cs.admin.controller;

import com.alibaba.fastjson.JSON;
import edu.zut.cs.admin.service.ApplyRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author: zouguo0212@
 * @Description:
 * @date: 2018/8/15 10:45
 */
@Controller
@RequestMapping(value = "/apply")
public class ApplyRoomController {

    @Autowired
    ApplyRoomService applyRoomService;


    @PostMapping(value = "/room",produces = "application/json;charset=utf-8")
    public @ResponseBody
    String applyRoomController(@RequestBody String s){
        Map map = JSON.parseObject(s);
        Integer lessonId = Integer.valueOf((String) map.get("id"));
        Integer week = Integer.valueOf((String) map.get("week"));
        Integer integer = applyRoomService.ApplyRoom(lessonId,week);
        String resultJson = JSON.toJSONString(integer);
        return resultJson;
    }
}
