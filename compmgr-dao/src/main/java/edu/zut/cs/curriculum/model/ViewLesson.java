package edu.zut.cs.curriculum.model;


import edu.zut.cs.tools.NowWeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * create_by Intellij IDEA
 *
 * @author zouguo0212@
 * @package_name edu.zut.cs.curriculum.model
 * @description
 * @date 2018/8/29 14:55
 */
public class ViewLesson {
    private Integer lessonId;

    private Integer arrangeId;

    private String weekStr;

    private Integer[] weekArr;

    private Integer weekDay;

    private Integer node;

    private Integer isDoubleWeek;

    private Integer courseId;

    private String courseName;

    private String className;

    private String teacherName;

    private String teacherNum;

    private Integer teacherId;

    public Integer getLessonId() {
        return lessonId;
    }

    public void setLessonId(Integer lessonId) {
        this.lessonId = lessonId;
    }

    public Integer getArrangeId() {
        return arrangeId;
    }

    public void setArrangeId(Integer arrangeId) {
        this.arrangeId = arrangeId;
    }

    public String getWeekStr() {
        return weekStr;
    }

    public Integer[] getWeekArr() {
        return weekArr;
    }

    public void setWeekArr(Integer[] weekArr) {
        this.weekArr = weekArr;
    }

    public void setWeekStr(String weekStr) {
        this.weekStr = weekStr == null ? null : weekStr.trim();
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

    public Integer getIsDoubleWeek() {
        return isDoubleWeek;
    }

    public void setIsDoubleWeek(Integer isDoubleWeek) {
        this.isDoubleWeek = isDoubleWeek;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String getTeacherNum() {
        return teacherNum;
    }

    public void setTeacherNum(String teacherNum) {
        this.teacherNum = teacherNum == null ? null : teacherNum.trim();
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public void initWeekArr(){
        Integer nowWeek = new NowWeek().getNowWeek();
        String [] strings = this.weekStr.split(",");
        List<Integer> tempList = new ArrayList<>();
        for (String s : strings) {
            if(Integer.valueOf(s) >= nowWeek) {
                tempList.add(Integer.valueOf(s));
            }
        }
        this.weekArr = tempList.toArray(new Integer[0]);
    }


    @Override
    public String toString() {
        return "ViewLesson{" +
                "lessonId=" + lessonId +
                ", arrangeId=" + arrangeId +
                ", weekStr='" + weekStr + '\'' +
                ", weekArr=" + Arrays.toString(weekArr) +
                ", weekDay=" + weekDay +
                ", node=" + node +
                ", isDoubleWeek=" + isDoubleWeek +
                ", courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", className='" + className + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", teacherNum='" + teacherNum + '\'' +
                ", teacherId=" + teacherId +
                '}';
    }
}