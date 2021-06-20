/*
for和while的区别

大多数时候，for循环和while循环可以等效替换，但是二者存在几点区别：
1.for循环格式固定，控制次数更方便；而while循环格式灵活，不太在意循环次数。所以次数确定使用for较多；次数不确定，使用while较多。
2.for循环小括号内定义的变量，循环内使用，循环外不使用；while循环的初始化表达式本来就在外面，仍然可用。
3.跳转语句continue的效果不同。
*/
public class Demo11ForVsWhile{
	public static void main(String[] args){
		for (int a =1;a <= 5;a++){
			System.out.println(a);
		}
			//变量a是定义在for循环内部的，超出了for循环的范围，外面无法使用
			//System.out.println(a);		//错误写法！
			
			System.out.println("=======================================================================");
			
			int b=1;
			while (b <= 5){
				System.out.println(b);
				b++;	
			}
			
			System.out.println("=======================================================================");
			System.out.println(b);		//正确写法！
	}
}