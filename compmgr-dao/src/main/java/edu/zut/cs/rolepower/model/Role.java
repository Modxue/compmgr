package edu.zut.cs.rolepower.model;

/**
 * 
 * @author UML
 *
 */
public class Role {
	private Integer id;
	//
	private String roleName;
	//权限名称
	private String description;
	//权限描述
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "RolePower [id=" + id + ", roleName=" + roleName + ", description=" + description + "]";
	}
			
}
