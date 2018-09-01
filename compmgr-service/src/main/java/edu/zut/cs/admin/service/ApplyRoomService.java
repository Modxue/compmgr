package edu.zut.cs.admin.service;

import edu.zut.cs.curriculum.model.Course;

import java.util.List;
import java.util.Map;

/**
 * @author: zouguo0212@
 * @Description:
 * @date: 2018/8/15 10:46
 */
public interface ApplyRoomService {


    Integer ApplyRoom(Integer lessonId,Integer week);

    /**
     * 功能：找寻机房，返回一个状态标志
     * @param noRoomWeek 没有机房的周次
     * @param week_RoomId_Map 周次——roomId 映射  存储结果
     * @param t_week 申请的周次 是一个数组
     * @param t_day 申请的天
     * @param t_node 申请的节次
     * @return 返回一个状态标志 flag
     */

    Integer findBestRoom(List<Integer> noRoomWeek, Map<Integer,String> week_RoomId_Map, Integer[] t_week, Integer t_day, Integer t_node);

    /**
     * 功能：插入一条记录
     * @param courseId 需要返给前台一个courseId
     * @param week_roomId_map 结果集
     * @param t_day 申请的天
     * @param t_node 申请的节次
     * @return 返回一个状态标志 flag
     */

    Integer InsertBestMotor(Integer courseId, Map<Integer,String> week_roomId_map, Integer t_day, Integer t_node);

    /**
     * 功能：判断当前申请周次是否重复申请
     * @param courseId 需要返给前台一个courseId
     * @param week 申请的日期
     * @param weekDay 申请的日期
     * @param node 申请的日期
     * @return 返回一个重复申请周次的集合
     */

    List<Integer> isRepat(Integer courseId,Integer[] week,Integer weekDay,Integer node);

    /**
     * 功能：根据courseId得到课程信息
     * @param courseId
     * @return 返回一个Course信息
     */
    Course getCourseById(Integer courseId);
}
