package homework;
/*
 * 1.���������Բ�ͬ��Java���Բ���������Աѡ�����ֵ���ݻ������ô��������ݲ��������������������ǲ���ֵ���ݡ�
 * ���ܰѶ��󴫵ݸ���������ֻ�ܴ��ݶ�������á����ñ���Ҳ�ǲ���ֵ����----�����õĿ������ݸ��������������յ������Ӧ�ú�
 * ���Ϳ���ֱ�Ӳ����������
2.��ͨ��return���ӷ���������Ϣʱ�������������͵ı���������ֵ����ʽ���أ������ؿ�������������������Ӧ�õķ�ʽ���ء�
�������ù��̣�
1.Ϊ���÷������ڴ��п��ٿռ䡣
2.��ʵ�δ��ݸ��βΡ�
3.����������ת���������ִ�з�����
4.ִ���귽��������������ת��main���������ط���ֵ����еĻ���Ϊ�������ٵĿռ䱻���١�
Example:

---------------------
 */
public class Test {
	public static void main(String args[]) {
		int a = 10, b = 20;
		String str1 = "abc";
		String str2 = "def";
		swap(a, b);
		swap(str1, str2);
		System.out.println(a + "/t" + b);
		System.out.println(str1 + "/t" + str2);
	}

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	public static void swap(String str1, String str2) {
		String temp = str1;
		str1 = str2;
		str2 = temp;
	}
}