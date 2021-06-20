package shuZu;

import quanXian.User1;

/**
 * @姓名 李明
 * @日期 2018年10月29日下午7:24:59
 * 
 * 1.声明的时候并没有实例化任何对象，只有在实例化数组对象时，JVM才分配空间，这时才与长度有关
 * 2.声明一个数组的时候并没有数组真正被创建
 * 3.构建一个数组，必须指定长度
 */

public class TestArray {

	public static void main(String[] args) {
		int[]     arr01   = new int[10] ;			//索引下标[0, length-1]：0,1,2,3,4,5,6,7,8,9    里面可以放10个int变量
		String[]  arr02 = new  String[5];     //String arr02[]也行

		arr01[0] = 13;
		arr01[1] = 15;
		arr01[2]  = 20;
//		arr01[10] = 100;    // java.lang.ArrayIndexOutOfBoundsException
		
		//通过循环初始化数组
		for(int i=0;i<arr01.length;i++){
			 arr01[i] = 10*i;
		}
		//通过循环读取数组里面元素的值
		for(int i=0;i<arr01.length;i++){
			 System.out.println(arr01[i]);
		}
		
		User1[]   arr03 = new User1[3];
		arr03[0] = new User1(1001,"高淇"); 
		arr03[1] = new User1(1002,"高二淇");
		arr03[2] = new User1(1003,"高三淇");
		
		for(int i=0;i<arr03.length;i++){
			System.out.println(arr03[i].getName());
		}
		
	}
}
