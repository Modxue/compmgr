package edu.zut.cs.rolepower.service;

import edu.zut.cs.rolepower.model.Role;
import edu.zut.cs.user.model.Teacher;

import java.util.List;

/**
 * @author GZL
 * 2018年8月7日下午3:20:18
 */

public interface RoleService {

	// 查询所有角色
	List<Role> selectAll();

	// 根据角色id更改记录
	int update(Role role);

	// 插入一条角色记录
	int insert(Role role);

	// 查询角色下的教师
	List<Teacher> selectTeacher(Integer roleId);

	// 删除一条角色记录
	int delete(Integer roleId);

	// 为此角色添加教师
	int insertTeacher(Integer roleId, Integer[] teacherId);

	// 删除此角色下教师
	int deleteTeacher(Integer roleId, Integer teacherId);

}
