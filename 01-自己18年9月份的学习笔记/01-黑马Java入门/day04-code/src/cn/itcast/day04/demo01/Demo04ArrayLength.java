package cn.itcast.day04.demo01;
/**
 * @����
 * @���� 2018��11��26�� 
 * ���ı�����1+1
 * ���۶�̬���Ǿ�̬��ʼ�������鶼���г��ȡ���β��ܻ�ȡ�����أ�
 * 
 * ��ʽ��
 * ��������.length
 * ����õ�һ��int���֣���������ĳ���
 * 
 * ��ע�⡿
 * һ������һ�����ڴ浱�б������ˣ���ô����ĳ��ȾͲ��ܷ����ı䡣
 * 
 * �����Ƕ��󣡣���
 */

public class Demo04ArrayLength {
	
	public static void main(String[] args) {
		
		//��̬��ʼ��
		int[] arrayA = {1,2,34,5,6,7,8,43,38,0,5,3,23};
		
		System.out.println(arrayA.length);	//13
		
		
		//��̬��ʼ��
		int[] arrayB = new int[25];			
		//������java�У������Ƕ�����˿���ʹ��new������������µ�����ʵ��
		//ʹ��new�������������ʱ������ָ������Ĵ�С
		
		int len = arrayB.length;
		System.out.println(len);     //25
		
	}

}
