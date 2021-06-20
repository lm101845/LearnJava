package cn.itcast.day06.demo04;

/**
 * @姓名 李明
 * @日期 2018年11月7日下午11:18:44
 * 看的遍数：1+1
 */
public class Demo01Person {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		
		//设置自己的名字叫做王健林
		person.name = "王建林";
		
		//和对方王思聪打招呼
		person.sayHello("王思聪");
	}

}
