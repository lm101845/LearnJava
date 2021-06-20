package cn.itcast.day06.demo01;
/**
 *@李明
 *@日期 2018年11月26日 
 *看的遍数：1+1
 *
 * 一个类通常情况下不能直接使用，类似于手机设计图不能直接打电话
 * 如果要想使用这个类，通常都需要根据类创建一个真正的对象来使用
 * 类似于根据设计图来创造一个真正的手机才能用
 * 
 * 如何根据类创建对象呢？格式：
 * 类名称 对象名 = new 类名称（）； -----------------------相当重要！根据类创建一个对象！
 * 数据类型 变量名称 = new 数据类型（）；		//这是scanner格式
 */

public class Demo02Student {
	
	public static void main(String[] args) {
		
		//希望根据Student类名称来创建一个学生对象
		//格式：类名称 对象名 = new 类名称（）；
		//创建一个对象，是一个学生，对象名称是stu1
		//对象的名称stu1也叫做对象的“引用名”--遥控器
		Student stu1 = new Student();
		Student stu2 = new Student();		//创建了第二个对象
	}

}
