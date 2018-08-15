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
* 类说明  测试
*/


@Transactional
@Rollback
@RunWith(SpringJUnit4ClassRunner.class)//测试运行在spring环境中
@ContextConfiguration(locations = "classpath*:applicationContext-dao.xml")
public class LessonTest {
	@Autowired
	LessonMapper lessonMapper;

	//测试查找所有的Lesson
    @Test
    public void getAllLessonTest(){
        List<Lesson> resultList = lessonMapper.getAllLesson();
        for (Lesson lesson : resultList) {
            System.out.println(lesson);
        }
       System.out.println(resultList);
    }
  //测试通过id查找课程安排id
    @Test
    public void getArrangeIdByIdTest() {
    	Lesson result=lessonMapper.getArrangeIdById(null);
    	System.out.println(result);
    	
    }
    
   
    
}
