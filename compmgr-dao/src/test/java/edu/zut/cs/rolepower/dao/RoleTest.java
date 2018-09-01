package edu.zut.cs.rolepower.dao;

import edu.zut.cs.rolepower.model.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @packge_name: edu.zut.cs.rolepower.dao
 * @author: 薛二伟
 * @Description:
 * @Date: 2018/9/1 16:41
 */
@Transactional
@Rollback
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext-dao.xml")
public class RoleTest {

    @Autowired
    RoleMapper roleMapper;

    @Test
    public void test1(){
        List<Role> roles;
        roles=roleMapper.selectAll();
        System.out.println(roles);
    }

    @Test
    public void test2(){
        int a=roleMapper.delete(1);
        System.out.println(a);
    }
}
