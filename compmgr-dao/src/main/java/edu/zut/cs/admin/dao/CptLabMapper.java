package edu.zut.cs.admin.dao;

import edu.zut.cs.admin.model.CptLab;

/**
 * @PackageName: edu.zut.cs.admin.dao
 * @author:zouguo0212
 * @Description:
 * @Date: 2018/8/3 23:35
 */
public interface CptLabMapper {
    /**
     * 根据id获得机房
     * @return
     */
//    public CptLab getComputerLabById();

	public CptLab getComputerLabById(Integer i);
}
