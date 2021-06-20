import java.util.Scanner;		//1.导包
/*
1.导包:import java.util.Scanner;

2.创建:Scanner sc = new Scanner(System.in);

3.使用:Srring str = sc.next();

*/
public class Demo12ScannerString{
	public static void main(String[] args){
		
		//2.创建
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("请输入第一个字符串:" );
		//3.使用，获取键盘输入的int数字
		String str1 = sc.nextInt();		//第一次输入
		System.out.println("字符串1:" + strl);	
		
		System.out.println("请输入第二个字符串:" );
		String str2 = sc.next();		//第二次输入
		System.out.println("字符串2:" + str2);	
	}
}