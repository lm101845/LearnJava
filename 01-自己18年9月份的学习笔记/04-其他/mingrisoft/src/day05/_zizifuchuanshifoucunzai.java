package day05;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��25�� ����6:52:03
 * ���ı�����
 */
public class _zizifuchuanshifoucunzai {
	public static void main(String[] args) {
		String str = "8888B8888";
		Boolean bool01 = str.contains("B");
		Boolean bool02 = str.contains("H");
		
		System.out.println(bool01);
		System.out.println(bool02);
		
		//ʹ��indexOf()����Ҳ���Խ��в��Һ��ж�
		String str01 = "8888B8888";
		if(str01.indexOf("B")>-1) {
			System.out.println("B����");
		}
		
		if(str01.indexOf("H")>-1) {
			System.out.println("H����");
		}
		
	}

}
