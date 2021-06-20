package cn.itcast.day07.demo03;

import java.util.ArrayList;

/**
 * 作者：李明
 * 日期： 2018年11月26日 
 * 看的遍数：1
 * 
 * 题目：遍历集合当中的所有字符串对象
 */
public class Demo03ArrayListEach {
	
	public static void main(String[] args) {
		
		ArrayList<String>list = new ArrayList<>();
		
		//添加：add
		list.add("迪丽热巴");
		list.add("古力娜扎");
		list.add("马尔扎哈");
		
		//遍历输出每一个字符串对象
		System.out.println(list);		//[迪丽热巴, 古力娜扎, 马尔扎哈]
		
		//集合的长度获取：size()
		for(int i = 0; i < list.size();i++) {
			
			//获取一个当前元素：get(int)
			String name = list.get(i);
			System.out.println(name);
			
		}
	}
}
