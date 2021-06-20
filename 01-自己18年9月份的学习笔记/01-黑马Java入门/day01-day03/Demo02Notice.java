/*
使用变量的注意事项

1.创建的多个变量不能重名

2.变量如果没有赋值，不能直接使用；如果要想使用，必须首先赋值
（从本质上讲，变量其实是内存中的一小块区域，使用变量名来访问这块区域，因此，每一个变量使用前必须先申请（声明），然后必须进行赋值（填充内容），才能使用）	

3.变量的作用域问题。
【作用域】变量定义在哪个大括号当中就只能在哪里使用，超出了直接所属的大括号，就不能使用

4.可以通过一个步骤同时定义多个类型相同的变量

java变量：
java变量本质是程序中最基本的存储单元，其要素包括变量名，变量类型和作用域

程序都是在“内存”里面运行的，一个exe文件，你在硬盘上能看到它，但是在硬盘上能运行吗？不能的，你双击它之后它是在内存上面运行的，然后操作系统找到main方法，
也就是找到入口开始运行

变量的类型分配不同的长度，所以，每一个变量是分为不同的数据类型的

*/

public class Demo02Notice{
	
	public static void main(String[] args){
		int num1=100;
		//int num1 =200;	创建了另一个名字也叫num1的变量，错误写法！
		System.out.println(num1);
		
		int num2;
		//num3=30;	没有进行赋值的话
		//System.out.println(num2);	//错误写法！没有赋值的变量不能直接使用
		
		//大括号之内其实可以再写一层大括号
		{
			int num3=40;
			System.out.println(num3);	//40
		}
		//System.out.println(num3);		//错误写法！已经超出了num3直接所属的大括号，外面就不能再用了jir
		//既然出来了，外面没有num3了，那么我们能不能再定义一个num3变量？
		int num3=400;
		System.out.println(num3);
		
		int a, b, c;
		a=10;
		b=20;
		c=30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int x=100,y=200,z=300;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	}
	
}