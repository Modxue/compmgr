package edu.zut.cs.rolepower.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author UML
 *
 */

@Transactional
@Rollback
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext-dao.xml")
public class RoleTest {

	@Autowired
	RoleMapper roleMapper;
	
	@Test
	public void getDescriptionByIdTest() {
		String description = roleMapper.getDescriptionById(2);
		System.out.println(description);
	}

	@Test
	public void selectAllSameNameTest(){
		Integer test=roleMapper.selectAllSameName("fsf");
		System.out.println(test);
	}
	
}
