package edu.zut.cs.admin.dao;

import edu.zut.cs.admin.model.ViewRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * create_by Intellij IDEA
 *
 * @author zouguo0212@
 * @package_name edu.zut.cs.admin.dao
 * @description
 * @date 2018/8/29 11:02
 */
public interface ViewRecordMapper {

    ViewRecord selectViewRecordByRecordId(@Param("recordId") Integer id);

    List<ViewRecord> selectViewRecordByUserNumAndTimeLimit(@Param("userNum")String userNum,@Param("limit")Integer limit);
}
