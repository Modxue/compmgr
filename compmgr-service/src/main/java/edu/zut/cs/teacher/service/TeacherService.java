package edu.zut.cs.teacher.service;

import edu.zut.cs.user.model.Teacher;

/**
 * @author:zsy0216
 * @Description:
 * @date: 2018-08-10 15:56
 */
public interface TeacherService {

	Teacher getTeacherById(Integer id);
	/**
	 * @author:houjie
	 * @Description:修改指定id老师的密码
	 * @date: 2018-08-21 21：14
	 */
	Integer updateTeacherPasswordById(Integer id,String oldPassword,String newPassword);

	Integer updateTeacherInfoById(Integer id,Teacher teacher);

	//Integer insertTeacher(Teacher teacher);
}
