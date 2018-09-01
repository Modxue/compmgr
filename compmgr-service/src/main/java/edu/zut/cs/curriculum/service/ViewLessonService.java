package edu.zut.cs.curriculum.service;

import edu.zut.cs.curriculum.model.ViewLesson;

import java.util.List;

/**
 * create_by Intellij IDEA
 *
 * @author zouguo0212@
 * @package_name edu.zut.cs.curriculum.service
 * @description
 * @date 2018/8/29 15:15
 */
public interface ViewLessonService {

    List<ViewLesson> getLessonByUserNumAndWeek(String userNum,Integer week);

}
