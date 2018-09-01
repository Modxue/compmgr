package edu.zut.cs.rolepower.dao;

import java.util.List;

import edu.zut.cs.rolepower.model.Role;
import edu.zut.cs.user.model.Teacher;
import org.springframework.stereotype.Repository;

/**
 * @author GZL
 * 2018年8月7日下午3:16:15
 */

@Repository
public interface RoleMapper {

	//插入一条角色信息
	public Integer insert(Role role);

	//通过角色名字查询同名数量
	public Integer selectByRoleName(String roleName);

	// 查询所有角色
	List<Role> selectAll();

	// 根据角色id更改记录
	int update(Role role);

    // 查询角色下的教师
    List<Teacher> selectTeacher(Integer roleId);

    // 查询角色下是否存在教师
    int countTeacher(Integer roleId);

    // 删除一条角色记录
    int delete(Integer roleId);

	// 为此角色添加教师
	int insertTeacher(Integer roleId, Integer teacherId);

	// 删除此角色下教师
	int deleteTeacher(Integer roleId, Integer teacherId);
}