package edu.zut.cs.curriculum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.curriculum.dao.CourseMapper;
import edu.zut.cs.curriculum.model.Course;
import edu.zut.cs.curriculum.service.CourseService;

/** 
* @author ymz 
*  创建时间：2018年8月11日 下午3:52:29 
* 类说明 course实现类
*/
@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseMapper coursemapper;
	
	@Override
	public void findAll() {
		List<Course> course=coursemapper.getAllCourse();
		for(Course c:course) {
			System.out.println(c);
		}
		
	}
	
	

}
 