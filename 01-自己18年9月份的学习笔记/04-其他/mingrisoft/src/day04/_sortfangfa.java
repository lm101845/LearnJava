package day04;

import java.util.Arrays;

/**
 * 作者：李明
 * 日期： 2018年12月24日 上午10:18:08
 * 看的遍数：
 */
public class _sortfangfa {
	public static void main(String[] args) {
		int a[] = new int[] {1,5,7,2,1};
		
		Arrays.sort(a);		//sort方法可以直接排序，但是只能升序
		for(int tmp:a) {
			System.out.print(tmp+" ");
		}
	}

}
