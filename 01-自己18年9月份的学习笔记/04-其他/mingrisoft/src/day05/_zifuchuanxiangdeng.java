package day05;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��25�� ����9:02:53
 * ���ı�����
 */
public class _zifuchuanxiangdeng {
	public static void main(String[] args) {
		String name = new String("tom");
		String dbValue =new String("tom");
		
		System.out.println(name+"��"+dbValue);
		System.out.println(name==dbValue);  //false
		System.out.println(name.equals(dbValue));  //true
		
		//���Դ�Сд
		String a = new String("abc");  
		String b = new String("ABC");
		System.out.println(a.equals(b));  //false
		System.out.println(a.equalsIgnoreCase(b));  //true
		
		//ֱ�������ַ�������
		String c = "tom";
		String d = "tom";
		System.out.println(c==d);   //true
		
		//��һ�����
		String a1 = "hello";
		String a2 = new String("java");
		
		String str01 = a1+a2;
		String str02 = "hello"+"java";    //str2="hellojava"
		String str03 = "hellojava";
		
		System.out.println(str01);
		System.out.println(str02);
		System.out.println(str03);
		
		System.out.println(str01==str02);   //false
		System.out.println(str01==str03);   //false
		System.out.println(str02==str03);  //true
		
	}

}
