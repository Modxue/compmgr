package edu.zut.cs.admin.service;

import edu.zut.cs.curriculum.dao.CourseMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Rollback
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-dao.xml")
public class ApplyServiceTest {
	
	@Autowired
	CourseMapper courseMapper;
	
	@Test
	public void findAllTest() {

		System.out.println(courseMapper.getAllCourse());
	}
}
