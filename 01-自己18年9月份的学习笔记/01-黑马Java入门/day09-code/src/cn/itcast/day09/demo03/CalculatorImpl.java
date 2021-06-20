package cn.itcast.day09.demo03;

/**
 * 作者：李明
 * 日期： 2018年12月1日 下午4:29:26
 * 看的遍数：1
 */
//计算器接口的实现类
//现在遇到的困难是：为了得到方法体，不得不定义一个实现类
public class CalculatorImpl implements Calculator{
	
	public int sum(int a , int b) {
		int result = a + b;
		return result;
	}
}
