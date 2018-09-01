package edu.zut.cs.curriculum.dao;

import edu.zut.cs.curriculum.model.ViewLesson;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * create_by Intellij IDEA
 *
 * @author zouguo0212@
 * @package_name edu.zut.cs.curriculum.dao
 * @description
 * @date 2018/8/29 14:55
 */
public interface ViewLessonMapper {

    /**
     * 查询指定userNum在指定week的全部课程
     * @param userNum
     * @param week
     * @return
     */
    List<ViewLesson> selectByUserNumAndWeek(@Param("userNum")String userNum,@Param("week")String week);

    ViewLesson selectByLessonId(@Param("lessonId")Integer lessonId);

}