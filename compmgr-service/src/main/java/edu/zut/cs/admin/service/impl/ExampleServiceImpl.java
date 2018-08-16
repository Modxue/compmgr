package edu.zut.cs.admin.service.impl;

import edu.zut.cs.admin.dao.CptLabMapper;
import edu.zut.cs.admin.model.CptLab;
import edu.zut.cs.admin.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zouguo0212@
 * @Description:
 * @date: 2018/8/16 15:44
 */
@Service
public class ExampleServiceImpl implements ExampleService {

    @Autowired
    CptLabMapper cptLabMapper;

    /**
     * 得到所有机房号
     * @return
     */
    @Override
    public List<String> getAllComputerLabNumber() {
        /**
         * 为了演示业务逻辑
         * 这是得到所有机房信息之后再抽取机房号，其实可以直接从数据库里查所有机房号
         */
        List<CptLab> cptLabs = cptLabMapper.getAllComputerLab();
        List<String> result = new ArrayList<>();
        for (CptLab lab : cptLabs) {
            result.add(lab.getRoomNum());
        }
        return result;
    }

    @Override
    public String getOneComputerLabNumberById(Integer id) {
        CptLab cptLab = cptLabMapper.getComputerLabById(id);
        String result = cptLab.getRoomNum();
        return result;
    }
}
