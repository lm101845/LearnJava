package day05;

import java.util.Date;

/**
 * 作者：李明
 * 日期： 2018年12月26日 上午7:51:37
 * 看的遍数：
 */
public class _geshihuazifuchuan {
	public static void main(String[] args) {
		Date date = new Date();
		String str = String.format("%tF", date);
		System.out.println(date);		//不格式化的话date会输出：Wed Dec 26 07:53:43 CST 2018
		System.out.println(str);        //格式化的结果：2018-12-26
		
		String year = String.format("%tY", date);
		String month = String.format("%tB", date);
		String day = String.format("%td", date);
		
		System.out.println("今年是"+year+"年");
		System.out.println("现在是"+month);
		System.out.println("今天是"+day+"日");
		
		
	}

}
