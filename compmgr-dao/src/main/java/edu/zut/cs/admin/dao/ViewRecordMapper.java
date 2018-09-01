package edu.zut.cs.admin.dao;

import edu.zut.cs.admin.model.CptLab;
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

    Integer selectRecordCountByTime(@Param("arrangeId")Integer arrangeId,
                                    @Param("week")Integer week,
                                    @Param("weekDay")Integer weekDay,
                                    @Param("node")Integer node);

    List<Integer> selectFreeCptIdByTime(@Param("week")Integer week,
                                        @Param("weekDay")Integer weekDay,
                                        @Param("node")Integer node);

    List<ViewRecord> selectViewRecordByWeekAndWeekDay(@Param("week")Integer week,@Param("weekDay")Integer weekDay);
}
