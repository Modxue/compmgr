package edu.zut.cs.admin.service;

/**
 * create_by Intellij IDEA
 *
 * @author zouguo0212@
 * @package_name edu.zut.cs.admin.service
 * @description
 * @date 2018/9/1 17:40
 */
public interface AdjustService {

    Integer retreatRoom(Integer id);

    /**
     * 调换机房 将指定Rec—id的机房调换至roomId
     * @param id
     * @param roomId
     * @return
     */
    Integer changeRoom(Integer id,Integer roomId);
}
