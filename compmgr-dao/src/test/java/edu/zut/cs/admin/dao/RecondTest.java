package edu.zut.cs.admin.dao;

import edu.zut.cs.admin.dao.RecordMapper;
import edu.zut.cs.admin.model.Record;
import edu.zut.cs.tools.SumArray;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author:fy0202
 * @Description:
 * @date: 2018-08-05 11:12
 */
@Transactional
@Rollback
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext-dao.xml")
public class RecondTest {

	@Autowired
	RecordMapper recordMapper;

	@Test
	public void getAllRecordTest() {
		List<Record> resultList = recordMapper.getAllRecord();
		for (Record record : resultList) {
			System.out.println(record);
		}
	}


}