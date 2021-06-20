//这是定义了一个名字叫做HelloWorld的类，类是java当中所有代码的一个组织单位。
//HelloWorld是类名，第一个{}里面的叫做类体，（）里面的叫方法  （）右边又跟了一个{}，这个叫方法体
//一个源文件中最多只能有一个public类，其他类的个数不限
//如果源文件包含一个public类，它必须按该类名命名
//java 应用程序的执行入口是main()方法。它有固定的书写格式：public static void main(String[] arge){...}
//java语言严格区分大小写
//java方法由一条条语句构成，每条语句以分号结束

//java两个核心：
//1.java虚拟机
//2.垃圾回收机制（不需要程序员手动回收内存了）--内存就是一块地，你租了人家的地，租完要还回去


public class HelloWorld{			// 第三个单词必须和文件名完全一致（单行注释）		
	//第二行是固定写法，基本不能改变，这是程序启动的起点
	
	public static void main(String[] args){
		//第三行开始，就是程序执行的内容。
		//这一行是一个输出语句，也叫打印语句。即使在屏幕当中显示一行字
		//英文的双引号中间就是现实中的文本内容
		System.out.println("Hello,World!");
		System.out.println("I Love Java!");
	}
}

class T {}  	//又定义了一个类，这个类和上面的类是并列的
//每一个类都对应了一个class文件（编译的时候会多出来一个class文件）





/**
文档注释, javadoc.exe
*/


/*多行注释*/

//如果你改了源代码，就要重新对它进行编译