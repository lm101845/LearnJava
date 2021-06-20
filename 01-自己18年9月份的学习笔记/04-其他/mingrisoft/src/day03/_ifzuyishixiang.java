package day03;

/**
 * 作者：李明
 * 日期： 2018年12月23日 上午10:45:41
 * 看的遍数：
 */
public class _ifzuyishixiang {
	public static void main(String[] args) {
		int balance = 1;
		System.out.println("当前的余额："+balance+"万");
		
		 if(balance==500) 
			 System.out.println("钱到账了");
		 if(false)		//这个if与下面的else是配套的，如果这个if是true,则下面的else不会执行
			 System.out.println("买豪车");   //永远不会执行
		 else		//else会匹配离它最近的一个if 		else后面不可以写表达式
			 System.out.println("买自行车");
		 System.out.println("吃饭睡觉");
			 
		 
	}

}
