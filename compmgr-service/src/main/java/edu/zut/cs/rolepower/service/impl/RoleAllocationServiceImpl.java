package edu.zut.cs.rolepower.service.impl;

import edu.zut.cs.rolepower.dao.RoleMapper;
import edu.zut.cs.rolepower.model.Role;
import edu.zut.cs.rolepower.service.RoleAllocationService;
import edu.zut.cs.user.model.Teacher;

import java.util.List;

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
	
	@Override
	public boolean isAlterName(Integer id,String roleName,String description) {
		
		return false;	
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

}
