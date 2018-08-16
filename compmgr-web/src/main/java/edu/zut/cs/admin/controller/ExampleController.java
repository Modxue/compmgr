package edu.zut.cs.admin.controller;

import com.alibaba.fastjson.JSON;
import edu.zut.cs.admin.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: zouguo0212@
 * @Description:
 * @date: 2018/8/16 15:43
 */
@Controller
@RequestMapping(value = "/example")
public class ExampleController {

    @Autowired
    ExampleService exampleService;

    /**
     * 根据前台发送过来的一个id 来返回指定id的roomNum
     * Post请求
     * @param id
     * @return
     */
    @PostMapping(value = "/getroomnumbyid",produces = "application/json;charset=utf-8")
    public @ResponseBody
    String getRoomNumById(@RequestParam(value = "id",defaultValue = "1")Integer id){
        String resultNum = exampleService.getOneComputerLabNumberById(id);
        String resultJson = JSON.toJSONString(resultNum);
        return resultJson;
    }

    /**
     * Get请求
     * @return
     */
    @GetMapping(value = "/getallroomnum",produces = "application/json;charset=utf-8")
    public @ResponseBody
    String getAllRoomNum(){
        List<String> resultList = exampleService.getAllComputerLabNumber();
        String resultJson = JSON.toJSONString(resultList);
        return resultJson;
    }
}
