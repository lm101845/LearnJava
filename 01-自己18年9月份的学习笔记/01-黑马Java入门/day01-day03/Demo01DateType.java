/*
java当中的数据类型分为2种：

1.基本类型（今天重点）
	整数类型：byte short int long
	浮点类型：float double
	字符类型：char
	布尔类型：boolean

2.引用类型(以后讲）
	字符串
	数组
	类
	接口等
	
注意事项：对于byte,short,int类型的变量来说，只要右侧不超过左侧的范围即可；
但是对于long类型的变量来说，右侧直接写上就是一个int类型，所以一定要有后缀字母L.
*/
public class Demo01DataType{
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