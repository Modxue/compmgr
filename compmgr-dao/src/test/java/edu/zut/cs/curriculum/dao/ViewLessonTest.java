package edu.zut.cs.curriculum.dao;

import edu.zut.cs.curriculum.model.ViewLesson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * create_by Intellij IDEA
 *
 * @author zouguo0212@
 * @package_name edu.zut.cs.curriculum.dao
 * @description
 * @date 2018/8/29 15:01
 */
@Rollback
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-dao.xml")
public class ViewLessonTest {

    @Autowired
    ViewLessonMapper viewLessonMapper;

    @Test
    public void selectByUserNumAndWeekTest(){
        List<ViewLesson> viewLessonList = viewLessonMapper.selectByUserNumAndWeek("3857","");
        for (ViewLesson lesson : viewLessonList) {
            System.out.println(lesson);
        }
    }

}
