package edu.zut.cs.curriculum.dao; 
/** 
* @author ymz 
*  创建时间：2018年8月4日 下午10:10:32 
* 类说明 
*/

import java.util.List;

import edu.zut.cs.curriculum.model.Arrange;

public interface ArrangeMapper {
    Integer getCourseIdById(Integer id);
    //通过id查找课程id
    List<String> getClassNameByTeacherId(Integer id);
	//通过老师id查找班级名称
    List<Arrange>getAllArrange();
    //查找所有Arrange
}
 