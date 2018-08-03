package edu.zut.cs.rolepower.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.rolepower.dao.RoleMapper;
import edu.zut.cs.rolepower.service.RoleAllocationService;

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
	

}
