package changYongLei;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 可视化日历程序
 * 
 * @姓名 李明
 * @日期 2018年11月6日下午5:26:35
 */
public class VisualCalendar {
	public static void main(String[] args) {
		System.out.println("请输入日期(按照格式：2018-11-6)：");
		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine();

		DateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // 字符串转成时间对象
		try {
			Date date = format.parse(temp);
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);

			int day = calendar.get(calendar.DATE);

			// calendar.set(Calendar.DATE, 1); //获得1号属于周几
			//System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
			// System.out.println(); //获得一个月多少天
			int maxDate = calendar.getActualMaximum(Calendar.DATE);

			System.out.println("日\t一\t二\t三\t四\t五\t六");

			for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) {
				System.out.print('\t');
			}

			for (int i = 1; i <= maxDate; i++) {
				if (i == day) {
					System.out.print("*");
				}

				System.out.print(i + "\t");
				int w = calendar.get(Calendar.DAY_OF_WEEK);
				if (w == Calendar.SATURDAY) {
					System.out.print('\n');
				}
				calendar.add(Calendar.DATE, 1);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 把字符串转成时间

	}

}
