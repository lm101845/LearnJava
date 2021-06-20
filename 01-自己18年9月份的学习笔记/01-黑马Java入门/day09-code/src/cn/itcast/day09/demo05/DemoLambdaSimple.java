package cn.itcast.day09.demo05;
/**
 * ���ߣ�����
 * ���ڣ� 2018��12��1�� ����4:32:09
 * ���ı�����1
 * 
 * ��Lambda���У����ǿ����Ƶ��ģ����ǿ���ʡ�Ե�
 * 
 * 1.Lambda���ʽ���еĲ������Ϳ���ʡ�Բ�д
 * 2.�����������ֻ��һ������ôС���ſ���ʡ�ԡ�
 * 3.������ֻ��һ������ô�����ź�returnҲ����ʡ��
 */
public class DemoLambdaSimple {
	public static void main(String[] args) {
		//��׼��ʽ��
		method(       (int x)->{return ++x;}                 );
		
		//ʡ�Բ������ͣ�
		method(       (x)->{return ++x;}                 );
		
		//����С���ţ�
		method(       x->{return ++x;}                 );
		
		//ʡ�Դ����ź�return�ؼ���
		method(       x-> ++x                );
	}
	
	public static void method(MyInter inter) {
		
		int result = inter.singlePlus(10);
		System.out.println("�����" + result);
	}
}
