package day03;

import java.util.ArrayList;
import java.util.List;

/**foreach循环极其不熟
 * 作者：李明
 * 日期： 2018年12月23日 下午2:25:12
 * 看的遍数：
 */
public class _foreachxunhuan {
	public static void main(String[] args) {
		int arr[] = {7,10,1};
		List<String> list = new ArrayList<>();
		list.add("我是集合中的元素1");
		list.add("我是集合中的元素2");
		//foreach完成了集合的遍历
		for(String x:list) {
			System.out.println(x);
		}
	}
}
