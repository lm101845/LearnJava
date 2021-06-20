/*
强制类型转换
	1.特点：代码需要进行特殊的格式处理，不能自动完成。
	2.格式：范围小的类型 范围小的变量名 = (范围小的类型)原本范围大的数据;
	
注意事项：
	1.强制类型转换一般不推荐使用，因为有可能发生精度损失，数据溢出。
	2.byte/short/char这3种类型都可以发生数学运算，例如加法"+"
	3.byte/short/char这3种类型在运算的时候，都会首先被提升为int类型，然后再计算。
	4.boolean类型不能发生数据类型转换！！！Java和其他语言是不一样的！！true/false是不能当成1/0的！！！！！！
*/
public class Demo02DataType{
	public static void main(String[] args){
		int num = 100;
		System.out.println(num);
		
		//int num2 = 100L;
		//报错： 错误: 不兼容的类型: 从long转换到int可能会有损失(这不是从小到大，所以无法发生自动类型转换)
		//System.out.println(num2);
		
		//格式：范围小的类型 范围小的变量名 = (范围小的类型)原本范围大的数据;
		//你想转成谁，你就在小括号里面写谁
		int num3 = (int)108L;
		System.out.println(num3);
		
		//int num4 = 6000000000;
		//左边是int，右边没有后缀也是int
		//但是int类型最多可以表示21个亿，我们这里是60个亿，超了。
		//System.out.println(num4);
		// 错误: 过大的整数: 6000000000
		
		
		int num5 = (int)6000000000L;
		//将右侧的long类型(60个亿)强制转换为左侧的int类型(最高表示21个亿)
		//格式虽然写对了，但是出现的结果肯定不是60个亿！！最高表示到21个亿。
		System.out.println(num5);
		//1705032704  17个亿，发生了数据溢出。
		
		//double --> int，这个不是从小到大，所以我们要使用强制类型转换。
		int num6 = (int)3.999;
		System.out.println(num6); 
		// 3  这个不是四舍五入，而是精度损失,所有的小数位都会被舍弃掉
		
		char zifu1 = 'A';    //这是一个字符型变量，里面是大写字母A
		System.out.println(zifu1 + 1);   
		//结果是66
		//也就是大写字母A被当作65进行处理了
		//计算机当中一切的数据都是二进制的。
		//计算机的底层会用一个数字(二进制)来表示字符A，就是65！！！！
		//一旦char类型进行了数学运算，那么字符就会按照一定的规则翻译成为一个数字。
		
		byte num7 = 40;
		//注意：右侧的数值大小不能超过左侧的类型范围，否则会报错！！！
		byte num8 = 50;
		//byte result1 = num7 + num8;
		//byte + byte，首先会提升为int类型。
		//byte + byte --> int + int -->int
		//所以result1数据类型应该是int,而不是byte
		//报错：错误: 不兼容的类型: 从int转换到byte可能会有损失
		int result2 = num7 + num8;
		System.out.println(result2);
		//90
		
		short num9 = 60;
		int result3 = num7 + num9;
		//byte + short --> int + int --> int
		
		short result4 = (short)(num7 + num9);
		//将int强制转换为short：注意必须保证逻辑上真实大小本来就没有超过short范围，否则会发生数据溢出。
		System.out.println(result4);
	}
}