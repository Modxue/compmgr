package edu.zut.cs.curriculum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.curriculum.dao.LessonMapper;
import edu.zut.cs.curriculum.model.Lesson;
import edu.zut.cs.curriculum.service.LessonService;

/**
* @author hyx
* @version 创建时间：2018年8月17日 上午10:19:12
* 类说明 lesson实现类
*/
@Service
public class LessonServiceImpl implements LessonService{
	
	@Autowired
	LessonMapper lessonmapper;
	
	public void findAll() {
		List<Lesson> lesson=lessonmapper.getAllLesson();
		for(Lesson l:lesson) {
			System.out.println(l);
		}
		
	}

}
