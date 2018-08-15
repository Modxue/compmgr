package edu.zut.cs.admin.controller;

import com.alibaba.druid.mock.MockArray;
import edu.zut.cs.admin.service.ApplyRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    String applyRoomController(@RequestBody String S){

        return null;
    }
}
