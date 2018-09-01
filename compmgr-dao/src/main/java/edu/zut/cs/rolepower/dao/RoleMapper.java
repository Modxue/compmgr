package edu.zut.cs.rolepower.dao;

import java.util.List;

import edu.zut.cs.rolepower.model.Role;
import edu.zut.cs.user.model.Teacher;

/**
 * 
 * @author UML
 *
 */

public interface RoleMapper {
	
	public String getDescriptionById(Integer id);
	
	public String getRoleNameById(Integer id);

	//插入一条角色信息
	public Integer insertRole(Role role);

	//通过角色名字查询同名数量
	public Integer selectAllSameName(String roleName);
	
	/**
	 * @author GZL
	 * 2018年8月7日下午3:16:15
	 */
    // 查询角色下的教师
    List<Teacher> selectTeacher(Integer roleId);

    // 查询角色下是否存在教师
    int countTeacher(Integer roleId);

    // 删除一条角色记录
    int delete(Integer roleId);
}