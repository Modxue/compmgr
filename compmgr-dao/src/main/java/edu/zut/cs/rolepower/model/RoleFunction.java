package edu.zut.cs.rolepower.model;

/**
 * @author GZL
 * 2018年8月6日上午10:25:34
 */
public class RoleFunction {
	//角色权限的id
	private int id;
	//角色的id
	private int roleId;
	//权限方法id
	private int functionId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getFunctionId() {
		return functionId;
	}
	public void setFunctionId(int functionId) {
		this.functionId = functionId;
	}
	@Override
	public String toString() {
		return "RoleFunction [id=" + id + ", roleid=" + roleId + ", functionid=" + functionId + "]";
	}
	
}
