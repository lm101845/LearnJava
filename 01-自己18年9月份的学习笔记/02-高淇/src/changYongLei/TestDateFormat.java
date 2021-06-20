package changYongLei;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
	public static void main(String[] args) {
		//DateFormat��һ�������ֻ࣬�ܽ�����������
		DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss,���ڱ��µĵ�W��");
		Date d = new Date(12321314323L);
		
		String str = df1.format(d); // format:��ʱ������ո�ʽ���ַ�����ת�����ַ���
		System.out.println(str);
		System.out.println("=================================================");
		
		String str2 = "1977-7-7";
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");

		try {
			Date d2 = df2.parse(str2);    //parse�ǽ�������˼
			System.out.println(d2);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
