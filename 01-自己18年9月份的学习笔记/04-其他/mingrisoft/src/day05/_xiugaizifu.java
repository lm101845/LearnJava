package day05;

/**StringBuilder��Ϊ��ͬ�������Ա�StringBufferЧ����Ҫ��һ�㡣���Ƕ�������ͬ��API
 * ���ߣ�����
 * ���ڣ� 2018��12��26�� ����7:15:53
 * ���ı�����
 */
public class _xiugaizifu {
	public static void main(String[] args) {
		StringBuffer stb = new StringBuffer("123456");
		stb.setCharAt(3, 'A');
		System.out.println(stb);
		System.out.println("������������");
		
		//�ַ�������
		StringBuffer stb1 = new StringBuffer("ͬһ�����磬ͬһ������");
		stb1.reverse();
		System.out.println(stb1);
		
		//ɾ�����ַ���
		StringBuffer stb2 = new StringBuffer("���н�����������ǿ��Ϣ");
		stb2.delete(4,7);   //ǰ�պ�
		System.out.println(stb2);
		
		//�滻���ַ���
		StringBuffer stb3 = new StringBuffer("18612345678");
		stb3.replace(3,7,"****");   //ǰ�պ�  ���Ը���ָ����Χ�ڵ��ַ�����String������������
		System.out.println(stb3);
		
	}

}
