package edu.zut.cs.curriculum.dao;
/**
* @author hyx
* @version 创建时间：2018年8月5日 下午10:45:04
* 
*/

import java.util.List;

import edu.zut.cs.curriculum.model.Lesson;

public interface  LessonMapper {
	
	    Lesson getArrangeIdById(Integer id);
		//通过id查找课程安排id
	    
	    Integer getNodeByWeekDay(Integer weekDay);
		//通过授课周几查找授课节数
	    
	    List<String> getRoomNumByIsDoubleWeek(Integer isDoubleWeek);
	    //通过授课周是否是双周查找授课教室
	    
	    List<Lesson>getAllLesson();
	    //获得所有Lesson
	
	    void insertLesson();
	    //插入一个Lesson

	    void deleteLessonById(Integer id);
	    //删除一个Lesson
	    
	    
}
