package edu.zut.cs.curriculum.service;

import edu.zut.cs.curriculum.dao.ViewLessonMapper;
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
 * @package_name edu.zut.cs.curriculum.service
 * @description
 * @date 2018/8/29 15:19
 */
@Rollback
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-dao.xml")
public class ViewLessonServiceTest {

    @Autowired
    ViewLessonMapper viewLessonMapper;


    @Test
    public void getLessonByUserNumAndWeekTest(){
        Integer week = 5;
        String userNum = "3857";
        String weekString;
        if(week < 10){
            weekString = "0"+week;
        } else {
            weekString = String.valueOf(week);
        }
        List<ViewLesson> result = viewLessonMapper.selectByUserNumAndWeek(userNum,weekString);
        for (ViewLesson lesson : result) {
            lesson.initWeekArr();
            System.out.println(lesson);
        }
    }
}
