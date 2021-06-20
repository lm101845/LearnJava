package cn.itcast.day07.demo02;

import java.util.Scanner;

/**
 * 作者：李明
 * 日期： 2018年11月26日 
 * 看的遍数：1
 * 
 * 在刚才的登陆代码当中，加入重试三次的功能
 * 
 * 分析：
 * 1.重复三次的逻辑，应该使用循环
 * 2.而且重复次数确定，应该使用for循环
 * 3.需要在错误的时候，显示剩余多少次的提示
 * 4.如果成功了，那么显示欢迎信息，并且退出系统
 * 5.如果失败了，那么提示剩余多少次，并且重试
 */
public class Demo03LoginRetry {
	
	public static void main(String[] args) {
		
		//首先需要注册的时候，指定一个正确的用户名，和正确的密码
				String registUsername = "admin";     //注册时正确的用户名
				String registPassword = "123456";     //注册时正确的用户名
				
				
				for (int i = 1;i <= 3; i++) {
					Scanner sc = new Scanner(System.in);  
					
					System.out.println("请输入用户名：");
					String inputUsername = sc.next();
					
					System.out.println("请输入密码：");
					String inputPassword = sc.next();   
				
				
				if(inputUsername.equalsIgnoreCase(registUsername) && inputPassword.equals(registPassword) ) {
					System.out.println("欢迎使用!");
					//如果登陆成功，不应该再循环，应该退出循环
					break;
				}else { //如果登陆失败
					//区分一下是不是最后一次
					//如果是最后一次，那么就提示重试次数耗尽
					//如果不是最后一次，那么提示剩余次数
					if(i == 3) {
						System.out.println("登陆失败！重试次数耗尽。你是盗号的吧?哥屋恩！");
					}else {
					System.out.println("登陆失败，剩余次数"+(3-i)+ "次，请重试");
				}
			}	
		}	
	}
}		

				
	


