package day04;

/**选择排序也不熟
 * 作者：李明
 * 日期： 2018年12月24日 上午9:40:55
 * 看的遍数：
 */
public class _xuanzepaixu {
	public static void main(String[] args) {
		int a[] = {99,4,41,1,7,25};
		
		int index;		//保存当前最大的元素所在的位置
		for(int i=1;i<a.length;i++) {		//循环的次数正好比元素个数少一次
			index = 0;
			for(int j=1;j<=a.length-i;j++) {		//<=  !!!!
				if(a[index]<a[j]) {
					index = j;
				}
			}
			int tmp = a[a.length-i];
			a[a.length-i]=a[index];
			a[index]=tmp;
		}
		System.out.println("选择排序的结果：");
		for(int tmp:a) {
			System.out.print(tmp+" ");
		}
	}

}
