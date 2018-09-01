package edu.zut.cs.admin.service.impl;

import edu.zut.cs.admin.dao.CptLabMapper;
import edu.zut.cs.admin.dao.ViewRecordMapper;
import edu.zut.cs.admin.model.CptLab;
import edu.zut.cs.admin.model.ViewRecord;
import edu.zut.cs.admin.service.SearchService;
import edu.zut.cs.tools.NowWeek;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * create_by Intellij IDEA
 *
 * @author zouguo0212@
 * @package_name edu.zut.cs.admin.service.impl
 * @description
 * @date 2018/8/29 18:19
 */
@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    ViewRecordMapper viewRecordMapper;

    @Autowired
    CptLabMapper cptLabMapper;


    /**
     * 查询到从当前周开始之后的申请记录(包括当前周)
     * @param userNum
     * @return
     */
    @Override
    public List<ViewRecord> getApplyRecordByUserNum(String userNum) {
        List<ViewRecord> viewRecordList = viewRecordMapper.selectViewRecordByUserNumAndTimeLimit(userNum,new NowWeek().getNowWeek());
        return viewRecordList;
    }

    /**
     * 查询所有申请记录
     * @param userNum
     * @return
     */
    @Override
    public List<ViewRecord> getHistoryRecordByUserNum(String userNum) {
        List<ViewRecord> viewRecordList = viewRecordMapper.selectViewRecordByUserNumAndTimeLimit(userNum,1);
        return viewRecordList;
    }

    /**
     * 得到所有机房
     * @return
     */
    @Override
    public List<CptLab> getAllComputerRoom() {
        return cptLabMapper.getAllComputerLab();
    }

    @Override
    public Map<String,Object> getApplyRecordByTime(Integer week, Integer weekDay) {
        List<ViewRecord> recordList = viewRecordMapper.selectViewRecordByWeekAndWeekDay(week,weekDay);
        List<CptLab> roomList = cptLabMapper.getAllComputerLab();
        Map<String,Object> map = new HashMap<>();
        map.put("recordList",recordList);
        map.put("roomList",roomList);
        return map;
    }

    @Override
    public List<CptLab> getFreeRoomByTime(Integer week, Integer weekDay, Integer node) {
        return cptLabMapper.selectFreeCptLabByTime(week,weekDay,node);
    }
}
