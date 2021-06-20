package day03;

/**
 * 作者：李明
 * 日期： 2018年12月23日 上午10:21:04
 * 看的遍数：
 */
public class _ifcuowuyongfa {
	public static void main(String[] args) {
		int num = 1;
		if(num==500);	//因为这里加了一个分号，导致明明账户没有500万，还显示买豪车
		{
			System.out.println("我的账户有500万");
			System.out.println("买豪车");
		}
		System.out.println("吃饭、睡觉");		//永远执行
	}

}
