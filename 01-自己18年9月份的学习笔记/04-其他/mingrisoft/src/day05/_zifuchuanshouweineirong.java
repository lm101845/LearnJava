package day05;

/**判断字符串结尾内容
 * 作者：李明
 * 日期： 2018年12月25日 下午6:36:50
 * 看的遍数：
 * 
 * 字符串和数组一样，也是有索引值的
 */
public class _zifuchuanshouweineirong {
	public static void main(String[] args) {
		String fileName = "HelloWorld.java";
		Boolean bool1 = fileName.endsWith(".java");
		Boolean bool01 = fileName.endsWith("a");
		Boolean bool2 = fileName.endsWith(".jpg");
		
		System.out.println(bool1);	//true	
		System.out.println(bool01); //true   因为最后一个数字确实是a
		System.out.println(bool2);  //false

	}

}
