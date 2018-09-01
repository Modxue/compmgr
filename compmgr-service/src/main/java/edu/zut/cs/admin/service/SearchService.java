package edu.zut.cs.admin.service;

import edu.zut.cs.admin.model.CptLab;
import edu.zut.cs.admin.model.ViewRecord;

import java.util.List;
import java.util.Map;

/**
 * create_by Intellij IDEA
 *
 * @author zouguo0212@
 * @package_name edu.zut.cs.admin.service
 * @description
 * @date 2018/8/29 18:18
 */
public interface SearchService {

    List<ViewRecord> getApplyRecordByUserNum(String userNum);

    List<ViewRecord> getHistoryRecordByUserNum(String userNum);

    List<CptLab> getAllComputerRoom();

    Map<String,Object> getApplyRecordByTime(Integer week, Integer weekDay);

    List<CptLab> getFreeRoomByTime(Integer week,Integer weekDay,Integer node);

}
