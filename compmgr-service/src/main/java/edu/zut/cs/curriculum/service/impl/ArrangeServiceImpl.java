package edu.zut.cs.curriculum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.curriculum.dao.ArrangeMapper;
import edu.zut.cs.curriculum.model.Arrange;
import edu.zut.cs.curriculum.service.ArrangeService;
import org.springframework.stereotype.Service;

/** 
* @author ymz 
*  创建时间：2018年8月11日 下午9:33:33 
* 类说明 arrange实现类
*/
@Service
public class ArrangeServiceImpl implements ArrangeService {

	@Autowired
	ArrangeMapper arrangemapper;
	@Override
	public void findAll() {
		// TODO Auto-generated method stub
		List<Arrange> arranges=arrangemapper.getAllArrange();
		for(Arrange a:arranges) {
			System.out.println(a);
		}
	}

}
 