package edu.zut.cs.admin.service.impl;

import edu.zut.cs.admin.dao.RecordMapper;
import edu.zut.cs.admin.service.AdjustService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * create_by Intellij IDEA
 *
 * @author zouguo0212@
 * @package_name edu.zut.cs.admin.service.impl
 * @description
 * @date 2018/9/1 17:40
 */
@Service
public class AdjustServiceImpl implements AdjustService {

	@Autowired
	RecordMapper recordMapper;
	
    @Override
    public Integer retreatRoom(Integer id) {
    	if(recordMapper.deleteRecord(id)==1)
    		return 1;
        return 0;
    }

    @Override
    public Integer changeRoom(Integer id, Integer roomId) {
    	if(recordMapper.changeRoom(id, roomId)==1)
    		return 1;
        return 0;
    }
}
