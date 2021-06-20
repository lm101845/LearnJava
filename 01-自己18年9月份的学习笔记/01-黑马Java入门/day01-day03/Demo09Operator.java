/*
逻辑运算符

与（并且）  &	全部是true才是true;否则就是false.
或（或者）	|	至少一个true就是true;全都是false才是false.
亦或 		^	2个相同就是false;2个不同才是true.（男的和女的结婚才是true)
非（取反）	！	本来是true变成false;本来是false变成true.

注意事项：
	1.逻辑运算符通常用来连接多个布尔值、
	2.如果是2个布尔值进行连接：布尔值A & 布尔值B
	3.如果是取反运算符，那么只能用于一个布尔值身上：！布尔值
*/
public class Demo09Operator{
	public static void main(String[] args){
		
		System.out.println(true&true);	 //true
		System.out.println(true&false);	 //false
		
		System.out.println("==============================================================================");
		
		boolean a= true;
		boolean b= false;
		System.out.println(a&b);	//false
		
		System.out.println("==============================================================================");
		
		System.out.println(true^true);	 	//false
		System.out.println(true^false);	 	//true
		System.out.println(false^true);	 	//true
		System.out.println(false^false);	//false
	}
}