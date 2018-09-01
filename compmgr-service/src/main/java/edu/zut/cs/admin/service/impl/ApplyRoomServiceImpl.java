package edu.zut.cs.admin.service.impl;

import edu.zut.cs.admin.dao.RecordMapper;
import edu.zut.cs.admin.dao.ViewRecordMapper;
import edu.zut.cs.admin.model.Record;
import edu.zut.cs.admin.service.ApplyRoomService;
import edu.zut.cs.curriculum.dao.ViewLessonMapper;
import edu.zut.cs.curriculum.model.Course;
import edu.zut.cs.curriculum.model.ViewLesson;
import edu.zut.cs.tools.ClassDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author: zouguo0212@
 * @Description:
 * @date: 2018/8/15 10:46
 */
@Service
public class ApplyRoomServiceImpl implements ApplyRoomService {

    @Autowired
    ViewRecordMapper viewRecordMapper;

    @Autowired
    RecordMapper recordMapper;

    @Autowired
    ViewLessonMapper viewLessonMapper;

    @Override
    public Integer ApplyRoom(Integer lessonId, Integer week) {

        ViewLesson viewLesson = viewLessonMapper.selectByLessonId(lessonId);
        Integer arrangeId = viewLesson.getArrangeId();
        Integer weekDay = viewLesson.getWeekDay();
        Integer node = viewLesson.getNode();
        if (viewRecordMapper.selectRecordCountByTime(arrangeId,week,weekDay,node) > 0){
//            重复申请
            return 3;
        }
        List<Integer> freeRoomId = viewRecordMapper.selectFreeCptIdByTime(week,weekDay,node);
        if (freeRoomId.isEmpty()){
//            当前无可用机房
            return 2;
        }
        Record record = new Record();
        record.setLabId(freeRoomId.get(0));
        record.setNode(node);
        record.setWeekDay(weekDay);
        record.setWeek(week);
        record.setArrangeId(arrangeId);
        record.setApplyDate(new Date());
        record.setClassDate(new ClassDate().getClassDate(week,weekDay).getTime());
        List<Record> recordList = new ArrayList<>();
        recordList.add(record);
        if(recordMapper.insertRecord(recordList) == 1)
        {
//            申请成功
            return 1;
        }
        return 0;
    }

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
