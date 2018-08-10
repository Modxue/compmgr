
package edu.zut.cs.user.model;
/**
 * @author houjie
 * @Description:
 * @data:2018/8/3 13:28
 */
public class Teacher{
	private Integer id;
	private String teacherNum;
	private String teacherName;
	private String teacherEmail;
	private String passWord;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id=id;
	}

    public String getTeacherEmail() {
		return teacherEmail;
	}

	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}

	public String getPassword() {
		return passWord;
	}

	public void setPassword(String passWord) {
		this.passWord = passWord;
	}

	public String getTeacherNum() {
    	return teacherNum;
    }
    
    public void setTeacherNum(String teacherNum) {
    	this.teacherNum=teacherNum;
    }
    
    public String getTeacherName() {
    	return teacherName;
    }
    
    public void setTeacherName(String teacherName) {
    	this.teacherName=teacherName;
    }
    
    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", teacherNum='" + teacherNum + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", teacher=" + teacherEmail +
                ", passWord=" + passWord +
				'}';
	}
}
