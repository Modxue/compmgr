package edu.zut.cs.admin.dao;

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
 * @package_name edu.zut.cs.admin.dao
 * @description
 * @date 2018/8/29 11:15
 */
@Rollback
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-dao.xml")
public class ViewRecordTest {

    @Autowired
    ViewRecordMapper viewRecordMapper;

    @Test
    public void selectViewRecordByRecordIdTest(){

        ViewRecord viewRecord = viewRecordMapper.selectViewRecordByRecordId(25);
        System.out.println("结果："+viewRecord);

    }

    @Test
    public void selectViewRecordByUserNumAndTimeLimitTest(){
        List<ViewRecord> viewRecordList = viewRecordMapper.selectViewRecordByUserNumAndTimeLimit("3857",1);
        for (ViewRecord record : viewRecordList) {
            System.out.println(record);
        }
    }

}
