package cn.itcast.day05.demo02;
/**
 *@����
 *@���� 2018��11��26�� 
 *���ı�����1+1
 *
 * �Ա����������
 * 
 * 1.����һ�������������������Ԫ�ص��ܺ͡������������յĽ���Ƕ��٣�
 * 2.����һ��������������ӡ����Ԫ�ص��ܺ͡������Լ���ӡ�͵��ˣ����ø����ҽ����
 */

public class DemoVoidVsReturn {
	
	public static void main(String[] args) {
		
		int[] array = {3, 7, 5, -20, -128, 500};
		
		//����sumA�����������յĽ���ŵ�result����
		int result = sumA(array);
		
		System.out.println("main���еõ��˽����" + result);
		
		//ֻ�ܵ�������void����
		//sum(array);
	}
	
	
	/**
	 * 1.����һ�����������������������Ԫ�ص��ܺ�
	 * ��Ҫ�أ�
	 * ����ֵ���ͣ���Ҫ��������ݻ��������ĵ��ô�������ʹ��int
	 * �������ƣ�sumA
	 * �����б� int[]array
	 */
	public static int sumA(int[] array) {     //û��void����Ϊ�з���ֵ
		
		int sum = 0;	//��Ǯ��
		for (int i = 0; i < array.length; i++) {
			sum += array[i];	
		}
		return sum;  //����sum���е����ݣ��������ս��
	}
	
	
	/*
	 * 2.����һ������,��������ӡ������Ԫ�صĺ�
	 * ��Ҫ�أ�
	 * ����ֵ���ͣ�û�б�Ҫ�����յĽ�����������ô������Լ���ӡ�͵��ˡ�void
	 * ��������:sumB
	 * �����б�:int[]array
	 */
	
	public static void sumB(int[] array) {     //��void
		
		int sum = 0;	//��Ǯ��
		for (int i = 0; i < array.length; i++) {
			sum += array[i];	
	}
		//���sumû�б�Ҫ����main���еĵ��ô�,���Լ���ӡ����
		System.out.println("�ܺ�:" + sum);
	}	
}
