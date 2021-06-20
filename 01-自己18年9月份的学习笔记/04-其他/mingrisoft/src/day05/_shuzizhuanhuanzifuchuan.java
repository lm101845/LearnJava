package day05;

/**
 * 作者：李明
 * 日期： 2018年12月25日 下午6:00:26
 * 看的遍数：
 */
public class _shuzizhuanhuanzifuchuan {
	public static void main(String[] args) {
		
		//数字转换为字符串的显示转换
		String strInt = String.valueOf(126);
		System.out.println(strInt);
		
		String strLong = String.valueOf(126L);
		System.out.println(strLong);
		
		String strDouble = String.valueOf(126.123456);
		System.out.println(strDouble);
		
		String str = "" + 123;		//因为双引号的缘故，会将后面的数字自动的变成字符串
		System.out.println();
		
		String a = "1"+2+3+4;
		String b =  1+2+3+"4";
		String c = "1"+(2+3+4);
		System.out.println(a);		//1234   碰到字符串后，直接输出后面内容
		System.out.println(b);		//64   碰到字符串前，会先做运算，后输出内容
		System.out.println(c);		//19 碰到大括号，先运算大括号中的值，后输出内容
		
	}
}
