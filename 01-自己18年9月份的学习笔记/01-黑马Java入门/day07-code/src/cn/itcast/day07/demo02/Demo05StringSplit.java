package cn.itcast.day07.demo02;
/**
 * ���ߣ�����
 * ���ڣ� 2018��11��26�� 
 * ���ı�����1
 * 
 * ���ϣ�����ַ�������ָ���ı���зֳ����ɶζ�����ô����ʹ�÷�����
 * public String[] split(string regex):��regex��Ϊ��ǽ����е��������з�֮������ɶζ��ַ������ַ������飩
 * 
 * ע�����
 * �ֽ׶�ǿ�ҽ��鲻Ҫʹ��Ӣ�ľ����Ϊ�ָ�ı�ǡ�
 * ��ΪӢ�ľ����������ʽ���������⺬��
 * ������regex��ʵ����һ��������ʽ�����ѧϰ��
 * 
 * ���һ��Ҫʹ��Ӣ�ľ�㣬��ô�и�ı��Ӧ��֪����\\.��(�ֽ׶εĹ̶�д����
 */
public class Demo05StringSplit {
	
	public static void main(String[] args) {
		
		String str1 = "AAA��BBB��CCC";
		String[] array1 = str1.split("��");
		System.out.println("����ĳ��ȣ�" + array1.length);		//����ĳ��ȣ�3
		
		for (int i =0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		System.out.println("============================");
		
		String str2 = "aaa.bbb.ccc";
		String[] array2 = str2.split(".");
		System.out.println("����ĳ��ȣ�" + array2.length);		//����ĳ��ȣ�0
		
		for (int i =0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
	}

}
