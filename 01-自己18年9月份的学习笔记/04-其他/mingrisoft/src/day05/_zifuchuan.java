package day05;

/**
 * 作者：李明
 * 日期： 2018年12月25日 下午5:53:03
 * 看的遍数：
 */
public class _zifuchuan {
	public static void main(String[] args) {
		char arr[] = {'t','i','m','e'};
		String a = new String(arr);
		System.out.println(a);     //利用字符数组把所有的字符都拼接到了一起
		
		char brr[] = {'时','间','就','是','金','钱'};
		String b = new String(brr,4,2);
		System.out.println(b);
	}
}
