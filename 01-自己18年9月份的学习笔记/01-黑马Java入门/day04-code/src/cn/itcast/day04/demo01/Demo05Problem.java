package cn.itcast.day04.demo01;
/**
 * @����
 * @���� 2018��11��26�� 
 * ���ı�����1+1
 * 
 * ����Ԫ�ص�������ţ���0��ʼ��һֱ��"����-1"Ϊֹ��
 * ���һ�����鳤��Ϊ3����ôԪ�صı�ŷֱ��� 0��1��2��û��3��Ԫ�صģ�
 * 
 * ������ʵ�����Ԫ�����������ڣ���ô���ᷢ��"��������Խ���쳣"��
 * ArrayIndexOutOfBoundsException
 * ֻҪ���������쳣��һ���Ƿ��ʵ�����Ԫ�ز�������
 */

public class Demo05Problem {
	
	public static void main(String[] args) {
		
		int[] array = {10,20,30};
		System.out.println(array[0]);	//10
		System.out.println(array[1]);	//20
		System.out.println(array[2]);	//30
		System.out.println("����ĳ��ȣ�"+ array.length);
		
		System.out.println("========================================");	
		
		//System.out.println(array[3]);		//����û�б������оͻᱨ��
		//System.out.println(array[-1]);	//����������0��ʼ�����Բ�����Ϊ����������Ҳ������쳣
	}
}
