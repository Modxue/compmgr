package edu.zut.cs.admin.service.impl;

import edu.zut.cs.admin.service.ApplyCourseService;
import edu.zut.cs.curriculum.dao.CourseMapper;
import edu.zut.cs.curriculum.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
