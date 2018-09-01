package edu.zut.cs.rolepower.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName FunctionServiceTest
 * @Author 陈云磊
 * @Date 2018/8/27 21:19
 * @Description
 * @Version 1.0
 **/
@Rollback
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-dao.xml")
public class FunctionServiceTest {

    @Autowired
    //FunctionService functionService;

    @Test
    public void updateByRole(){
        Integer[] tmp = {1,2,3};
       // functionService.updateByRole(3,tmp);
        System.out.println("s");
    }

}
