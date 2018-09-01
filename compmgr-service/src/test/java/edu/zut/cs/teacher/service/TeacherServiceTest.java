package edu.zut.cs.teacher.service;

import edu.zut.cs.tools.Md5;
import edu.zut.cs.user.dao.TeacherMapper;
import edu.zut.cs.user.model.Teacher;
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
    @Test
    public void updateTeacherInfoByIdTest(){
        Integer result=-1;
        Integer id=8533;
        Teacher teacher1 = new Teacher();
        teacher1.setTeacherNum("001");
        teacher1.setTeacherName("wangyang");
        if(id!=null)
            result=teacherMapper.updateTeacherInfoById(8553,teacher1);
        else
            result=0;
    }
     @Test
    public  void insertTeacherTest(){
         Integer result=-1;
         Teacher teacher1=new Teacher();
         String teacherNum;
         String teacherName;
         String teacherEmail;
         String password;
         teacher1.setTeacherName("8755");
         teacher1.setTeacherName("杨先生");
         teacher1.setTeacherEmail("146843");
         teacher1.setPassword("53589");
         teacherMapper.insertTeacher(teacher1);
         result=0;
     }
}
