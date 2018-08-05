package edu.zut.cs.curriculum.dao; 
/** 
* @author ymz 
*  创建时间：2018年8月4日 下午9:43:22 
* 类说明 
*/

import java.util.List;

import edu.zut.cs.curriculum.model.Course;



public interface CourseMapper {
	String getCourseNameById(Integer id);
	//通过id查找课程名
	List<String> getPeriodByCourseName(String courseName);
	//通过课程名查找学时
    List<Course>getAllCourse();
    //获得所有Course
}
 