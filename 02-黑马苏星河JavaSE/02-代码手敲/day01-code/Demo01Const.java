/*
常量：在程序运行期间，固定不变的量叫常量

常量的分类：
	1.字符串常量：凡是用双引号引起来的部分，叫做字符串常量。例如："abc"、"hello"、"123"
	2.整数常量：直接写上的数字，没有小数点。例如：100，200，0，-250
	3.浮点数常量：直接写上的数字，但有小数点。例如：2.5，-3.14，0.0
	4.字符常量：凡是用单引号引起来的单个字符(有且仅有一个字符，不能写2个字符，也不能一个字符不写)，
				就叫做字符常量(和字符串常量注意区别！！！)。例如：'A'，'b','9','中'(Java中一个字符也可以是中文！！！)
	5.布尔常量：只有2种取值，true和false
	6.空常量：null。代表没有任何数据
*/

public class Demo01Const{
	public static void main(String[] args){
		//1.字符串常量(注意：是双引号)
		System.out.println("ABC");
		System.out.println("");
		System.out.println("XYZ");
		
		//2.整数常量
		System.out.println(30);
		System.out.println(-500);
		
		//3.浮点数常量(小数)
		System.out.println(3.14);
		System.out.println(-2.5);
		
		//4.字符常量
		System.out.println('A');
		System.out.println('6');
		
		//System.out.println('');
		//什么都没往里写：这个会报错！！！
		//注意：两个单引号中间必须有且仅有一个空格，没有不行！！！！！
		
		//System.out.println('AB');
		//单引号里面写了2个字符，也会报错！！！
		//注意：两个单引号中间必须有且仅有一个空格，有2个也不行，有且仅有1个！！！！
		
		System.out.println(' ');
		//单引号里面敲了空格(空格也是内容，虽然看不到)：这个不会报错
		
		//5.布尔常量(只有2种取值)
		System.out.println(true);
		System.out.println(false);
		
		//6.空常量(空常量不能直接用来打印输出)
		//System.out.println(null);
		//这种写法是错误的！！！！
		//也很好理解，null表示什么东西都没有，既然你什么东西都没有，你还显示什么呢？？
		
	}
	
} 