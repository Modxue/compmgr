package edu.zut.cs.admin.service;


import java.util.List;

/**
 * @author: zouguo0212@
 * @Description:
 * @date: 2018/8/16 15:44
 */
public interface ExampleService {

    List<String> getAllComputerLabNumber();

    String getOneComputerLabNumberById(Integer id);
}
