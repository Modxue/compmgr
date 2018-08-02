package edu.zut.cs.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.admin.dao.CourseMapper;
import edu.zut.cs.admin.model.Course;
import edu.zut.cs.admin.service.ApplyCourseService;

@Service
public class ApplyCourseServiceImpl implements ApplyCourseService{
	
	@Autowired
	CourseMapper courseMapper;

	@Override
	public void findAll() {
		// TODO Auto-generated method stub
		List<Course> courseList =  courseMapper.getAllCourse();
		System.out.println(courseList);
	}
	
}
