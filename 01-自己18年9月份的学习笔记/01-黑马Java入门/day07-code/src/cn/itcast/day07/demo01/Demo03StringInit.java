package cn.itcast.day07.demo01;
/**
 *@����
 *@���� 2018��11��26�� 
 *���ı�����1
 *
 * �ַ��������ĳ���2+1�ַ�ʽ�����ֹ��췽����һ��ֱ�Ӹ�ֵ��
 * 
 * ���õ��������췽����
 * public String(char[] array):������һ���ַ����飬�����ַ����������������һ���ַ���
 * public String(char[] array, int offset, int count):�����ַ������һ���������������ַ���
 * ����offset����һ�����鵱�е���ʼ��������0��ʼ��
 * ����count�������ö��ٸ��ַ�
 * 
 * ֱ�Ӹ�ֵ˫����Ҳ��һ���ַ�������
 * 
 */
public class Demo03StringInit {
	
	public static void main(String[] args) {
	char[] array = {'H', 'e', 'l', 'l', 'o'};
	
	//�����ַ������������ַ���
	//������ ������  =  new �����ƣ������������
	String str1 = new String(array);
	System.out.println(str1);	//hello
	
	//�����ַ������һ�����������ַ���
	String str2 = new String(array , 2, 3);
	System.out.println(str2);	//llo
	
	//���ָ�����������߸��������˺���Χ����ô���ᷢ������Խ���쳣������д��
	//String str3 = new String(array , 100, 200);
	//System.out.println(str3);
	
	//ֱ�Ӹ�ֵ
	String str4 = "Hello";
	System.out.println(str4);
	
	}
}
