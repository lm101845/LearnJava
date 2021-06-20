package day04;

/**
 * 作者：李明
 * 日期： 2018年12月24日 上午9:21:57
 * 看的遍数：
 */
public class _maopaopaixun {
	public static void main(String[] args) {
		int a[] = {1,4,3,6,7,4};
		
		for(int i=1;i<a.length;i++) {		//6个元素只要比较5轮就行了，所以i从1开始
			for(int j=0;j<a.length-i;j++) {
				if(a[j]>a[j+1]) {		//当前查找的元素比我后面的元素大，则交换   控制排序结果，大于则升序，小于则降序
					int tmp = a[j];
					a[j]=a[j+1];
					a[j+1]=tmp; 
				}
			}
		}
		System.out.println("冒泡排序的结果:");
		for(int tmp:a) {
			System.out.print(tmp+" ");
		}
	}
}
