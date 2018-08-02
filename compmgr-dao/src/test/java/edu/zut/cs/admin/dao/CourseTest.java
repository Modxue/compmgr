package edu.zut.cs.admin.dao;

import edu.zut.cs.admin.dao.CourseMapper;
import edu.zut.cs.admin.model.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: zouguo0212@
 * @Description:
 * @date: 2018/8/2 17:57
 */
@Transactional
@Rollback
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext-dao.xml")
public class CourseTest {

    @Autowired
    CourseMapper courseMapper;

    @Test
    public void getAllCourseTest(){
        List<Course> resultList = courseMapper.getAllCourse();
        for (Course course : resultList) {
            System.out.println(course);
        }
//        System.out.println(resultList);
    }
}
