package edu.zut.cs.login.service;

import edu.zut.cs.user.model.Teacher;

import java.util.List;

/**
 * @packge_name: edu.zut.cs.login.service
 * @author: 薛二伟
 * @Description:
 * @Date: 2018/8/4 20:19
 */
public interface LoginService {

    boolean isTruePassword(Integer teacherId,String password);

    List<Teacher> getAllTeacherInfo();

}
