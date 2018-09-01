package edu.zut.cs.curriculum.service.impl;

import edu.zut.cs.curriculum.dao.ViewLessonMapper;
import edu.zut.cs.curriculum.model.ViewLesson;
import edu.zut.cs.curriculum.service.ViewLessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * create_by Intellij IDEA
 *
 * @author zouguo0212@
 * @package_name edu.zut.cs.curriculum.service.impl
 * @description
 * @date 2018/8/29 15:15
 */
@Service
public class ViewLessonServiceImpl implements ViewLessonService {

    @Autowired
    ViewLessonMapper viewLessonMapper;

    @Override
    public List<ViewLesson> getLessonByUserNumAndWeek(String userNum, Integer week) {
        String weekString = "";
        if (week != null) {
            if (week < 10) {
                weekString = "0" + week;
            } else {
                weekString = String.valueOf(week);
            }
        }
        List<ViewLesson> resultList = viewLessonMapper.selectByUserNumAndWeek(userNum, weekString);
        for (ViewLesson viewLesson : resultList) {
            viewLesson.initWeekArr();
        }
        return resultList;
    }
}
