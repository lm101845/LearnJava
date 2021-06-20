package cn.itcast.day09.demo04;

/**
 * 作者：李明
 * 日期： 2018年12月1日 下午4:32:09
 * 看的遍数：1
 *
 * java当中使用Lambda表达式的前提是：必须有“函数式接口”。
 * 
 * 概念：有且仅有一个抽象方法的接口，叫做函数式接口
 * 
 * 如何才能万无一失的检测一下当前接口是不是函数式接口呢？
 * 用一个固定的格式写在public interface之前即可
 * 
 * @FunctionalInterface
 * public interface 函数式接口名{
 * 		//...
 * }
 */

@FunctionalInterface
public interface Calculator {
	
	int sum(int a , int b);

}

