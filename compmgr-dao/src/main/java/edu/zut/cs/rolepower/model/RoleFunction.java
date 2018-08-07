package edu.zut.cs.rolepower.model;

/**
 * @author GZL
 * 2018年8月6日上午10:25:34
 */
public class RoleFunction {
	//角色权限的id
	private int id;
	//角色的id
	private int roleid;
	//权限方法id
	private int functionid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	public int getFunctionid() {
		return functionid;
	}
	public void setFunctionid(int functionid) {
		this.functionid = functionid;
	}
	@Override
	public String toString() {
		return "RoleFunction [id=" + id + ", roleid=" + roleid + ", functionid=" + functionid + "]";
	}
	
}
