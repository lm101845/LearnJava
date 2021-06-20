/*
数字当中的"常数"：对于方程式y=2+x来说，其中的数字2是固定不变的，这就是一个常数
程序当中的"常量"：程序运行期间，不可以发生改变的量。

常量的分类：
1.字符串常量：凡是用双引号引起来的内容
2.整数常量：例如100，200，-250
3.浮点常量：例如3.12
4.字符常量：凡是用单引号引起来的单个字符（有且只有一个字符）
5.布尔常量：只有两种取值，true真；false假
6.空常量：null(读作”闹“）		不可以直接用于打印输出

*/
public class DemoConst{
	public static void main(String[] args){
		//字符串常量
		System.out.println("Hello,Java!!!");
		System.out.println(100);
		System.out.println("");		//中间留空，什么都不写是可以的
		//System.out.println('');  //错误写法，字符常量必须有且只有一个字符才行
		//System.out.println(null);错误写法，不能直接打印	
	}
}