package day04;

import java.util.Scanner;

public class Demo01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个整数");
		int num = sc.nextInt();
		
		//判断奇数偶数
		if (num % 2 ==0) {
			System.out.println("偶数");
		}else {
			System.out.println("奇数");
		}
	}

}
