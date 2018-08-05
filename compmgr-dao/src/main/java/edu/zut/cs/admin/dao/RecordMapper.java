package edu.zut.cs.admin.dao;

import java.util.List;

import edu.zut.cs.admin.model.Record;

/**
 * @PackageName: edu.zut.cs.admin.dao
 * @author:zouguo0212
 * @Description:
 * @Date: 2018/8/3 23:42
 */
public interface RecordMapper {
	
	public List<Record> getAllRecord();
	
	public Integer getArrangeIdById(Integer id);
}
