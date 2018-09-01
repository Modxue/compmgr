package edu.zut.cs.user.dao;

import edu.zut.cs.tools.Md5;
import edu.zut.cs.user.model.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
		String name = teacherMapper.getNameById(8322);
		System.out.println(name);
	}

	/**
	 * @author:houjie
	 * @Description:get password by id
	 * @date: 2018-08-04 09:15
	 */
	@Test
	public void getPasswordByIdTest() {
		String password = teacherMapper.getPasswordById(8322);
		System.out.println(password);
	}

	/**
	 * @author:houjie
	 * @Description:insert one new teacher
	 * @date: 2018-08-07 12:47
	 */
	@Test
	public void insertTeacherTest() {
		Teacher t = new Teacher();
		t.setTeacherNum("001");
		t.setTeacherName("王鹏");
		t.setTeacherEmail("544536");
		t.setPassword("211222");
		teacherMapper.insertTeacher(t);
		// System.out.println("success!");
	}

	/**
	 * @author:houjie
	 * @Description:get one Teacher by id
	 * @date: 2018-08-07 12:47
	 */
	@Test
	public void getOneTeacherByIdTest() {
		Teacher teachers = teacherMapper.getOneTeacherById(8322);
		System.out.println(teachers);
	}
	@Test
	public void updateTeacherPasswordByIdTest() {
		Integer result = -1;
		String nowPassword = teacherMapper.getPasswordById(8365);
		String password = new Md5().lock("123456");
		if (nowPassword.equalsIgnoreCase(new Md5().lock("123"))) {
			result = teacherMapper.updateTeacherPasswordById(8365, password);
		} else {
			result = 0;
		}
		System.out.println("状态标志："+result);
	}
}