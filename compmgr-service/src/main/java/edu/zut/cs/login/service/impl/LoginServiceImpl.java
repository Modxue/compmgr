package edu.zut.cs.login.service.impl;

import edu.zut.cs.login.service.LoginService;
import edu.zut.cs.user.dao.TeacherMapper;
import edu.zut.cs.user.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @packge_name: edu.zut.cs.login.service.impl
 * @author: 薛二伟
 * @Description:
 * @Date: 2018/8/4 20:20
 */
@Service
public class LoginServiceImpl implements LoginService {


    @Autowired
    TeacherMapper teacherMapper;

    /**
     *
     * @param password
     * @param teacherNum
     * @return
     */
    @Override
    public boolean isTruePassword(String teacherId,String password) {
    	Integer tId=Integer.valueOf(teacherId);
        if (password.equals(teacherMapper.getPasswordById(tId)))
            return true;
        return false;
    }

    @Override
    public List<Teacher> getAllTeacherInfo() {
        return teacherMapper.getAllTeacher();
    }


}
