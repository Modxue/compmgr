package edu.zut.cs.admin.dao;

import java.util.List;

import edu.zut.cs.admin.model.CptLab;
import edu.zut.cs.admin.model.Record;
import org.apache.ibatis.annotations.Param;

/**
 * @PackageName: edu.zut.cs.admin.dao
 * @author:zouguo0212
 * @Description:
 * @Date: 2018/8/3 23:42
 */
public interface RecordMapper {
	
	List<Record> getAllRecord();
	
	Integer insertRecord(@Param("recordList") List<Record> record);
	
	Integer deleteRecord(Integer id);
	
	Integer changeRoom(@Param("id")Integer id,@Param("labId")Integer labId);
}
