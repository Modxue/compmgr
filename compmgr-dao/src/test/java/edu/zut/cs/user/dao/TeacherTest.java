package edu.zut.cs.user.dao;

import edu.zut.cs.user.dao.TeacherMapper;
import edu.zut.cs.user.model.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Rollback
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext-dao.xml")
public class TeacherTest {

    @Autowired
    TeacherMapper teacherMapper;

    @Test
    public void getAllTeacherTest(){
        List<Teacher> resultList = teacherMapper.getAllTeacher();
        for (Teacher teacher : resultList) {
            System.out.println(teacher);
        }
//        System.out.println(resultList);
    }
}