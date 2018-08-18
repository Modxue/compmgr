package edu.zut.cs.user.dao;

import edu.zut.cs.user.model.Teacher;

import java.util.List;

/**
 * @author:zsy0216
 * @Description:
 * @date: 2018-08-03 15:06
 */
public interface TeacherMapper {
	
	// 获取所有老师信息
	public List<Teacher> getAllTeacher();

	// 通过Id查询老师姓名
	public String getNameById(Integer id);

	// 通过Id查询老师密码
	public String getPasswordById(Integer id);

	// 插入一条老师信息，返回状态值
	public Integer insertTeacher(Teacher teacher);

	// 删除指定老师id的一条记录，返回状态值
	// public Integer deleteTeacherById(Integer id);
	
	// 通过指定Id获取老师信息
	public Teacher getOneTeacherById(Integer id);
}
