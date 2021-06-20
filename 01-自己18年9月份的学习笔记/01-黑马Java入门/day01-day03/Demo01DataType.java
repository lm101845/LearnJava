/*
java当中的数据类型分为2种：

1.基本类型（今天重点）
	整数类型：byte（1） short（2） int（4）（默认） long（8）（表示这个后面要增加L)
	
	byte范围：-128-127
	short范围：-2^15-2^15-1
	int范围： -2^31-2^31-1
	long范围：-2^63-2^63-1
	
	
	浮点类型：float(4)(表示这个后面要加F)	double(8)(默认） 			
	在计算机中表示浮点数是有误差的，float小数点7位后就不精确了，double小数点后面15位就不精确了
	因为在数学中小数是连续的，但是在计算机中小数是离散的
	float范围：-3.403E38-3.403E38
	double范围：-1.798E308-1.798E308(10的308次方，是个很大的数）
	
	字符类型：char（单引号）
	
	布尔类型：boolean

2.引用类型(以后讲）  -----基础类型（8个）之外的类型全部都叫引用类型
	字符串：String（双引号）
	数组
	类
	接口等
	
	注意：引用类型占两块内存！！！
	举例：String s;  
	定义了一个引用类型（String是引用类型）变量s
	
	 s = new String("Hello World");
	 使用new语句创建了一个String类型的对象并用s指向它
	 以后可以通过s完成对其的操作
	 
	 
	 
	 

	
注意事项：对于byte,short,int类型的变量来说，只要右侧不超过左侧的范围即可；
但是对于long类型的变量来说，右侧直接写上就是一个int类型，所以一定要有后缀字母L.

java采用Unicode编码，每个字符占2个字节,因而可用16进制编码形式表示（1字节=8位  1Byte = 8bit)
java里面所有的数字都是带符号的，都是从负数到正数


3.字符转换
a.boolean类型不可以转换为其他的数据类型

b.整型、字符型（本质也是010101二进制）、浮点型的数据在混合运算中相互转换，转换时遵循以下原则：
容量小的类型自动转换为容量大的数据类型；数据类型按容量大小排序为：
byte,short,char->int->long->float->double
byte,short,char之间不会互相转换，他们三者在计算时首先回转为int类型

c.容量大的数据类型转换为容量小的数据类型时，要加上强制转换符，但可能造成精度降低或溢出，使用时要格外注意
（整数四个类型，容量大类型转为小的类型时，超出的部分会砍掉。但浮点型大的转小的，没办法砍掉，因为有表示小数的字符）

d.有多种类型的数据混合运算是时，系统首先自动的将所有数据转换成容量最大的那一种数据类型，然后再进行运算





*/
public class Demo01DateType{
	public static void main(String[]args){
		//首先使用整数类型对应的变量
		//方案1，两个步骤
		byte num1;	//创建一个byte类型的变量，名称叫做num1
		num1=100;	//赋值，将右侧的常量100，交给左侧的变量num1进行存储
		System.out.println(num1);	//显示100
		
		num1=108;	//改变了变量num1当中的数据
		System.out.println(num1);
			//方案2，一个步骤
		byte num2 = 90;		//右侧进行赋值的数值，不能超过左侧变量的类型范围
		System.out.println(num2);
		
		//注意！右侧是一个int类型的常量，所以直接写上就超过了21个亿
		//long num3=4200000000;	//42个亿
		long num3=4200000000L;	//必须要加个L后缀才行
		System.out.println(num3);
		
		//右侧是一个浮点数，默认是double类型，但是左侧是float类型，
		//float num4=3.14;	//错误写法！
		float num4=3.14F;	//右边带有后缀F的，所以右边是float类型
		System.out.println(num4);
	
		char zifu1 ='A';
		System.out.println(zifu1);
		
		char zifu2 ='中';
		System.out.println(zifu2);
		
		boolean var1=true;
		System.out.println(var1);
		
		//如何使用字符串类型的变量呢？
		//字符串类型的写法是：String(不是关键字）
		
		String str1;
		str1="Hello";
		System.out.println(str1);
	}
	
}