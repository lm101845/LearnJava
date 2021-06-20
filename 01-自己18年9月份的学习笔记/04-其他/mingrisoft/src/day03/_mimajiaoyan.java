package day03;

import java.util.Scanner;

/**
 * 作者：李明
 * 日期： 2018年12月23日 下午2:11:34
 * 看的遍数：
 */
public class _mimajiaoyan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pwd1,pwd2;
		do {
			System.out.println("请输入密码：");
			pwd1=sc.nextLine();
			System.out.println("请再次输入密码：");
			pwd2=sc.nextLine();
			
			if(!pwd1.equals(pwd2)) {
				System.out.println("您输入的密码不一致，请重新输入");
			}
			
		}while(!pwd1.equals(pwd2));
		System.out.println("设置密码成功");
	}

}
