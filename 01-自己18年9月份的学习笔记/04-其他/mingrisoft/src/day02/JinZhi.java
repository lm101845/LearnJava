package day02;

/**����
 * ���ߣ�����
 * ���ڣ� 2018��12��17�� ����11:05:09
 * ���ı�����
 */
public class JinZhi {
	public static void main(String[] args) {
		int a  = 33;	//ʮ����
		int b  = 033;	//�˽��ƣ���0��ͷ
		int c = 0x33;	//ʮ�����ƣ���Ox��0x��ͷ
		System.out.println(a);	//��������ʮ���Ƶ�33ת����ʮ���Ƶ�33
		System.out.println(b);	//���������˽��Ƶ�33ת����ʮ���Ƶ�27
		System.out.println(c);	//��������ʮ�����Ƶ�33ת����ʮ���Ƶ�27

	}
}
