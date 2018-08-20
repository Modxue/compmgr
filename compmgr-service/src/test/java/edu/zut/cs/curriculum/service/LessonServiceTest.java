package edu.zut.cs.curriculum.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
* @author hyx
* @version 创建时间：2018年8月17日 上午10:25:08
* 类说明 测试
*/

@Transactional
@Rollback
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-dao.xml")
public class LessonServiceTest {

	@Autowired
	LessonService lessonService;
	
	@Test
	public void findAllTest() {
		
		lessonService.findAll();
	}
}
