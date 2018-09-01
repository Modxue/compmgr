package edu.zut.cs.admin.controller;

import com.alibaba.fastjson.JSON;
import edu.zut.cs.admin.model.ViewRecord;
import edu.zut.cs.admin.service.SearchService;
import edu.zut.cs.user.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * create_by Intellij IDEA
 *
 * @author zouguo0212@
 * @package_name edu.zut.cs.admin.controller
 * @description
 * @date 2018/8/29 18:12
 */
@Controller
@RequestMapping(value = "/search")
public class SearchController {

    @Autowired
    SearchService searchService;

    @PostMapping(value = "/recordbyusernum",produces = "application/json;charset=utf-8")
    public @ResponseBody
    String searchApplyRecordByUserNum(HttpSession session){
        Teacher teacher = (Teacher) session.getAttribute("teacher");
        List<ViewRecord> viewRecordList = searchService.getApplyRecordByUserNum(teacher.getTeacherNum());
//        测试用
//        List<ViewRecord> viewRecordList = searchService.getApplyRecordByUserNum("3857");
        String result = JSON.toJSONString(viewRecordList);
        return result;
    }

    @PostMapping(value = "/allroom",produces = "application/json;charset=utf-8")
    public @ResponseBody
    String getAllRoom(){
        String result = JSON.toJSONString(searchService.getAllComputerRoom());
        return result;
    }

}
