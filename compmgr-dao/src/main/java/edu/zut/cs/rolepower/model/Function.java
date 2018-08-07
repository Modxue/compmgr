package edu.zut.cs.rolepower.model;

/**
 * @author GZL
 * 2018年8月6日上午10:28:55
 */
public class Function {
	private Integer id;
	private String function;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	@Override
	public String toString() {
		return "Function [id=" + id + ", function=" + function + "]";
	}
	
}
