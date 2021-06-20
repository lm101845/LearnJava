package changYongLei;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @姓名 李明
 * @日期 2018年11月6日下午4:58:52
 * 
 * 月份：一月是0，二月是1.....
 * 星期：周日是1，周一是2.....
 */
public class TestCalendar {
	public static void main(String[] args) {
		
		Calendar  c = new GregorianCalendar();
		c.set(2001, Calendar.FEBRUARY, 10, 12, 23, 34);   //年月日时分秒

//		c.set(Calendar.YEAR, 2001); //把年份设置为2001
//		c.set(Calendar.MONTH, 1);   //二月
//		c.set(Calendar.DATE, 10);
		
//		c.setTime(new Date());
		
		Date d = c.getTime();
		System.out.println(d);
		System.out.println(c.get(Calendar.YEAR)); 
		
		//测试日期计算
		c.add(Calendar.MONTH, -30);
		System.out.println(c);
	}
}
