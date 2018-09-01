package edu.zut.cs.admin.dao;

import edu.zut.cs.admin.model.CptLab;

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
 * @author:fy0202
 * @Description:
 * @date: 2018-08-07 15:12
 */
@Transactional
@Rollback
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext-dao.xml")
public class CptLabTest {

	@Autowired
	CptLabMapper cptlabMapper;


	@Test
	public void getAllComputerLabTest(){
		List<CptLab> result = cptlabMapper.getAllComputerLab();
		for (CptLab lab : result) {
			System.out.println(lab);
		}
	}
	
	@Test
	public void daleteComputerLabByIdTest() {
		Integer id=2;
		Integer result = cptlabMapper.daleteComputerLabById(id);
		System.out.println(result);
	}
	
}