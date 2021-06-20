package chouXiangLei;

/**
 * @姓名 李明
 * @日期 2018年11月5日上午9:52:37
 * 
 * 抽象类的必要性：
 * 当父类的一些方法不能确定时，可以用abstract关键字来修饰该方法【变成了抽象方法】
 * 
 * 抽象类不能被实例化
 * 抽象方法不能有主体
 */
public class Test {
	
	public static void main(String[] args) {
		
	}

}
//抽象类--仍然可以被继承
abstract class Animal{
	String name;
	int age;
	
	//动物会叫
	abstract public void cry();			
		//System.out.println("不知道怎么叫");				这个父类方法被继承后就不可能被用到了
	
}

//当一个类继承的父类是抽象类的话，需要我们把抽象类中的所有抽象方法全部实现
class Cat extends Animal{
	//实现父类的cry
	public void cry() {
		
		// 什么都没干，也叫实现
		
	}
}
