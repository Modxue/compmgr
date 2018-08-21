package edu.zut.cs.teacher.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.teacher.service.TeacherService;
import edu.zut.cs.user.dao.TeacherMapper;
import edu.zut.cs.user.model.Teacher;
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

}
