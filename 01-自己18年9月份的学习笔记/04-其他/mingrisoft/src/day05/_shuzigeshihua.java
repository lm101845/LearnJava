package day05;

/**
 * 作者：李明
 * 日期： 2018年12月26日 上午8:07:17
 * 看的遍数：
 */
public class _shuzigeshihua {
	public static void main(String[] args) {
		System.out.println(String.format("长度为5的字符串|%d|",12345));
		System.out.println(String.format("长度为5的字符串|%5d|",123));
		System.out.println(String.format("右对齐|%-5d|",123));
		System.out.println(String.format("33的八进制结果%o",33));
		System.out.println(String.format("33的八进制结果%#o",33));
		System.out.println(String.format("33的十六进制结果%x",33));
		System.out.println(String.format("33的十六进制结果%#x",33));
		System.out.println(String.format("%d",33));
		System.out.println(String.format("%+d",33));
		System.out.println(String.format("%+d",-33));
	}

}
