package changYongLei;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
	public static void main(String[] args) {
		//DateFormat是一个抽象类，只能建立它的子类
		DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss,属于本月的第W周");
		Date d = new Date(12321314323L);
		
		String str = df1.format(d); // format:将时间对象按照格式化字符串，转化成字符串
		System.out.println(str);
		System.out.println("=================================================");
		
		String str2 = "1977-7-7";
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");

		try {
			Date d2 = df2.parse(str2);    //parse是解析的意思
			System.out.println(d2);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
