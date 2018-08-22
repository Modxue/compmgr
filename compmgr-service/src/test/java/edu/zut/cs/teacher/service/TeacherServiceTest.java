package edu.zut.cs.teacher.service;

import edu.zut.cs.tools.Md5;
import edu.zut.cs.user.dao.TeacherMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 侯捷
 * @package_name edu.zut.cs.teacher.service
 * @date 2018/8/21 23:46
 * @description
 */

@Rollback
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-dao.xml")
public class TeacherServiceTest {

    @Autowired
    TeacherMapper teacherMapper;

    @Test
    public void updateTeacherPasswordByIdTest(){

        Integer result=-1;
        String nowpassword=teacherMapper.getPasswordById(8365);
        String password=new Md5().lock("123456");
//        验证密码加密后的密文是否一致
        if(nowpassword.equalsIgnoreCase(new Md5().lock("123"))){
          result=  teacherMapper.updateTeacherPasswordById(8365,password);
        }
        else
        {
            result=0;
        }
        System.out.print("状态值："+result);
    }
}
