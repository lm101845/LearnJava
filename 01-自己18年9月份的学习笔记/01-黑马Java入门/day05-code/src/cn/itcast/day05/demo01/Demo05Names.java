package cn.itcast.day05.demo01;
/**
 *@����
 *@���� 2018��11��26�� 
 *���ı�����1+1
 *
 * �������Ƶ��������⣺
 * 1.�����������ܲ��ܺͷ���������һ���� ����
 * 2.���������������ÿһ���������ж���һ��ͬ���ı������Ƿ���ԣ� ���ԣ���Ȼ����һ���������������������ڲ�ͬ�Ĵ��������棬
 * �в�ͬ��������
 * 
 * ��̫�죡����
 */

public class Demo05Names {
	
	public static void main(String[] args) {
		
		int result = 100;	//main�������еı���
		System.out.println("main���е�result��" + result);	 //100
		
		int sum = sum(10 , 20);	  //��������(sum)�ͷ�������(sum)�ǿ���һ�µ�
		System.out.println(sum);  //30
		
	}
	
	public static int sum(int a, int b) {
		int result = a + b;
		System.out.println("sum���е�result:" + result); 	//sum���е�result:30
		return result;
	}

}
