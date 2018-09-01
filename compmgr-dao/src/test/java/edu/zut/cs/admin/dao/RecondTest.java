package edu.zut.cs.admin.dao;

import edu.zut.cs.admin.model.Record;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author:fy0202
 * @Description:
 * @date: 2018-08-05 11:12
 */
@Transactional
@Rollback
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-dao.xml")
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

	@Test
	public void insertRecordTest(){
		Record record = new Record();
		record.setArrangeId(3);
		record.setLabId(10);
		record.setWeek(4);
		record.setWeekDay(5);
		record.setNode(2);
		record.setApplyDate(new Date());
		List<Record> recordList = new ArrayList<>();
		recordList.add(record);
		recordMapper.insertRecord(recordList);
	}
	@Test
	public void deleteRecordTest() {
		int a=recordMapper.deleteRecord(2);
		System.out.println(a);
	}
	
	@Test
	public void changeRoomTest() {
		int a=recordMapper.changeRoom(56, 5);
		System.out.println(a);
	}


}