package edu.zut.cs.admin.service;

import edu.zut.cs.admin.dao.CptLabMapper;
import edu.zut.cs.admin.model.CptLab;
import edu.zut.cs.tools.SumArray;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zouguo0212@
 * @Description:
 * @date: 2018/8/16 16:05
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-dao.xml")
public class ExampleServiceTest {

    @Autowired
    CptLabMapper cptLabMapper;

    @Test
    public void getOneComputerLabNumByIdTest(){
        Integer id = 5;
        CptLab cptLab = cptLabMapper.getComputerLabById(id);
        String result = cptLab.getRoomNum();
        System.out.println("结果是:"+result);
    }

    @Test
    public void getAllComputerLabNumTest(){
        List<CptLab> cptLabs = cptLabMapper.getAllComputerLab();
        List<String> result = new ArrayList<>();
        for (CptLab lab : cptLabs) {
            result.add(lab.getRoomNum());
        }
        System.out.println("所有roomNum："+result);
    }
    
    @Test
	public void toolsTest() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Integer result = new SumArray().sumArray(list );
		System.out.println(result);
	}
    
}
