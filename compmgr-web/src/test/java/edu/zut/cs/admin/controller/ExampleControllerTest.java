package edu.zut.cs.admin.controller;

import com.alibaba.fastjson.JSON;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author: zouguo0212@
 * @Description:
 * @date: 2018/8/16 16:13
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)//测试运行在spring环境中
@ContextConfiguration(locations = {"classpath:applicationContext-service.xml", "file:src/main/webapp/WEB-INF/config/spring-mvc.xml"})
public class ExampleControllerTest {

    //    传入SpringMVC的ioc
    @Autowired
    private WebApplicationContext context;
    //    虚拟mvc请求，获取处理结果
    MockMvc mockMvc;

    @Before
    public void initMockMvc() {
        System.out.println("初始化!!!");
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void getRoomNumByIdTest() throws Exception {
        Map<String,String> map = new HashMap<>();
        map.put("id","5");
        String requestJson = JSON.toJSONString(map);
        System.out.println("requestJson--------:"+requestJson);
        String responseString = mockMvc.perform(
                post("/example/getroomnumbyid")//请求的url
                        .contentType(MediaType.APPLICATION_JSON) //数据格式
                        .content(requestJson)  //参数
        )
                .andExpect(status().isOk()) //返回状态
                //        .andDo(print())         打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString(); //将相应数据转换成字符串
        System.out.println("------返回的JSON = " + responseString);
    }

    @Test
    public void getAllRoomNumTest() throws Exception {
        String responseString = mockMvc.perform(
                get("/example/getallroomnum")//请求的url
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED) //数据格式
        )
                .andExpect(status().isOk()) //返回状态
                //        .andDo(print())         打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString(); //将相应数据转换成字符串
        System.out.println("------返回的JSON = " + responseString);

    }
}
