package changYongLei;

import java.util.Date;

/** 测试Date类的用法
 * @姓名 李明
 * @日期 2018年11月6日下午4:00:59
 * 
 * java中时间的表示说白了也是数字，是从：标准纪元1970.1.1 0点开始到某个毫秒数，类型是long
 * 
 * 计算机里面所有东西都是数字
 * 
 * 
 */
public class TestDate {
	public static void main(String[] args) {
		
		Date d = new Date();
		long t = System.currentTimeMillis();	//从1970.1.1 0点到现在过了多少毫秒	
	    /**
	     * Allocates a {@code Date} object and initializes it to
	     * represent the specified number of milliseconds since the
	     * standard base time known as "the epoch", namely January 1,
	     * 1970, 00:00:00 GMT.
	     *
	     * @param   date   the milliseconds since January 1, 1970, 00:00:00 GMT.
	     * @see     java.lang.System#currentTimeMillis()
	     */
		System.out.println(t);
		Date d2 = new Date(1000);
		
		System.out.println(d2.toGMTString());   //不建议使用   1 Jan 1970 00:00:01 GMT  1000毫秒是1秒
		d2.setTime(24324324);
		System.out.println(d2.getTime());
		System.out.println(d.getTime()<d2.getTime());
			
		
	}
}
