package day04;
/**
 * ���ߣ�����
 * ���ڣ� 2018��12��23�� ����12:23:48
 * ���ı�����1
 * 
 * switch������һ�����Ա��������Ա�����������ÿ��caseֵ���бȽϣ�����ҵ�ƥ���ֵ����ִ����Ӧ�����
 * 
 * switch����еĲ���ֻ�����ǿ�ת��Ϊint���͵Ļ����������ͣ���char���ַ�����������switch��ʹ�ø�����������ͣ�
 * ��long,float,string,Ҳ���ܲ��Գ���������������ϵ
 * 
 * ��ÿ��case�󣬿�����������Ŀ����䡣��if��ͬ���ǣ����ؽ���������û���������
 * 
 */

import java.util.Scanner;		//util��ʾ���߰�

public class Demo02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ��������");
		int num = sc.nextInt();
		
		switch(num) {
		
		case 1:
			System.out.println("1¥");
			break;
		
		case 2:
			System.out.println("2¥");
			break;
		
		case 3:
			System.out.println("3¥");
			break;
		
		default:		//���û���ҵ�ƥ���ֵ����ִ��default������default����ǿ�ѡ�ģ������ʡ�ԣ���û��
						//�κ�caseƥ��ʱ������ִ���κβ���
			System.out.println("¥�����");
		
		}
	}
}
