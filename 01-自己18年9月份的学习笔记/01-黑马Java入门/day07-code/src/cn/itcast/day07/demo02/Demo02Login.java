package cn.itcast.day07.demo02;

import java.util.Scanner;

/**
 * 作者：李明
 * 日期： 2018年11月26日 
 * 看的遍数：1
 * 
 * 使用String当中的equals和equalsIgnoreCase两个方法，来模拟一个简单的登陆场景
 * 
 * 分析：
 * 1.登陆需要用户名和密码两个信息，也就是两个字符串
 * 2.用户名和密码应该使用键盘输入，获取两个字符串（使用Scanner需要两个步骤）
 * 3.怎样才算是登陆成功呢？肯定需要注册时提前写好正确的用户名，正确的密码
 * 4.判断输入的用户名和密码，与正确的用户名，密码必须完全一样：
 * 	A.用户名必须正确
 * 	B.密码必须正确
 * 5.判断一下是否登陆成功:if
 * 6.如果登录成功，显示欢迎信息。如果登陆失败，退出系统
 * 
 */
public class Demo02Login {
	
	public static void main(String[] args) {
		
		//首先需要注册的时候，指定一个正确的用户名，和正确的密码
		String registUsername = "admin";     //注册时正确的用户名
		String registPassword = "123456";     //注册时正确的用户名
		
		//需要键盘输入两个字符串
		Scanner sc = new Scanner(System.in);    //创建
		
		System.out.println("请输入用户名：");
		String inputUsername = sc.next();
		
		System.out.println("请输入密码：");
		String inputPassword = sc.next();   //获取键盘输入的密码字符串
		
		//判断一下，两个条件
		//1.用户名正确--不区分大小写  使用equaIsIgnoreCase
		//2.密码正确--区分大小写  equals
		//两个条件都要满足：&&
		if(inputUsername.equalsIgnoreCase(registUsername) && inputPassword.equals(registPassword) ) {
			System.out.println("欢迎使用!");
		}else {
			System.out.println("登陆失败，退出！");
		}
		
	}

}
