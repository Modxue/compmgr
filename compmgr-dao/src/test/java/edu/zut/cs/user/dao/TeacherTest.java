package edu.zut.cs.user.dao;

import edu.zut.cs.user.dao.TeacherMapper;
import edu.zut.cs.user.model.Teacher;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Scanner;

/**
 * @author:zsy0216
 * @Description:
 * @date: 2018-08-03 15:06
 */
@Transactional
@Rollback
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext-dao.xml")
public class TeacherTest {

	@Autowired
	TeacherMapper teacherMapper;
	/**
	 * @author:houjie
	 * @Description:get all teacher
	 * @date: 2018-08-03 13:32
	 */
	@Test
	public void getAllTeacherTest() {
		List<Teacher> resultList = teacherMapper.getAllTeacher();
		for (Teacher teacher : resultList) {
			System.out.println(teacher);
		}
		// System.out.println(resultList);
	}

	@Test
	public void getNameByIdTest() {
		Scanner scanner = new Scanner(System.in);
		Integer i = 0;
		System.out.println("please input a id to reserach:");
		i = scanner.nextInt();
		String name = teacherMapper.getNameById(i);
		System.out.println(name);
		scanner.close();
	}
	
	/**
	 * @author:houjie
	 * @Description:get all teacher
	 * @date: 2018-08-04 09:15
	 */  
	@Test
	public void getPasswordByIdTest() {
		String password=teacherMapper.getPasswordById(8322);
		System.out.println(password);
	}
}