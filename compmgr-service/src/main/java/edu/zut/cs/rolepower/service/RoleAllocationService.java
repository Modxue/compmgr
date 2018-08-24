package edu.zut.cs.rolepower.service;

public interface RoleAllocationService {
	
	public String findRoleName();

	//判断是否有重复的角色名
	boolean isHaveSameName(String roleName);

	//添加一个角色信息
	boolean isAddRole(String roleName,String description);
}
