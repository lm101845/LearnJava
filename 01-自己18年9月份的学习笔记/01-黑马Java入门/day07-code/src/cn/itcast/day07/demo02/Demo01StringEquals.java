package cn.itcast.day07.demo02;
/**
 * ���ߣ�����
 * ���ڣ� 2018��11��26�� 
 * ���ı�����1
 * 
 * ��ν����ַ������ݵıȽϣ�
 * ���ʹ��==���бȽϣ���ô�ǽ��е�ֵַ����ͬ�ж�
 * �������ϣ�������ַ��������ݱȽϣ�����Ҫʹ��String���еĳ�Ա����
 * 
 * public boolean equals (Object obj):�����ַ��������ݱȽϣ��ϸ����ִ�Сд������obj������һ�����󣨸�˭�ȣ�
 * objectҲ��һ�����ͣ����Խ����κ����͵�����
 * 
 * public boolean equalsIgnoreCase(String str):�����ַ��������ݱȽϣ����Ǻ��Դ�Сд
 * 
 * ע�����
 * 1.Ҫ������ַ��������ݱȽϣ�һ��Ҫʹ��equals��������Ҫʹ��==����
 * 2.equals�������жԳ��ԣ�a.equals(b) �� b.equals(a)Ч��һ��
 * 3.С���ɣ����equals������Ҫ�Ƚϵ������ַ������У���һ���ǳ�������ô����������д��ǰ��
 * ���÷�����ʱ�򣬶�������������洢����nullֵ����ô���ᷢ��"��ָ���쳣"��NullPointerException
 * 4.ֱ��д�ϵ�˫���ž����ַ�������������˫����ֱ�ӵ��Ҳ�ܵ��÷���   System.out.println("hello".equals("Hello"));  
 */
public class Demo01StringEquals {
	
	public static void main(String[] args) {
		
		char[] array = {'a', 'b' ,'c'};     //ȫ�µ�
		String str1 = new String(array);
		
		String str2 = "abc";    //�ڳ���
		System.out.println(str1 == str2);     //false
		
		//�������ݱȽ�Ӧ��ʹ��equals����
		//����str1��str2�������ݱȽ�
		boolean same =str1.equals(str2);
		System.out.println(same);    //true
		System.out.println(str2.equals(str1));    //true
		System.out.println("===================================");
		
		String str3 = null;
		//System.out.println(str3.equals("abc"));   //����д�������ܻᷢ���쳣
		System.out.println("abc".equals(str3));   //true   �Ƽ����
		System.out.println("===================================");
		
		String str4 = "HELLO";
		String str5 = "hello";
		System.out.println(str4.equals(str5));   //false
		System.out.println(str4.equalsIgnoreCase(str5));  //true   ���Դ�Сд
 		
	}

}
