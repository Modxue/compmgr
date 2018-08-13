package edu.zut.cs.teacher.service;

import java.util.List;

import edu.zut.cs.user.model.Teacher;

/**
 	 * @author:zsy0216
	 * @Description:
  	 * @date: 2018-08-10 15:56
 	 */
public interface TeacherService {
	
	List<Teacher> getTeacherById(Integer id);
}


