package day04;

/**
 * 作者：李明
 * 日期： 2018年12月24日 上午7:37:01
 * 看的遍数：
 */
public class _shuzumax {
	public static void main(String[] args) {
		//数组元素不能有小数
		int a[] = {1,233,46,32,56,12,97,66,7};
		int max = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}
}
