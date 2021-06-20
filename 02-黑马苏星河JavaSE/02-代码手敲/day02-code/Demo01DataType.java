/*
当数据类型不一样时，将会发生数据类型转换

自动类型转换(隐式)
	1.特点：代码不需要进行特殊处理，自动完成。
	2.规则：数据范围从小到大(与它的字节数不一样相关！！！！见long和float)。

强制类型转换(显式)
*/
public class Demo01DataType{
	public static void main(String[] args){
		System.out.println(1024);  //这就是一个整数，默认是int类型
		System.out.println(3.14); //这就是一个浮点数，默认就是double类型
		
		long num1 = 100L;
		System.out.println(num1);    //100  
		
		//左边是long类型，右边没有后缀，是默认的int类型，左右不一样
		//一个等号代表赋值，将右侧的int常量，交给左侧的long变量进行存储
		//int  --> long (右侧的int放到左边的long容器中，能装下)，这符合了数据范围从小到大的要求
		//这一行代码发生了自动类型转换。
		long num2 = 108;    
		//100后面不加L也行，它会自动转换
		System.out.println(num2);
		
		//左边是double类型，右边是float类型，左右不一样
		//float -->double，符合从小到大的规则，也发生了自动类型转换
		double num3 = 2.5F;
		System.out.println(num3);
		
		
		//注意：float占4个字节，L占8个字节！！但是float能表示数的范围更大！！
		//long --> float:范围是float更大一些，符合从小到大的规则，也发生了自动类型转换
		float num4 = 30L;
		System.out.println(num4);   //显示30.0而不是30
	}
}