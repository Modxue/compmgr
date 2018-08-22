package edu.zut.cs.teacher.service.impl;

import edu.zut.cs.teacher.service.TeacherService;
import edu.zut.cs.tools.Md5;
import edu.zut.cs.user.dao.TeacherMapper;
import edu.zut.cs.user.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author:zsy0216
 * @Description:
 * @date: 2018-08-10 15:56
 */
@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	TeacherMapper teacherMapper;

	@Override
	public Teacher getTeacherById(Integer id) {
		return teacherMapper.getOneTeacherById(id);
	}

	/**
	 * @author:houjie
	 * @param id
	 * @param oldPassword 旧的密码
	 * @param newPassword 新的密码
	 * @return -1表示异常 1表示成功 0表示失败
	 */
	@Override
	public  Integer updateTeacherPasswordById(Integer id,String oldPassword,String newPassword) {
		Integer result = -1;//成功返回1，失败返回0，异常返回-1
		//通过id得到老师的密码
		String nowPassword = teacherMapper.getPasswordById(id);
		String password = new Md5().lock(newPassword);

		if (nowPassword.equalsIgnoreCase(new Md5().lock(oldPassword))) {
			result = teacherMapper.updateTeacherPasswordById(id,password);
		} else
		{
			result = 0;
		}
		return result;
	}
}
