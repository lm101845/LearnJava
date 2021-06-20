
import java.util.Scanner;
/*
题目：键盘输入两个int数字，并且求出其中的最大值

思路：
1.既然是键盘输入，那么肯定是用Scanner(三个步骤）
2.需要两个数字，所以使用两次nextInt,但是导包和创建没有必要重复
3.情况有几种？
如果a>b,那么最终结果就是a;否则（包含了a<b和a=b两种情况）取用b
反正是a和b两个数字当中取用一个（二者选其一）：标准的if-else语句

*/

public class Demo05MaxTwo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一个数字");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数字");
		int b = sc.nextInt();
		
		if(a>b){		//a大于b,取用a
			System.out.println("最大值："+a);
		}else{			//否则，取用b
			System.out.println("最大值："+b);	
		}
			
	
	}
	
}