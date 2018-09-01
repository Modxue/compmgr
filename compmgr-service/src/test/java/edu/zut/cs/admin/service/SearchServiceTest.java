package edu.zut.cs.admin.service;

import edu.zut.cs.admin.dao.ViewRecordMapper;
import edu.zut.cs.admin.model.ViewRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * create_by Intellij IDEA
 *
 * @author zouguo0212@
 * @package_name edu.zut.cs.admin.service
 * @description
 * @date 2018/8/29 18:34
 */
@Transactional
@Rollback
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-dao.xml")
public class SearchServiceTest {

    @Autowired
    ViewRecordMapper viewRecordMapper;

    @Test
    public void getApplyRecordByUserNumTest(){
        List<ViewRecord> viewRecordList = viewRecordMapper.selectViewRecordByUserNumAndTimeLimit("3857",2);
        for (ViewRecord record : viewRecordList) {
            System.out.println(record);
        }
    }

    @Test
    public void getHistoryRecordByUserNumTest(){
        List<ViewRecord> viewRecordList = viewRecordMapper.selectViewRecordByUserNumAndTimeLimit("3857",0);
        for (ViewRecord record : viewRecordList) {
            System.out.println(record);
        }
    }

}
