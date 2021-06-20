/*
变量：程序运行期间，内容可以发生改变的量
变量好比是一种容器，这个容器里面一次只能存放一个数据
本来你在一个小盒子里放了一个数字5，然后这个盒子里的数据又换成了6，这就提现了变量的可变性。

创建一个变量并且使用的格式：
格式1：分成了两步
数据类型 变量名称;		//创建了一个变量
变量名称 = 数据值;		//赋值：将右边的数据值，赋值交给左边的变量

格式2：一步到位
数据类型 变量名称 = 数据值;		//在创建一个变量的同时，立刻放入指定的数据值

*/

public class Demo02Variable{
	public static void main(String[] args){
		//创建一个变量
		//格式：数据类型 变量名称;
		int num1;
		
		//向变量中存入一个数字
		//格式：变量名称 = 数据值;
		num1 = 10;
		//当打印输出变量名称的时候，显示出来的是变量的内容
		System.out.println(num1);	//10
		
		//改变变量当中本来的数字，变成新的数字
		num1 = 20;
		System.out.println(num1);	//20
		
		
		//使用一步到位的格式来定义变量
		//格式：数据类型 变量名称 = 数据值;
		int num2 = 25;
		//我们是不能重复创建名称一样的变量的
		System.out.println(num2);	//25
		
		num2 = 35;
		System.out.println(num2);	//35
		System.out.println("==============================================");
		
		byte num3 = 30;		//注意：右侧数值的范围不能超过左侧数据类型的取值范围
		System.out.println(num3);
		
		//byte num4 = 400;	//右侧400超出了byte的数据范围(-128到127)，会报错
		//System.out.println(num4);
		
		short num5 = 50;
		System.out.println(num5);		//50
		
		long num6 = 3000000000L;
		//30个亿
		//long num6 = 3000000000;
		//这样写不行！！！没有后缀！！！
		//在写long类型的时候，一定不要忘了字母后缀L
		//大小写都可以，但是推荐大写！！！
		System.out.println(num6);		//3000000000
		
		float num7 = 2.5F;
		System.out.println(num7);		//2.5
		
		double num8 = 1.2;
		System.out.println(num8);		//1.2
		
		char zifu1 = 'A';
		System.out.println(zifu1);		//A
		
		char zifu2 = '中';
		//在Java语言中，char类型是允许写一个(只能一个)中国字的
		System.out.println(zifu2);		//中
		
		boolean var1 = true;
		System.out.println(var1);		//true
		
		var1 = false;
		System.out.println(var1);		//false
		
		//将一个变量的数据内容，赋值交给另一个变量
		//右侧的变量名称var1已经存在，里面装的是false布尔值
		//将右侧变量里面的false值，向左交给var2变量进行存储
		boolean var2 = var1;
		System.out.println(var2);		//false
	}
}