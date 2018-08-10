package edu.zut.cs.curriculum.dao;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import edu.zut.cs.curriculum.model.Course;

import java.util.List;

/**
 * @author: ymz
 * @Description:course测试类
 * @date: 2018/8/2 17:57
 */
@Transactional
@Rollback
@RunWith(SpringJUnit4ClassRunner.class)//测试运行在spring环境中
@ContextConfiguration(locations = "classpath*:applicationContext-dao.xml")
public class CourseTest {

    @Autowired
    CourseMapper courseMapper;

   
   //测试查找所有Course
    @Test
    public void getAllCourseTest(){
        List<Course> resultList = courseMapper.getAllCourse();
        for (Course course : resultList) {
            System.out.println(course);
        }
    }
  //测试通过id查找课程名称
    @Test
    public void getCourseNameByIdTest() {
    	String result=courseMapper.getCourseNameById(2989);
    	System.out.println(result);
    	
    }
  //测试通过id查找课程
    @Test
    public void getCourseByIdTest() {
    	Course result=courseMapper.getCourseById(2989);
    	System.out.println(result);
    	
    }
    //插入一条记录
    @Test
    public void insertTest(){
    	courseMapper.insertCourse();
    	List<Course> resultList = courseMapper.getAllCourse();
        for (Course course : resultList) {
            System.out.println(course);
        }
    }
    //根据id删除一条记录
    @Test
    public void deleteCourseByIdTest(){
    	courseMapper.deleteCourseById(3040);
    	List<Course> resultList = courseMapper.getAllCourse();
        for (Course course : resultList) {
            System.out.println(course);
        }
    }
}
