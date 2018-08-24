package edu.zut.cs.rolepower.service;

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
@ContextConfiguration(locations = "classpath*:applicationContext-dao.xml")
public class RoleAllocationServiceTest {
	
	@Autowired
	RoleAllocationService roleAllocationService;
	
	@Test
	public void findRoleNameTest() {
		String roleName=roleAllocationService.findRoleName();
		System.out.println(roleName);
	}

	@Test
	public void  selectNameTest(){
		boolean bool=roleAllocationService.isHaveSameName("普通管理员");
		System.out.println(bool);
	}

	@Test
	public void isAddRoleTest(){
		boolean b=roleAllocationService.isAddRole("111","2222");
		System.out.println(b);
	}
}
