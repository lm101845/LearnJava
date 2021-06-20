package chapter04;

import java.io.*;
public class TestEx {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.println(arr[2]);
		try {
			System.out.println(2/0);
		}catch (ArithmeticException e) {
			System.out.println("系统正在维护，请与管理员联系");
			e.printStackTrace();
		}
	}

}
