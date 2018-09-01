package edu.zut.cs.admin.controller;

import com.alibaba.fastjson.JSON;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * create_by Intellij IDEA
 *
 * @author zouguo0212@
 * @package_name edu.zut.cs.admin.controller
 * @description
 * @date 2018/8/29 15:26
 */
@Rollback
@Transactional
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)//测试运行在spring环境中
@ContextConfiguration(locations = {"classpath:applicationContext-service.xml", "file:src/main/webapp/WEB-INF/config/spring-mvc.xml"})
public class adminControllerTest {

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
    public void getCourseForUserTest(){
        Map<String,String> map = new HashMap<>();
        map.put("week","");
        String requestJson = JSON.toJSONString(map);
        System.out.println("requestJson--------:"+requestJson);
        String responseString = null; //将相应数据转换成字符串
        try {
            responseString = mockMvc.perform(
                    post("/admin/getcoursebyweek")//请求的url
                            .contentType(MediaType.APPLICATION_JSON) //数据格式
                            .content(requestJson)  //参数
            )
                    .andExpect(status().isOk()) //返回状态
                    //        .andDo(print())         打印出请求和相应的内容
                    .andReturn().getResponse().getContentAsString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("------返回的JSON = " + responseString);
    }

}
