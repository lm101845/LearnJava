package chapter04;

import java.io.*;
public class TestEx {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.println(arr[2]);
		try {
			System.out.println(2/0);
		}catch (ArithmeticException e) {
			System.out.println("ϵͳ����ά�����������Ա��ϵ");
			e.printStackTrace();
		}
	}

}
