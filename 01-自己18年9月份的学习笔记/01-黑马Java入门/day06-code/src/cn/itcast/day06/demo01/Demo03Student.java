package cn.itcast.day06.demo01;
/**
 *@李明
 *@日期 2018年11月26日 
 *看的遍数：1+1
 *
 * 如何使用创建好的对象？
 * 
 * 类当中已经定义好了两个组成部分：成员变量（属性）、成员方法（行为）
 * 所以，根据类创建出来的对象也有这两个部分。
 * 
 * 1.如何使用对象当中的成员变量？格式：
 * 对象名.成员变量名
 * 
 * 注意：对于成员变量来说，如果没有赋值，那么将会有一个默认值。（局部变量则没有默认值）
 * 
 * 2.如何使用对象当中的成员方法？格式：
 * 对象名.成员方法名（参数）
 * 
 * 总结：通过对象名(遥控器)，想用谁就点儿谁
 * 
 * 约定俗称的命名规则：
 * 1.类名的首字母大写
 * 2.变量名和方法名的首字母小写
 * 3.运用驼峰标识
 * 
 */
public class Demo03Student {
	
	public static void main(String[] args) {
		
		Student stu = new Student();		//创建了一个学生对象  学生这个概念 具体一个学生 = new 学生这个概念
				
		System.out.println(stu.name);		//null(默认）
		System.out.println(stu.age);		//0（默认）
		System.out.println("=============================================================");
		
		//改变成员变量的数据值
		stu.name = "鹿晗";
		stu.age = 20;
		System.out.println(stu.name);		//鹿晗
		System.out.println(stu.age);		//20
		System.out.println("=============================================================");
		
		
		//将对象当中的成员变量，交给name变量
		String name = stu.name;
		System.out.println(name);     //鹿晗
		System.out.println("=============================================================");
		
		//使用对象当中的成员方法
		stu.eat();   	//调用吃饭的成员方法
		stu.sleep(); 	//调用睡觉的成员方法
		stu.study(); 	//调用学习的成员方法
	}

}
