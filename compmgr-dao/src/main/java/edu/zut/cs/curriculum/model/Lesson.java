package edu.zut.cs.curriculum.model;
/**
* @author hyx
* @version 创建时间：2018年8月5日 下午10:09:59
* 类说明  定义课表实体类
*/
public class Lesson {
	private Integer id;
	//id
	private Integer arrangeId;
	//课程安排id
    private String week;
    //课程授课周
    private Integer weekDay;
    //课程授课周几
    private Integer node;
    //授课节数
    private Integer isDoubleWeek;
    //是否双周
    private String roomNum;
    //课程授课教室

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
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
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
	public Integer getIsDoubleWeek() {
		return isDoubleWeek;
	}
	public void setIsDoubleWeek(Integer isDoubleWeek) {
		this.isDoubleWeek = isDoubleWeek;
	}
	public String getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}
	
	 @Override
	    public String toString() {
	        return "Lesson{" +
	                "id=" + id +
	                ", arrangeId=" + arrangeId + 
	                ", week=" + week +
	                ", weekDay=" + weekDay +
	                ", node=" + node +
	                ", isDoubleWeek=" + isDoubleWeek +
	                ", roomNum=" + roomNum + 
	                '}';
		
	}
	
}
