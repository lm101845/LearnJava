/*
赋值运算符分为：
基本赋值运算符：就是一个等号"="，代表将右侧的数据交给左侧的变量。
	int a = 30;
	
复合赋值运算符：
	+=   a += 1          相当于       a = a + 1
	-=   
	*=
	/=
	%=
	
注意事项：
	1.只有变量才能使用赋值运算符，常量不能进行赋值。
	2.复合赋值运算符其中隐含了一个强制类型转换。
*/
public class Demo09Operator{
	public static void main(String[] args){
		int a = 10;
		a += 5;
		System.out.println(a);
		
		//50 = 30;   //常量不能进行赋值！！！
		
		byte num = 30;
		num += 5;
		//num = num + 5;
		//num = byte + int
		//num = int + int
		//num = int
		//num = (byte)int
		System.out.println(num);
	}
}