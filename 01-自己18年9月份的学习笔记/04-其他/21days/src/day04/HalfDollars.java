package day04;

/*
 * @姓名 李明
 * @日期 2018年10月30日下午12:25:18
 * 
 * java中忽略"_"这个下划线，让代码更加容易读
 * 
 * 块语句：java中的语句被组织为块。块以花括号开始和结束--左花括号（{）表示开始，右花括号（}）表示结束
 * 使用块时，需要注意的一点是，它在块中声明的变量创建了作用域。作用域是程序的一部分，在其中变量存在并可使用。如果在变量的作用域外
 * 要使用它，将发生错误 	
 * 
 * 要在if中完成多项操作，而不仅仅是一项，可以将这些语句放在块中
 */
class HalfDollars {
	public static void main(String[] arguments) {
		
		int[] denver = { 1_700_000, 4_600_000, 2_100_000 };
		int[] philadelphia = new int[denver.length];
		int[] total = new int[denver.length];
		int average;

		philadelphia[0] = 1_800_000;
		philadelphia[1] = 5_000_000;
		philadelphia[2] = 2_500_000;

		total[0] = denver[0] + philadelphia[0];
		total[1] = denver[1] + philadelphia[1];
		total[2] = denver[2] + philadelphia[2];
		average = (total[0] + total[1] + total[2]) / 3;

		System.out.print("2012 production: ");
		System.out.format("%,d%n", total[0]);
		
		System.out.print("2013 production: ");
		System.out.format("%,d%n", total[1]);
		
		System.out.print("2014 production: ");
		System.out.format("%,d%n", total[2]);
		
		System.out.print("Average production: ");
		System.out.format("%,d%n", average);
	}
}
