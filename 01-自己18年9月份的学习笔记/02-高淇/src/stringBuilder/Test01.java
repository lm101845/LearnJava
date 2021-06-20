package stringBuilder;

/**
 * @���� ����
 * @���� 2018��11��5������9:08:46
 * 
 *     ���Կɱ��ַ����У�StringBuilder(�̲߳���ȫ��Ч�ʸ�-һ�������)��StringBuffer(�̰߳�ȫ��Ч�ʵ�)
 *     String:���ɱ��ַ�����
 * 
 * 
 *     �����ַ��������޸ĵ�ʱ����Ҫʹ�� StringBuffer �� StringBuilder �ࡣ
 * 
 *     �� String �಻ͬ���ǣ�StringBuffer �� StringBuilder ��Ķ����ܹ�����ε��޸ģ����Ҳ������µ�δʹ�ö���
 * 
 *     StringBuilder ���� Java 5 �б���������� StringBuffer ֮������ͬ���� StringBuilder
 *     �ķ��������̰߳�ȫ�ģ�����ͬ�����ʣ���
 * 
 *     ���� StringBuilder ����� StringBuffer ���ٶ����ƣ����Զ�������½���ʹ�� StringBuilder
 *     �ࡣȻ����Ӧ�ó���Ҫ���̰߳�ȫ������£������ʹ�� StringBuffer �ࡣ
 * 
 */
public class Test01 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(); // �ַ����鳤�ȳ�ʼΪ16
		StringBuilder sb1 = new StringBuilder(32); // �ַ����鳤�ȳ�ʼΪ32
		StringBuilder sb2 = new StringBuilder("abcd"); // �ַ����鳤�ȳ�ʼΪ32, value[] = {'a','b','c','d',\u0000,\u0000..}
		sb2.append("efg");
		sb2.append(true).append(321).append("���"); // ͨ��return thisʵ�ַ�����

		System.out.println(sb2);

	}

}
