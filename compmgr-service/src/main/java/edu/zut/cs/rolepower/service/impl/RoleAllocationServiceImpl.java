package edu.zut.cs.rolepower.service.impl;

import edu.zut.cs.rolepower.dao.RoleMapper;
import edu.zut.cs.rolepower.model.Role;
import edu.zut.cs.rolepower.service.RoleAllocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleAllocationServiceImpl implements RoleAllocationService {

	@Autowired
	RoleMapper roleMapper;

	@Override
	public String findRoleName() {
		// TODO Auto-generated method stub
		String roleName = roleMapper.getRoleNameById(1);
		return roleName;
	}

	@Override
	public boolean isHaveSameName(String roleName) {
		if (roleMapper.selectAllSameName(roleName)>0)
			return true;
		return false;
	}

	@Override
	public boolean isAddRole(String roleName,String description){
		Role role = new Role();
		role.setRoleName(roleName);
		role.setDescription(description);
		if (roleMapper.insertRole(role)==1)
			return true;
		return false;
	}
}
