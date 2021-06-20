package day03;

/**
 * 作者：李明
 * 日期： 2018年12月23日 上午11:06:41
 * 看的遍数：
 */
public class _duoifyuju {
	public static void main(String[] args) {
		int balance = 5;
		System.out.println("当前余额"+balance+"万元");
		if(balance>=500) {
			System.out.println("买兰博基尼");
		}else if(balance<500&&balance>=200) {
			System.out.println("买卡宴");
		}else if(balance>=50&&balance<200) {
			System.out.println("买奔驰");
		}else {
			System.out.println("买自行车");
		}
			
	}

}
