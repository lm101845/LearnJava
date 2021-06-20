package cn.itcast.day09.demo04;
/**
 * ���ߣ�����
 * ���ڣ� 2018��12��1�� ����4:32:09
 * ���ı�����1
 * 
 * Lambda���ʽҪ��ʹ�ã�һ��Ҫ�к���ʽ�ӿڵ��ƶϻ���
 * 1.Ҫôͨ�������Ĳ���������ȷ�����ĸ�����ʽ�ӿ�
 * 2.Ҫôͨ����ֵ������ȷ�����ĸ�����ʽ�ӿ�
 * 
 * Lambda�ĸ�ʽ����Ϊ�˽����󷽷��������Ϊ�������㣺
 * 1.һЩ����������������
 * 2.һ����ͷ
 * 3.һЩ���루�����壬�����ţ�
 * 
 * ������󷽷���
 * public abstract int sum(int a , int b);
 * 
 * �����ΪLambda�ı�׼��ʽ��
 * (int a , int b)->{return a + b;};
 */
public class Demo03Lambda {
	
	public static void main(String[] args) {
		//���÷�����ʱ�򣬲��������Ǻ���ʽ�ӿڣ�����Lambda�����ƶϳ������ĸ��ӿ�
		method(			(int a, int b)->{return a + b;}			);		
		System.out.println("=========================");
		
		//Ҳ���Ը��ݸ�ֵ�����������������Lambda�������ƶ�
		Calculator param = (int a, int b)->{return a + b;};
		method(param);
		
		//(int a, int b)->{return a + b;}			//����д����û�������Ļ�����Lambda���޷��ƶ����ĸ�����ʽ�ӿ�
	}

public static void method(Calculator calculator) {
		
		int result = calculator.sum(10, 20);
		System.out.println("����ǣ�" + result);
		
	}
}
