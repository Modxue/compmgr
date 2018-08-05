package edu.zut.cs.curriculum.model; 
/** 
* @author ymz 
*  创建时间：2018年8月4日 下午9:24:31 
* 类说明 定义课程实体类
*/
public class Course {
	private Integer id;
	//id
	private String courseNum;
	//课程编号
	private String courseName;
	//课程名
	private Integer period;
	//学时
	private Integer credit;
	//学分

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourseNum() {
		return courseNum;
	}
	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Integer getPeriod() {
		return period;
	}
	public void setPeriod(Integer period) {
		this.period = period;
	}
	public Integer getCredit() {
		return credit;
	}
	public void setCredit(Integer credit) {
		this.credit = credit;
	}
    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseNum='" + courseNum + '\'' +
                ", courseName='" + courseName + '\'' +
                ", period=" + period +
                ", credit=" + credit +
                '}';
}
}
 