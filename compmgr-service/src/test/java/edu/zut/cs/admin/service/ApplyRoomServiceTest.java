package edu.zut.cs.admin.service;

import edu.zut.cs.admin.dao.ViewRecordMapper;
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
@ContextConfiguration(locations = "classpath:applicationContext-dao.xml")
public class ApplyRoomServiceTest {

    @Autowired
    ViewRecordMapper viewRecordMapper;

    @Test
    public void applyTest(){
        Integer week = 1;
        Integer weekDay = 2;
        Integer node = 3;
        Integer arrangeId = 5;
        if (viewRecordMapper.selectRecordCountByTime(arrangeId,week,weekDay,node) > 0){
            System.out.println("重复申请！");
        }
        List<Integer> freeRoomId = viewRecordMapper.selectFreeCptIdByTime(week,weekDay,node);
        System.out.println(freeRoomId);
    }


}
