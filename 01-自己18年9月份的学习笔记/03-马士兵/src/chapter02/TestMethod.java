package chapter02;
//ÿһ��i���ڸ��ԵĴ������ﶨ�壬����֮�䲻������ͻ
public class TestMethod {
	public static void main(String[] args) {	//���ǵ��ܳ�����main�����������ķ����Ƿֳ���									
		m();			//������m�����Ķ���
		m2(2);
		m3('3', 4);		//��������д���ַ�3��ת����int���͵�ASCII��
		m4(4, 6);
		int i = m4(4, 6);		//����һ�����ʽ��������ʽ��һ�������ĵ��ã�������ʽ�Ķ����ǣ������������ʲô����ֵ��������ʽ����ʲôֵ
		System.out.println(i);
	}
	
	public static void m() {		//m�����ĵ���
		//return;					//return����˼�ǣ�������ִ�е������ʱ�򣬶�����˵�������أ�������
		System.out.println("ok");
		System.out.println("hello");
	}
	
	public static void m2(int i) {		//����Լ���ó�����Ҫ������Բ���εģ�int�ͣ� 
		if(i > 3) 
			return;
		System.out.println(i);		//���i����3��return�������������i��ӡ���� 
	}
	
	public static void m3(int i, int j) {			//һ��������2�������ڣ�������
		System.out.println(i + j);
	}
	
	public static int m4(int i, int j) {
		return i > j ? i : j;		//i �� j�ȴ�С��˭�󷵻�˭      ��������з���ֵ����������Բ����������ֵ
	}

}
