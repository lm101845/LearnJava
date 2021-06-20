package day03;

import java.util.Scanner;

/**判断闰年：四年一闰，百年不润，四百年再闰
 * 作者：李明
 * 日期： 2018年12月23日 上午11:13:47
 * 看的遍数：
 */
public class _panduanrunnian {
	public static void main(String[] args) {
		int year = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份：");
		year = sc.nextInt();
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println(year+"年是闰年");	//2000
				}else {
					System.out.println(year+"年不是闰年");	//1900
				}
				
			}else {
				System.out.println(year+"年是闰年");
			}
			
		}else {
			System.out.println(year+"年不是闰年");
		}
	}

}
