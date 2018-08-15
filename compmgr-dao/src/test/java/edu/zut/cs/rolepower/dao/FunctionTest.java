package edu.zut.cs.rolepower.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author GZL
 * 2018年8月7日下午3:33:53
 */
	@Transactional
	@Rollback
	@RunWith(SpringJUnit4ClassRunner.class)
	@ContextConfiguration(locations = "classpath*:applicationContext-dao.xml")
	public class FunctionTest {
		@Autowired
		FunctionMapper functionMapper;
		
		@Test
		public void getFunctionByIdTest() {
			String function = functionMapper.getFunctionById(2);
			System.out.println(function);
		}
}