package edu.zut.cs.tools;

import java.util.List;

/**
 * @Description 计算一个数组和
 * @author zouguo
 *
 */
public class SumArray {
	public Integer sumArray(List<Integer> list) {
		Integer sum = 0;
		for (Integer integer : list) {
			sum += integer;
		}
		return sum;
	}
}
