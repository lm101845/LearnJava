package day03;

import java.util.Scanner;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��23�� ����2:11:34
 * ���ı�����
 */
public class _mimajiaoyan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pwd1,pwd2;
		do {
			System.out.println("���������룺");
			pwd1=sc.nextLine();
			System.out.println("���ٴ��������룺");
			pwd2=sc.nextLine();
			
			if(!pwd1.equals(pwd2)) {
				System.out.println("����������벻һ�£�����������");
			}
			
		}while(!pwd1.equals(pwd2));
		System.out.println("��������ɹ�");
	}

}
