package edu.zut.cs.admin.model;

/**
 * @PackageName: edu.zut.cs.admin.model
 * @author:zouguo0212
 * @Description:
 * @Date: 2018/8/3 23:36
 */
public class CptLab {
//    唯一标识
    Integer id;
//    房间号
    String roomNum;
//    座位数
    Integer amount;
//    优先级
    Integer priority;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "CptLab{" +
                "id=" + id +
                ", roomNum='" + roomNum + '\'' +
                ", amount=" + amount +
                ", priority=" + priority +
                '}';
    }
}
