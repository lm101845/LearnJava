package collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @姓名 李明
 * @日期 2018年11月7日上午6:44:58
 * 
 * Collection接口：定义了存取一组对象的方法，其子接口Set和List分别定义了存储方式
 * -Set中的数据对象没有顺序且不可以重复
 * -List中的数据对象有顺序且可以重复
 * -Map接口定义了存储"键(key)-值(value)映射对"的方法	
 * 
 */
public class Test01 {
	public static void main(String[] args) {
		
		List list1 = new ArrayList();  //ArrayList是List的子类    右边是实现类，左边是接口
		//ArrayList:底层实现是数组。查询快；修改、插入、删除慢。
		//LinkedList：底层实现是链表。查询慢；修改、插入、删除快。
		//Vector(向量）：线程安全的，效率低。（前面两个线程不安全，效率高）
		
		list1.add("aaa");
		list1.add("aaa");
		list1.add(new Date());
		list1.add(new Dog());
		list1.add(1234);    //包装类的：自动装箱！
		list1.remove(new String("aaa"));
		System.out.println(list1.size());     //4   放了4个对象
		for(int i = 0; i< list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		list1.set(3,new String("3333"));
		list1.add(4,new String("3333"));
		System.out.println(list1.isEmpty());  //false
		
		list1.remove("aaa");
		list1.remove(new Date());		//hashcode和equals
		System.out.println(list1.size());     //3   移除了1个对象（字符串常量，是同一个对象）
		
		
		List list2 = new ArrayList();
		list2.add("bbb");
		list2.add("ccc");
		list1.add(list2);
		System.out.println(list1.size());     //4   4指的是种类  
		
		//跟顺序的操作
		list1.get(0);
		//String str = (String) list1.get(0);
		//System.out.println(str);
		list1.set(1,"ababa");
		System.out.println(list1);
		list1.remove(0);
		System.out.println(list1);
		
 	}

}

class Dog{
	
}