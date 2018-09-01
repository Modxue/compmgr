package edu.zut.cs.rolepower.service.impl;

import edu.zut.cs.rolepower.dao.RoleMapper;
import edu.zut.cs.rolepower.model.Role;
import edu.zut.cs.rolepower.service.RoleService;
import edu.zut.cs.user.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author GZL
 * 2018年8月7日下午3:25:25
 */
@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleMapper roleMapper;


	// 查询所有角色
	@Override
	public List<Role> selectAll() {
		return roleMapper.selectAll();
	}

	// 根据角色id更改记录
	@Override
	public int update(Role role) {
		return roleMapper.update(role);
	}

	// 插入一条角色记录
	@Override
	public int insert(Role role) {
		if(roleMapper.selectByRoleName(role.getRoleName())>0){  // 判断是否存在同名角色
			return 2;  // 存在同名角色返回标志位2
		} else {
			return roleMapper.insert(role);
		}
	}

	// 查询角色下的教师
	@Override
	public List<Teacher> selectTeacher(Integer roleId) {
		return roleMapper.selectTeacher(roleId);
	}

	// 删除一条角色记录
	@Override
	public int delete(Integer roleId) {
		if (roleMapper.countTeacher(roleId)>0){
			return 2;
		} else {
			return roleMapper.delete(roleId);
		}
	}

	// 删除此角色下教师
	@Override
	public int deleteTeacher(Integer roleId, Integer teacherId) {
		return roleMapper.deleteTeacher(roleId,teacherId);
	}

	// 为此角色添加教师
	@Override
	public int insertTeacher(Integer roleId, Integer[] teacherIds) {
		for (Integer teacherId : teacherIds) {
			roleMapper.insertTeacher(roleId,teacherId);
		}
		return 1;
	}

}
