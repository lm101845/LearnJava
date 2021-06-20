/*
在给变量进行赋值的时候，如果右侧的表达式当中全都是常量，没有任何变量，
那么编译器javac将会直接将若干个常量表达式计算得到结果。
 short result2 = 5 + 8;  //等号右边全都是常量，没有任何变量参与运算。
 编译之后，得到的.class字节码文件当中相当于【直接就是】 
 short resutt = 13;
 
 只要你都是常量，那结果必然是常量。
 并且右侧的常量结果数值，没有超过左侧范围，所以正确。
 
 这称为"编译器的常量优化"。
 
 但是注意：一旦表达式当中有变量参与，那么就不能进行这种优化了。
*/
public class Demo04Notice{
	public static void main(String[] args){
		 short num1 = 10;
		 //正确写法，右侧没有超过左侧的范围
		 
		 short a = 5;
		 short b = 8;
		 
		 //short result1 = a + b;
		 //short + short --> int + int --> int 
		 //错误写法！左侧需要是int类型
		 //报错：错误: 不兼容的类型: 从int转换到short可能会有损失
		 
		 short result2 = 5 + 8;
		 //右侧不用变量，而是采用常量，而且只有2个常量，没有别人
		 System.out.println(result2);
		 //这个不会报错！！！！！！！！！显示出来是13
		 
		 //short result3 = 5 + a + 8;
		 //一旦表达式当中有变量参与，那么就不能进行这种常量优化了。
	}
}