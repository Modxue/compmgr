package edu.zut.cs.user.dao;

import edu.zut.cs.user.model.Teacher;

import java.util.List;

/**
 * @author:zsy0216
 * @Description:
 * @date: 2018-08-03 15:06
 */
public interface TeacherMapper {

	public List<Teacher> getAllTeacher();

	public String getNameById(Integer id);
	
	public String getPassWordById(Integer id);
}
