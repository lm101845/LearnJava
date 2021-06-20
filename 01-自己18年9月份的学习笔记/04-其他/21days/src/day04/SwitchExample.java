package day04;

/**
 * @李明
 * @日期 2018年11月26日
 */
public class SwitchExample {

	public static void main(String[] args) {

		int week = 7;
		String weeknumber;

		switch (week) { // switch case
		
		case 1:
			weeknumber = "Monday";
			break;

		case 2: 
			weeknumber = "tuesday";
			break;

		case 3:
			weeknumber = "wednesday";
			break;

		default: // default case
			weeknumber = "invalid week";
			break;
		}
		System.out.println(weeknumber);
	}
}