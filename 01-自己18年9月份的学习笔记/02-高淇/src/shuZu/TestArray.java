package shuZu;

import quanXian.User1;

/**
 * @���� ����
 * @���� 2018��10��29������7:24:59
 * 
 * 1.������ʱ��û��ʵ�����κζ���ֻ����ʵ�����������ʱ��JVM�ŷ���ռ䣬��ʱ���볤���й�
 * 2.����һ�������ʱ��û����������������
 * 3.����һ�����飬����ָ������
 */

public class TestArray {

	public static void main(String[] args) {
		int[]     arr01   = new int[10] ;			//�����±�[0, length-1]��0,1,2,3,4,5,6,7,8,9    ������Է�10��int����
		String[]  arr02 = new  String[5];     //String arr02[]Ҳ��

		arr01[0] = 13;
		arr01[1] = 15;
		arr01[2]  = 20;
//		arr01[10] = 100;    // java.lang.ArrayIndexOutOfBoundsException
		
		//ͨ��ѭ����ʼ������
		for(int i=0;i<arr01.length;i++){
			 arr01[i] = 10*i;
		}
		//ͨ��ѭ����ȡ��������Ԫ�ص�ֵ
		for(int i=0;i<arr01.length;i++){
			 System.out.println(arr01[i]);
		}
		
		User1[]   arr03 = new User1[3];
		arr03[0] = new User1(1001,"���"); 
		arr03[1] = new User1(1002,"�߶��");
		arr03[2] = new User1(1003,"�����");
		
		for(int i=0;i<arr03.length;i++){
			System.out.println(arr03[i].getName());
		}
		
	}
}
