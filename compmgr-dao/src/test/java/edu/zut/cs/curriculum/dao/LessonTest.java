package edu.zut.cs.curriculum.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import edu.zut.cs.curriculum.model.Lesson;

import java.util.List;


/**
* @author hyx
* @version 创建时间：2018年8月5日 下午11:21:52
* 类说明
*/


@Transactional
@Rollback
@RunWith(SpringJUnit4ClassRunner.class)//测试运行在spring环境中
@ContextConfiguration(locations = "classpath*:applicationContext-dao.xml")
public class LessonTest {
	@Autowired
	LessonMapper LessonMapper;

    @Test
    public void getAllArrangeTest(){
        List<Lesson> resultList = LessonMapper.getAllLesson();
        for (Lesson lesson : resultList) {
            System.out.println(lesson);
        }
       System.out.println(resultList);
    }

}
