package edu.zut.cs.admin.model;

import java.util.Date;

/**
 * @PackageName: edu.zut.cs.admin.model
 * @author:zouguo0212
 * @Description: 记录表对应实体类
 * @Date: 2018/8/3 23:43
 */
public class Record {

//    唯一标识Id
    private Integer id;
//    课程安排表Id
    private Integer arrangeId;
//    机房Id
    private Integer labId;
//    周次
    private Integer week;
//    周几
    private Integer weekDay;
//    节次
    private Integer node;
//    申请日期
    private Date applyDate;

    private Date classDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArrangeId() {
        return arrangeId;
    }

    public void setArrangeId(Integer arrangeId) {
        this.arrangeId = arrangeId;
    }

    public Integer getLabId() {
        return labId;
    }

    public void setLabId(Integer labId) {
        this.labId = labId;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public Integer getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(Integer weekDay) {
        this.weekDay = weekDay;
    }

    public Integer getNode() {
        return node;
    }

    public void setNode(Integer node) {
        this.node = node;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public Date getClassDate() {
        return classDate;
    }

    public void setClassDate(Date classDate) {
        this.classDate = classDate;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", arrangeId=" + arrangeId +
                ", labId=" + labId +
                ", week=" + week +
                ", weekDay=" + weekDay +
                ", node=" + node +
                ", applyDate=" + applyDate +
                ", classDate=" + classDate +
                '}';
    }
}
