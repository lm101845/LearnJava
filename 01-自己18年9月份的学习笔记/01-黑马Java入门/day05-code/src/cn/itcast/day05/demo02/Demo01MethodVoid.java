package cn.itcast.day05.demo02;
/**
 *@����
 *@���� 2018��11��26�� 
 *���ı�����1+1
 *
 * ���һ������ֻ��Ҫִ��һЩ�������ѣ���û�����յ����ݽ��Ҫ���������ô�����ô�����������û�з���ֵ�ķ���
 * ��Ҫʹ��һ���ؼ��֣�void
 * 
 * ����һ����ͨ�ķ�����
 * ���η� ����ֵ���� �������ƣ��������� �������ƣ�{
 * 		������
 * 		return����ֵ
 * }
 * 
 * ����һ��û�з���ֵ�ķ�����
 * ���η� ����ֵ���� �������ƣ��������� �������ƣ�{
 * 		������
 * 		return��		//���һ��returnһ�㶼��ʡ�Բ�д��,��Ϊ��û�з���ֵ��д���Ҳû��
 * }
 * 
 * ��ʽ�ĵ�����
 * 1.����ֵ���͹̶�д�ɹؼ��֣�void
 * 2.����returnһ������ķ���ֵ��ֻ��дreturnֱ�ӷֺ�
 * 3.����������һ����return��ô��һ��ʡ��
 * 
 */

public class Demo01MethodVoid {
	
	public static void main(String[] args) {
		
		//��������
		printHelloWorld();
		System.out.println("====================================================");
		
		printHelloWorldCount(3);
		
	}
	/*
	 * ����һ��������������ӡ����̶�10��HelloWorld
	 * 
	 * ��Ҫ�أ�
	 * ����ֵ���ͣ�ֻ�ǽ�����Ļ�Ĵ�ӡ������ѣ�û�н�����ݲ���������ֵ���ͣ�ʹ��void
	 * �������ƣ�printHelloWorld
	 * �����б�����Ҫ�κ��������Լ����ܶ�������������Բ��ò�������������
	 */
	public static void printHelloWorld() {
		
		for (int i =1; i <= 10;i++) {
			System.out.println("HelloWorld!" + i);
		}
	}


/*
 *����һ��������������ӡ���ָ��������HelloWorld
 *��Ҫ�أ�
 *����ֵ���ͣ���Ȼ���Ǵ�ӡ��������Բ�û�н��������Ҫ�������ô�����Ȼʹ��void
 *�������ƣ�printHelloWorldCount
 *�����б���Ҫ֪�������Ǽ��Σ�������Ҫһ��int ����
 */

public static void printHelloWorldCount(int count) {
	
	for (int i =1; i <= count;i++) {
		System.out.println("HelloWorld!" + i);
		}
	}
}