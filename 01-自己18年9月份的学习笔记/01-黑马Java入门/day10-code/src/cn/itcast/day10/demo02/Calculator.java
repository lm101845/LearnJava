package cn.itcast.day10.demo02;

/*
 * @姓名 李明
 * @日期 2018年11月4日下午5:10:33
 */

//计算器函数式接口
@FunctionalInterface
public interface Calculator {
	
	//抽象方法的作用:求绝对值
	int getAbs(int num);
	

}
