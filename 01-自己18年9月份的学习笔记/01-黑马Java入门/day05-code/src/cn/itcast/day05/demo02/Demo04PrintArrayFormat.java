package cn.itcast.day05.demo02;
/**
 *@李明
 *@日期 2018年11月26日 
 *看的遍数：1+1
 *
 * 仍然定义一个方法，进行数组的遍历，但是要求使用指定的格式；
 * 
 * [10, 20, 30, 40, 50]
 * 
 * 怎样实现打印之后不要换行？
 * println去掉其中的ln只写print即可。（ln--> line)
 */

public class Demo04PrintArrayFormat {
	
	public static void main(String[] args) {
		
		int[] array = {10, 20, 30, 40, 50};
		
		printArrayFormat(array);   //调用方法
	}
	
	public static void printArrayFormat(int[] array) {
		
		System.out.print("[");
		for (int i =0; i <array.length; i++) {
			
			//区分一下看是不是最后一个元素
			//如果是最后一个那么直接右中括号
			//如果不是最后一个，则逗号空格
			if(i ==array.length -1) {
				System.out.print(array[i] + "]");	
			}else {
			System.out.print(array[i] + ",");
			}
		}
	}
}