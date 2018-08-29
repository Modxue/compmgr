package edu.zut.cs.admin.service;

import edu.zut.cs.admin.model.ViewRecord;

import java.util.List;

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

}
