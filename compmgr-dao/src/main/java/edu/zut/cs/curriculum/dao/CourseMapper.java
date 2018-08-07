package edu.zut.cs.curriculum.dao; 
/** 
* @author ymz 
*  创建时间：2018年8月4日 下午9:43:22 
* 类说明 
*/

import java.util.List;

import edu.zut.cs.curriculum.model.Course;



public interface CourseMapper {
    void deleteCourseById(Integer id);
    //删除一个Course
	String getCourseNameById(Integer id);
	//通过id查找课程名
	Course getCourseById(Integer id);
	//通过id查找课程
    List<Course>getAllCourse();
    //获得所有Course
    void insertCourse();
    //插入一个Course

}
 