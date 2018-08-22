package edu.zut.cs.admin.service.impl;

import edu.zut.cs.admin.service.ApplyRoomService;
import edu.zut.cs.curriculum.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author: zouguo0212@
 * @Description:
 * @date: 2018/8/15 10:46
 */
@Service
public class ApplyRoomServiceImpl implements ApplyRoomService {

    @Override
    public Integer findBestRoom(List<Integer> noRoomWeek, Map<Integer, String> week_RoomId_Map, Integer[] t_week, Integer t_day, Integer t_node) {
        return null;
    }

    @Override
    public Integer InsertBestMotor(Integer courseId, Map<Integer, String> week_roomId_map, Integer t_day, Integer t_node) {
        return null;
    }

    @Override
    public List<Integer> isRepat(Integer courseId, Integer[] week, Integer weekDay, Integer node) {
        return null;
    }

    @Override
    public Course getCourseById(Integer courseId) {
        return null;
    }
}
