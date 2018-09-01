package edu.zut.cs.admin.service;

/**
 * create_by Intellij IDEA
 *
 * @author zouguo0212@
 * @package_name edu.zut.cs.admin.service
 * @description
 * @date 2018/9/1 16:25
 */
public interface CptLabService {

    /**
     * 修改指定id的机房信息
     * @param id
     * @param priority
     * @param amount
     * @return
     */
    Integer updateCptLabInfo(Integer id,Integer priority,Integer amount);

    /**
     * 增加一个新机房
     * @param roomNum
     * @param priority
     * @param amount
     * @return
     */
    Integer createCptLab(String roomNum,Integer priority,Integer amount);

    /**
     * 删除指定id的机房记录
     * @param id
     * @return
     */
    Integer deleteCptLab(Integer id);
}
