package day05;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��25�� ����9:28:15
 * ���ı�����
 */
public class _zifuchuantihuan {
	public static void main(String[] args) {
		String str ="��ͷһ��һ��";
		String restr = str.replace("һ", "Ҽ");
		System.out.println(restr);
		
		String str01 ="123456abcd";
		String restr01 = str01.replaceAll("\\d", "?");    //   \\d��ʾ1-9�е��κ�һ��
		System.out.println(restr01 );
		
		String str02 = "Java";
		String restr02 = str02.replaceFirst("a", "A");
		System.out.println(restr02);   //ֻ����һ��a��Ϊ�˴�д
		
		
				
	}

}
