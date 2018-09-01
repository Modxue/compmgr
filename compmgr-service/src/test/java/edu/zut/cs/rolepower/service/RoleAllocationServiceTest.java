package edu.zut.cs.rolepower.service;

import edu.zut.cs.rolepower.model.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Rollback
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext-dao.xml")
public class RoleAllocationServiceTest {
	
	@Autowired
	RoleAllocationService roleAllocationService;
	
	@Test
	public void test1(){
		List<Role> roles;
		roles=roleAllocationService.selectAll();
		System.out.println(roles);
	}
}
