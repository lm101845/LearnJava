package day05;

import java.util.Date;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��26�� ����7:51:37
 * ���ı�����
 */
public class _geshihuazifuchuan {
	public static void main(String[] args) {
		Date date = new Date();
		String str = String.format("%tF", date);
		System.out.println(date);		//����ʽ���Ļ�date�������Wed Dec 26 07:53:43 CST 2018
		System.out.println(str);        //��ʽ���Ľ����2018-12-26
		
		String year = String.format("%tY", date);
		String month = String.format("%tB", date);
		String day = String.format("%td", date);
		
		System.out.println("������"+year+"��");
		System.out.println("������"+month);
		System.out.println("������"+day+"��");
		
		
	}

}
