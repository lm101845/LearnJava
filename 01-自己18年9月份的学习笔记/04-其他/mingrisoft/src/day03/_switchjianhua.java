package day03;

/**
 * 作者：李明
 * 日期： 2018年12月23日 下午12:31:05
 * 看的遍数：
 */
public class _switchjianhua {
	public static void main(String[] args) {
		int grade = 4;
		System.out.println("成绩为"+grade);
		switch(grade) {
			case 10:
			case 9:System.out.println("成绩为优");break;
			case 8:System.out.println("成绩为良");break;
			case 7:
			case 6:System.out.println("成绩为中");break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:System.out.println("成绩为差");break;
			default:System.out.println("成绩无效");
		}
	}
}
