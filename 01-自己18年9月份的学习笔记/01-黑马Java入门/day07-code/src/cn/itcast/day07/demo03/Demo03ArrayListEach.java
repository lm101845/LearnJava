package cn.itcast.day07.demo03;

import java.util.ArrayList;

/**
 * ���ߣ�����
 * ���ڣ� 2018��11��26�� 
 * ���ı�����1
 * 
 * ��Ŀ���������ϵ��е������ַ�������
 */
public class Demo03ArrayListEach {
	
	public static void main(String[] args) {
		
		ArrayList<String>list = new ArrayList<>();
		
		//��ӣ�add
		list.add("�����Ȱ�");
		list.add("��������");
		list.add("�������");
		
		//�������ÿһ���ַ�������
		System.out.println(list);		//[�����Ȱ�, ��������, �������]
		
		//���ϵĳ��Ȼ�ȡ��size()
		for(int i = 0; i < list.size();i++) {
			
			//��ȡһ����ǰԪ�أ�get(int)
			String name = list.get(i);
			System.out.println(name);
			
		}
	}
}
