package cn.itcast.day07.demo01;
/**
 *���ߣ�����
 *���ڣ� 2018��11��26�� 
 *���ı�����1
 *
 * �ַ����������ڴ���һ������������ô���ݲ����Ա��ı�
 * �ַ����ǳ��������ǵ�ֵ�ڴ���֮���ܸ��ġ��ַ���������֧�ֿɱ���ַ�������Ϊ String �����ǲ��ɱ�ģ����Կ��Թ���
 * 
 * �ַ��������ݲ��ᷢ���ı䣬ÿ������ú�����˵�ʱ��һ���Ǵ������µ��ַ���
 */
public class Demo05StringEternal {
	
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str);
		
		str = "World";				//strֻ�����Ǵ�ŵ�ַ�ı������������ò����ַ��������Ǵ���ַ����ĵ�ֵַ
		System.out.println(str);
		
		String str2 = "Love";
		str2 += " Java";
		System.out.println(str2);
	}

}
