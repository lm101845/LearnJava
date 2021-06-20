package ziFuChuan;

/**
 * @���� ����
 * @���� 2018��11��5������7:33:35
 * 
 *     String�ࣺ���ɱ��ַ�����
 * 
 *     һ��Java String �ࡪ��String�ַ�������
 * 
 *     �ַ����㷺Ӧ�� ��Java ����У��� Java ���ַ������ڶ���Java �ṩ�� String ���������Ͳ����ַ�����
 * 
 *     ��Ҫע����ǣ�String��ֵ�ǲ��ɱ�ģ���͵���ÿ�ζ�String�Ĳ������������µ�String������������Ч�ʵ��£�
 *     ���Ҵ����˷����޵��ڴ�ռ䡣
 * 
 */
public class TestString {
	public static void main(String[] args) {
		String str1 = new String("abcd");
		String str2 = new String("abcd");

		System.out.println(str1.charAt(2));

		System.out.println(str2.equals(str1)); // �Ƚ������Ƿ���� true
		System.out.println(str2 == str1); // false

		String str3 = "def";
		String str4 = "def";
		System.out.println(str3.equals(str4)); // true
		System.out.println(str3 == str4); // true

		System.out.println(str3.indexOf('e'));

		String s = str1.substring(0);
		System.out.println(s);

		String str5 = str3.replace('e', '*');
		System.out.println(str5);

		String str6 = "abcde,rrtt,ccceee";
		String[] strArray = str6.split(",");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}

		String str7 = "  a abb  dk gh";
		String str8 = str7.trim(); // ȥ����β�ո��м�ո�ȥ
		System.out.println(str8.length());

		System.out.println("ABc".equalsIgnoreCase("abC")); // ���Դ�Сд
		System.out.println("Abcbd".indexOf('b')); // ����������
		System.out.println("Abcbd".lastIndexOf('b')); // ����������
		System.out.println("Abcbd".startsWith("Ab")); // �ǲ�����Ab��ͷ
		System.out.println("Abcbd".endsWith("bd")); // �ǲ�����bd��β
		System.out.println("ALGKDG".toLowerCase()); // תСд
		System.out.println("sldjglgjk".toUpperCase()); // ת��д
		System.out.println("===============================");

		// String gh = "a"; //һ����11������
		// String gh1 = new String("a"); //һ����12������
		StringBuilder gh = new StringBuilder("a"); // ���鳤�ȳ�ʼ��Ϊ17��16+1��
		for (int i = 0; i < 1000; i++) {
			// gh += i;
			gh.append(i);
		}
		System.out.println(gh);
		/*
		 * ����˵String�ࣺ���ɱ��ַ����У���ôgh��ֵ�����أ���Ϊgh�ĵ�ֵַ�ǲ��ɱ�ģ� ������ָ��������ǿ��Ըı��
		 */
	}

}
