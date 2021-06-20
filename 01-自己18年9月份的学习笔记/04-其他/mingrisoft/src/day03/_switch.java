package day03;

/**利用switch打分
 * 作者：李明
 * 日期： 2018年12月23日 下午12:19:45
 * 看的遍数：
 */
public class _switch {
	public static void main(String[] args) {
		int grade = 10;
		System.out.println("成绩为"+grade);
		switch(grade) {
			case 10:System.out.println("成绩为优");break;
			case 9:System.out.println("成绩为优");break;
			case 8:System.out.println("成绩为良");break;
			case 7:System.out.println("成绩为中");break;
			case 6:System.out.println("成绩为中");break;
			case 5:System.out.println("成绩为差");break;
			case 4:System.out.println("成绩为差");break;
			case 3:System.out.println("成绩为差");break;
			case 2:System.out.println("成绩为差");break;
			case 1:System.out.println("成绩为差");break;
			case 0:System.out.println("成绩为差");break;
			default:System.out.println("成绩无效");
		}
	}
}
