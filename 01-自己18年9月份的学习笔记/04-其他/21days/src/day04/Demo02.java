package day04;
/**
 * 作者：李明
 * 日期： 2018年12月23日 下午12:23:48
 * 看的遍数：1
 * 
 * switch语句基于一个测试变量，测试变量将依次与每个case值进行比较，如果找到匹配的值，则执行相应的语句
 * 
 * switch语句中的测试只可能是可转换为int类型的基本数据类型，如char或字符串。不能在switch中使用更大的数据类型，
 * 如long,float,string,也不能测试除相等性外的其他关系
 * 
 * 在每个case后，可以有任意数目的语句。与if不同的是，不必将多条语句用花括号扩起
 * 
 */

import java.util.Scanner;		//util表示工具包

public class Demo02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个整数：");
		int num = sc.nextInt();
		
		switch(num) {
		
		case 1:
			System.out.println("1楼");
			break;
		
		case 2:
			System.out.println("2楼");
			break;
		
		case 3:
			System.out.println("3楼");
			break;
		
		default:		//如果没有找到匹配的值，则执行default操作。default语句是可选的，如果被省略，则没有
						//任何case匹配时，将不执行任何操作
			System.out.println("楼层错误");
		
		}
	}
}
