package edu.zut.cs.admin.model;

/**
 * @author: zouguo0212@
 * @Description:
 * @date: 2018/8/2 17:52
 */
public class Course {
    private Integer id;
    private String courseNum;
    private String courseName;
    private Integer period;
    private Integer credit;

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
