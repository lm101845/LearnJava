package day05;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��25�� ����9:21:24
 * ���ı�����
 */
public class _jiequzifuchuan {
	public static void main(String[] args) {
		String 	id = "123456199001014321";
		String substr = id.substring(6);
		System.out.println(substr);
		
		String birthdate = id.substring(6, 14);
		System.out.println(birthdate);
	}

}
