package day04;

import java.util.Scanner;

public class Demo01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ������");
		int num = sc.nextInt();
		
		//�ж�����ż��
		if (num % 2 ==0) {
			System.out.println("ż��");
		}else {
			System.out.println("����");
		}
	}

}
