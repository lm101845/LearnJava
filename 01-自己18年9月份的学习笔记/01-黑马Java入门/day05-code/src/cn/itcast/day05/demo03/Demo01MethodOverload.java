package cn.itcast.day05.demo03;
/**
 *@����
 *@���� 2018��11��26�� 
 *���ı�����1+1
 *
 * ���е���������:
 * �������ƵĶ������,ȫ����ִ����ӵĲ���,������Ϊ�����б�һ��,������Ҫ��ס�������,̫�鷳!
 * 
 * �������:
 * ʹ�÷�������(overload),ֻҪ��סһ����ͬ�����ּ���,���Ը��ݲ����б�Ĳ�ͬ�Զ�����
 * 
 * ��������(overload):������������ͬ,���ǲ����б�ͬ
 * 
 * ʲô�в����б�ͬ?
 * 1.�����ĸ�����ͬ
 * 2.���������Ͳ�ͬ
 * 3.�����Ķ�����˳��ͬ
 * 
 *  ����������˳���޹�
 * 1.�뷵��ֵ�����޹�
 */

public class Demo01MethodOverload {
	
	public static void main(String[] args) {
		
		System.out.println(sum(10,20));	//2������������
		System.out.println(sum(10,20,30));	//3������������
		System.out.println(sum(10,20,30,40));	//4������������
		//System.out.println(sum(10,20,30,40,50));	//˭���Բ���,û���κ�һ��������ʽʹ��,���Ա���!
		System.out.println("=================================================================");
		
		//System.out.println(sum(10.0,20.0));	
		
	}
	
	public static int sum(int a, int b) {
		System.out.println("��2��int�����ķ���ִ��!");
		return a + b;			//int result = a + b;
	}
	
	//public static int sum(int a, double b) {
		//System.out.println("��2��int�����ķ���ִ��!");
		//���ʽ������Ҫ������������Ͳ�һ��,��ô��?
		//˭�����ݷ�Χ��,�������˭			int + double--->double
		//return a + b;			//int result = a + b;
	//}
	
	
	public static int sum(int a, int b , int c) {
		System.out.println("��3��int�����ķ���ִ��!");
		return a + b + c;			
	}
	
	
	public static int sum(int a, int b , int c , int d) {
		System.out.println("��4��int�����ķ���ִ��!");
		return a + b + c +d;			
	}
	
}
