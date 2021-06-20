package day04;

import java.util.Arrays;

/**
 * 作者：李明
 * 日期： 2018年12月24日 上午9:09:36
 * 看的遍数：
 */
public class _fuzhishuzu {
	public static void main(String[] args) {
		int a[] = new int[] {12,23,56,54,2,2};
		
		//int newArr[] = Arrays.copyOf(a,6);
		
		int newArr[] = Arrays.copyOfRange(a, 1, 4);   //前闭后开
		
		for(int tmp:newArr) {
			System.out.println(tmp);
		}
	}

}
