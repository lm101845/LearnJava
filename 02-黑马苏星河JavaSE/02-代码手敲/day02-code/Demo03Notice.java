/*
对于byte/short/char三种类型来说，如果右侧赋值的数值没有超过范围，
那么javac编译器将会自动隐含的为我们补上一个(byte)/(short)/(char)

1.如果没有超过左侧的范围，编译器会补上强制类型转换
2.如果右侧超过了左侧范围，那么直接编译器报错

*/

public class Demo03Notice{
	public static void main(String[] args){
		byte num1 = /*(byte)*/30;
		//右侧没有超过左侧的范围
		//直接写一个整数，30，它的默认数据类型是int，只不过刚好在byte范围内，所以它没有报错
		//int -->byte，这个不是从小到大，不是自动类型转换！！！！！
		//但是我也没有在30前面写(byte)进行强制类型转换啊！！！！
		//这个就是编译器的功劳了！！！
		
		
		System.out.println(num1);
		
		//byte num2 = 128;
		//右侧超过了左侧的范围，会报错
		//报错信息： 不兼容的类型: 从int转换到byte可能会有损失
		////直接写一个整数，128，它的默认数据类型是int，只不过它超出了byte范围，所以它报错了
		
		//右侧int ->char，没有超过范围
		//编译器将会自动补上一个隐含的(char)
		char zifu = /*(char)*/65;
		System.out.println(zifu);
		//A
	}
}