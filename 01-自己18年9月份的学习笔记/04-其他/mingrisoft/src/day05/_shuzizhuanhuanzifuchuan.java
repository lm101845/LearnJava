package day05;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��25�� ����6:00:26
 * ���ı�����
 */
public class _shuzizhuanhuanzifuchuan {
	public static void main(String[] args) {
		
		//����ת��Ϊ�ַ�������ʾת��
		String strInt = String.valueOf(126);
		System.out.println(strInt);
		
		String strLong = String.valueOf(126L);
		System.out.println(strLong);
		
		String strDouble = String.valueOf(126.123456);
		System.out.println(strDouble);
		
		String str = "" + 123;		//��Ϊ˫���ŵ�Ե�ʣ��Ὣ����������Զ��ı���ַ���
		System.out.println();
		
		String a = "1"+2+3+4;
		String b =  1+2+3+"4";
		String c = "1"+(2+3+4);
		System.out.println(a);		//1234   �����ַ�����ֱ�������������
		System.out.println(b);		//64   �����ַ���ǰ�����������㣬���������
		System.out.println(c);		//19 ���������ţ�������������е�ֵ�����������
		
	}
}
