package day04;

/**
 * @����
 * @���� 2018��11��26��
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