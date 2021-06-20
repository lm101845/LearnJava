package day03;

/**
 * 作者：李明
 * 日期： 2018年12月23日 上午10:35:17
 * 看的遍数：
 */
public class _ifandelse {
	public static void main(String[] args) {
		int balance = 1;		//balance是余额的意思
		System.out.println("余额："+balance+"万");
		//把if和else的大括号删掉，会执行if和else的第一条语句，效果和之前是一样的
		if(balance==500) {
			System.out.println("买豪车");
		}else {
			System.out.println("买自行车");
		}
		System.out.println("吃饭、睡觉");
		
	}

}
