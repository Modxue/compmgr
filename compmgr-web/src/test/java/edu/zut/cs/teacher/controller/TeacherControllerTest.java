package edu.zut.cs.teacher.controller;

import com.alibaba.fastjson.JSON;
import edu.zut.cs.user.model.Teacher;
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

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author 侯捷
 * @package_name edu.zut.cs.teacher.controller
 * @date 2018/8/22 0:25
 * @description
 */
@Rollback
@Transactional
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)//测试运行在spring环境中
@ContextConfiguration(locations = {"classpath:applicationContext-service.xml", "file:src/main/webapp/WEB-INF/config/spring-mvc.xml"})
public class TeacherControllerTest {
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
    public void updateTeacherPasswordByIdTest() throws Exception {
        String responseString = mockMvc.perform(
                post("/teacher/updatepassword")//请求的url
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED) //数据格式
                        .param("id", "8348")  //参数
                        .param("oldPassword","123")
                        .param("newPassword","123456")
        )
                .andExpect(status().isOk()) //返回状态
                //        .andDo(print())         打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString(); //将相应数据转换成字符串
        System.out.println("------返回的JSON = " + responseString);
    }
    @Test
    public void  updateTeacherInfoByIdTest() throws Exception{
        String responseString = mockMvc.perform(
                post("/teacher/updateinfo")//请求的url
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED) //数据格式
                        .param("id", "8533")  //参数
                        //.param("teacher","teacher1")
                        //.param("teacher.teacherName","崔岩")
        )
                .andExpect(status().isOk()) //返回状态
                //        .andDo(print())         打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString(); //将相应数据转换成字符串
        System.out.println("------返回的JSON = " + responseString);
    }
}
