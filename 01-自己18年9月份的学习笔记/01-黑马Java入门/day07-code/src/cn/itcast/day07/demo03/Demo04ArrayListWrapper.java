package cn.itcast.day07.demo03;

import java.util.ArrayList;

/**
 * ���ߣ�����
 * ���ڣ� 2018��11��26�� 
 * ���ı�����1
 * 
 * ���Ϸ��ͱ������������ͣ������ǻ�������
 * ���һ��Ҫ�洢�������ͣ���ô��Ҫʹ�û������Ͷ�Ӧ��"��װ��"��ȫ��λ��java.lang���£���8�֣�
 * 
 * ��������                ��Ӧ�İ�װ��
 * byte			Byte
 * short		Short
 * int 			Integer(���⣩
 * long			Long
 * float		Float
 * double		Double
 * char			Character(���⣩
 * boolean		Boolean
 * 
 * ��JDK 1.5��ʼ���������Ϳ��ԺͶ�Ӧ�İ�װ������Զ�װ�����
 * װ�䣺��������--> ��װ��
 * ���䣺��װ��---> ��������
 */
public class Demo04ArrayListWrapper {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>list = new ArrayList<>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		
		int result = list.get(1);
		System.out.println(result);   //200
		
	}

}
