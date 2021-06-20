package cn.itcast.day07.demo03;
import java.util.ArrayList;
/**
 * 作者：李明
 * 日期： 2018年11月26日 
 * 看的遍数：1
 * 
 * 什么叫做集合呢？
 * 
 * 集合和已经学过的数组比较类似，本身也是一种引用类型，而且可以保存很多个数据
 * 区别在于数组的长度不可以改变，集合的长度可以任意改变
 * 
 * 集合包含很多种：ArrayList 、HashSet 、LinkedList、HashMap......
 * 现阶段我们只学习最简单的ArrayList一种即可，其他的集合类似
 * 
 * java.util.ArrayList是一个类，使用起来就有三个步骤：
 * 
 * 1.导包
 * import java.util.ArrayList
 * 
 * 2.创建
 * 类名称 对象名 = new 类名称（）；
 * 
 * ArrayList常用的构造方法：
 * public ArrayList():默认无参数的构造方法
 * ArrayList<泛型> list = new ArrayList<>();   前面<>里面写个泛型，后面<>留空就行
 * 
 * 泛型：也就是集合当中存放的全都是统一的什么类型的数据
 * 注意：泛型只能是引用类型，不能是基本类型
 * 
 * 3.使用
 * <String>是参数类型，这代表String的集合，就像说ArrayList<Dog>代表Dog的集合
 * 
 * ArrayList与数组的区别：
 * 1.一般数组在创建时就必须确立大小，但对于ArrayList来说，你只需要创建出此类型的对象就行。它不需要指定大小，因为
 * 它会在加入或删除元素时自动调整大小
 * 
 */
public class Demo01ArrayList {
	
	public static void main(String[] args) {
		
		//创建一个集合，存放的都是String字符串类型的数据
		ArrayList<String> list1 = new ArrayList<>();
		
		//泛型只能写引用类型，不能写基本类型，下面是错误写法！
		//ArrayList<int> list2 = new ArrayList<>();
	}

}
