package edu.zut.cs.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: zouguo0212@
 * @Description:
 * @date: 2018/7/31 23:56
 */
@Controller
@RequestMapping("/main")
public class main {

    @RequestMapping("/index")
    public String index(){
        return "main/index";
    }
}
