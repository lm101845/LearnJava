package cn.itcast.day05.demo01;
/**
 *@����
 *@���� 2018��11��26�� 
 *���ı�����1+1
 *
 * ����һ��������ʵ������int������ӵõ���ֵ�Ĺ���
 * 
 * ע�����
 * 1.�������֮�䶨����Ⱥ�˳������ν
 * 2.���ǲ�����һ���������ڲ�Ƕ����һ������
 * 3.����������֮�󲻻�ִ�У����Ҫ��ִ�У�һ��Ҫ�ȵ���
 */
public class Demo02MethodDefine{
	
	public static void main(String[] args) {	//argument
		
	}
	/*
	 * ���巽����Ҫ�أ�
	 * ����ֵ���ͣ�����int������ӣ�����϶�����int
	 * ��������:sum
	 * �������:����int����
	 */
	public static int sum(int a , int b) {
		
		System.out.println("����sumִ������");
		
		int result = a + b;
		return result;
	}
}
