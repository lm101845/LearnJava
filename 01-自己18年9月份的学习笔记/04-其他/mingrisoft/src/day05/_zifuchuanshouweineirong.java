package day05;

/**�ж��ַ�����β����
 * ���ߣ�����
 * ���ڣ� 2018��12��25�� ����6:36:50
 * ���ı�����
 * 
 * �ַ���������һ����Ҳ��������ֵ��
 */
public class _zifuchuanshouweineirong {
	public static void main(String[] args) {
		String fileName = "HelloWorld.java";
		Boolean bool1 = fileName.endsWith(".java");
		Boolean bool01 = fileName.endsWith("a");
		Boolean bool2 = fileName.endsWith(".jpg");
		
		System.out.println(bool1);	//true	
		System.out.println(bool01); //true   ��Ϊ���һ������ȷʵ��a
		System.out.println(bool2);  //false

	}

}
