package theStatic;

/**
 * ���Ծ�̬��ʼ�����ʹ��
 *
 *�ȼ����࣬����̸���������
 *
 *������������ж���ʹ洢�ġ����ǵ�ֵ�������༫������ʵ����
 *ÿ��ʵ��������ʵ��������һ�����������ǿ����޸�ʵ��������ֵ��������Ӱ��������ʵ�����������ֻ��һ���������޸�����ֵ��Ӱ��
 *���е�ʵ��
 *
 *����������ķ����ǣ���ǰ����Ϲؼ���static
 *
 */
public class User3 {
	int id; // id
	String name; // �˻���
	String pwd; // ����
	static String company; // ��˾����

	static {    //����Ǿ�̬��     ��鲻�Ǹ������������Ǹ��������    �����ʼ����ʱ�����ִ��
		System.out.println("ִ����ĳ�ʼ������");    //��ʼ���࣬�����ǻ�ͼֽ
		company = "������ѧ��";
		printCompany();
		//��static�����治�ܵ�����ͨ�����Ժ���ͨ�ķ�������Ϊ���ʱ������ĳ�ʼ��
	}

	public static void printCompany() {
		System.out.println(company);
	}

	public static void main(String[] args) {
		User3 u3 = null;
	}
}