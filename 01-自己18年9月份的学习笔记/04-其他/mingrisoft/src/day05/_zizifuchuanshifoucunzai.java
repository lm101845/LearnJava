package day05;

/**
 * 作者：李明
 * 日期： 2018年12月25日 下午6:52:03
 * 看的遍数：
 */
public class _zizifuchuanshifoucunzai {
	public static void main(String[] args) {
		String str = "8888B8888";
		Boolean bool01 = str.contains("B");
		Boolean bool02 = str.contains("H");
		
		System.out.println(bool01);
		System.out.println(bool02);
		
		//使用indexOf()方法也可以进行查找和判断
		String str01 = "8888B8888";
		if(str01.indexOf("B")>-1) {
			System.out.println("B存在");
		}
		
		if(str01.indexOf("H")>-1) {
			System.out.println("H存在");
		}
		
	}

}
