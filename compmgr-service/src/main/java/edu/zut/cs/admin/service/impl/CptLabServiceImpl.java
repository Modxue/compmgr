package edu.zut.cs.admin.service.impl;

import edu.zut.cs.admin.dao.CptLabMapper;
import edu.zut.cs.admin.service.CptLabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * create_by Intellij IDEA
 *
 * @author zouguo0212@
 * @package_name edu.zut.cs.admin.service.impl
 * @description
 * @date 2018/9/1 16:26
 */
@Service
public class CptLabServiceImpl implements CptLabService {

    @Autowired
    CptLabMapper cptLabMapper;


    /**
     * 修改指定id的机房信息
     * @param id
     * @param priority
     * @param amount
     * @return 成功返回1 否则返回0
     */
    @Override
    public Integer updateCptLabInfo(Integer id, Integer priority, Integer amount) {
    	Integer result=cptLabMapper.updateComputerLabInfo(id, priority, amount);
    	if(result==1)
    		return 1;
        return 0;
    }

    /**
     * 增加一个新机房
     * @param roomNum
     * @param priority
     * @param amount
     * @return 成功返回1 否则返回0
     */
    @Override
    public Integer createCptLab(String roomNum, Integer priority, Integer amount) {

    	Integer result =cptLabMapper.insertComputerLab(roomNum, priority, amount);
    	if(result==1)
    		return 1;
        return 0;
    }

    /**
     * 删除指定id的机房记录
     * @param id
     * @return 成功返回1 否则返回0
     */
    @Override
    public Integer deleteCptLab(Integer id) {
    	Integer result=cptLabMapper.deleteComputerLabById(id);
    	if(result==1)
    		return 1;
    	else
    		return 0;
    }
}
