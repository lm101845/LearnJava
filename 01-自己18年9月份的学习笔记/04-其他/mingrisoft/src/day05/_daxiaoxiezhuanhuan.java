package day05;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��25�� ����9:48:14
 * ���ı�����
 */
public class _daxiaoxiezhuanhuan {
	public static void main(String[] args) {
		char a1 = 'a';
		char a2 = 'A';
		char a3 = (char)(a1-32);
		System.out.println((int)a1);		//97
		System.out.println((int)a2);		//65
		System.out.println(a3);            //A
		
		//�ַ�����Сдת��
		String str = "abcDEF";
		String str02 = str.toLowerCase();   //Сд
		String str03 = str.toUpperCase();   //��д
		System.out.println(str02);
		System.out.println(str03);
		
	}

}
