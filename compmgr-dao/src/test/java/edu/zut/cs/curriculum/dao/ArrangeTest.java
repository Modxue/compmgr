package edu.zut.cs.curriculum.dao;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import edu.zut.cs.curriculum.model.Arrange;


import java.util.List;

/**
 * @author: ymz
 * @Description:
 * @date: 2018/8/2 17:57
 */
@Transactional
@Rollback
@RunWith(SpringJUnit4ClassRunner.class)//测试运行在spring环境中
@ContextConfiguration(locations = "classpath*:applicationContext-dao.xml")
public class ArrangeTest {

    @Autowired
    ArrangeMapper arrangeMapper;

    @Test
    public void getAllArrangeTest(){
        List<Arrange> resultList = arrangeMapper.getAllArrange();
        for (Arrange arrange : resultList) {
            System.out.println(arrange);
        }
//        System.out.println(resultList);
    }
}
