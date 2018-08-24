package edu.zut.cs.rolepower.dao;

import edu.zut.cs.rolepower.model.Role;

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
}
