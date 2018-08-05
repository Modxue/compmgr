package edu.zut.cs.curriculum.model; 
/** 
* @author ymz 
*  创建时间：2018年8月4日 下午10:01:19 
* 类说明 创建课程安排实体类
*/
public class Arrange {
	private Integer id;
	//id
	private Integer courseId;
	//课程id
	private Integer teacherId;
	//老师id
	private String className;
	//班级名
	
public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public Integer getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}

    @Override
    public String toString() {
        return "Arrange{" +
                "id=" + id +
                ", courseId='" + courseId + '\'' +
                ", teacherId='" + teacherId + '\'' +
                ", className=" + className +
                '}';
	
}
    }
 