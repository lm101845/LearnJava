import java.util.Scanner;
/*
键盘输入一个考试成绩（0=100），进行等级划分

结果不对啊
*/
public class Demo03IfElseExt{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入考试成绩：");
		int score = sc.nextInt();	//获取键盘输入的int数字，放到变量score当中	
		
				
		if(score >= 90 && score <= 100){	
			System.out.println("优秀");	
	    }else if(score >= 80 && score < 90){
			System.out.println("良好");
		}else if(score >= 70 && score < 80){
			System.out.println("中等");
		}else if(score >= 60 && score < 70){
			System.out.println("及格");
		}else if(score >= 0 && score < 60){
			System.out.println("不及格");
		}else {	//边界情况，复数或者超过100
			System.out.println("数据错误");
		}
	
	}
}                   