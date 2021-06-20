package cn.itcast.day09.demo05;

/**
 * 作者：李明
 * 日期： 2018年12月1日 下午4:38:44
 * 看的遍数：1
 */
//注意！不管写不写@FunctionalInterface,只要有且仅有一个抽象方法的接口，就是函数式接口
@FunctionalInterface
public interface MyInter {
	
	//作用：将参数++，然后返回结果
	int singlePlus(int num);

}
