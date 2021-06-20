package chapter06;

import java.util.ArrayList;

public class Demo01ArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Egg> myList = new ArrayList<>();    //创建
		
		Egg s = new Egg(); 
		myList.add(s);   //加入元素
		
		Egg b = new Egg(); 
		myList.add(b);   //再加入元素
		
		int thesize = myList.size();  //查询大小  因为myList有两个元素，size()会返回2
		
		boolean isIn = myList.contains(s);  //查询特定元素  因为myList带有s所引用的 Egg对象，所以此方法会返回true
		
		boolean empty = myList.isEmpty();   //判断集合是否为空
		
		myList.remove(s);   //删除元素
		
		
		
	}
	

}
