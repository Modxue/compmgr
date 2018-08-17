package edu.zut.cs.curriculum.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/** 
* @author ymz 
*  创建时间：2018年8月12日 下午8:58:05 
* 类说明 
*/

@Transactional
@Rollback
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext-dao.xml")
public class ArrangeServiceTest {
	
	@Autowired
	ArrangeService arrangeService;
	
	@Test
	public void findAllTest() {
	
		arrangeService.findAll();
	}
}
 