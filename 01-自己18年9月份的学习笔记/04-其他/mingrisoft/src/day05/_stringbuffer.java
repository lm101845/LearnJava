package day05;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��26�� ����7:07:18
 * ���ı�����
 */
public class _stringbuffer {
	public static void main(String[] args) {
		String str = new String("32");
		System.out.println(str);		//32
		
		StringBuffer stb = new StringBuffer(32);
		System.out.println(stb);		//ʲô��û����ʾ
		System.out.println("������������");
		
		StringBuffer stb1 = new StringBuffer();
		stb1.append("��ǰ������");
		stb1.append("\n�ι�һȺѼ");
		stb1.append("\n����������һ��");
		stb1.append("\n�������߰�");
		System.out.println(stb1);
		System.out.println("������������");
	}

}
