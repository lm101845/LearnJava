package day03;
/*
 * == �ͣ�==���ڡ�����ʱ����Щ������Ĺ��ܲ����Ǽ��һ������ġ�ֵ���Ƿ�����һ��������ͬ�������ж�������������õ��Ƿ���ͬһ������

����object)Ҳ��ʵ����instance��
���ֺ��ַ������������ʹ������ֺ��ַ�����Ϊ���Ч�ʣ����ǲ��Ƕ����ڵ������У�����ѧϰ���ʹ�ö�������ʾ��������ֵ
*/
 class EqualsTester {
	 public static void main(String[] args) {
		String str1 , str2;
		str1 = "123";
		str2 = str1;			//����str1 ��str2ָ��ͬһ������
		
		System.out.println("String1:" + str1);
		System.out.println("String2:" + str2);
		System.out.println("Same object?" + (str1 = str2));
		
		str2 = new String(str1);		//������һ���µ�String������ֵ��str1)��ͬ��������str2		
		
		System.out.println("String1:" + str1);
		System.out.println("String2:" + str2);
		System.out.println("Same object?" + (str1 == str2));		//��ʱ����ָ���˲�ͬ�Ķ���
		System.out.println("Same object?" + str1.equals (str2));
		
		
	}
}
