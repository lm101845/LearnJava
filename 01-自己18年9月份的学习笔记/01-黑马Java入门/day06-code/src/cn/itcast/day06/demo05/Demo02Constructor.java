package cn.itcast.day06.demo05;

/**
 * @姓名 李明
 * @日期 2018年11月7日下午11:21:12
 * 看的遍数：1+1
 */
public class Demo02Constructor {
	
	public static void main(String[] args) {
		
		//调用无参数的构造方法来创建对象
		Student one = new Student();		//无参数的构造方法执行！
		
		//调用有参数的构造方法来创建对象
		Student two = new Student(18);		//有参数的构造方法执行！18
		System.out.println("==================================");
		
		Student stu = new Student();		//无参数的构造方法执行！
		stu.setName("赵丽颖");
		stu.setAge(20);
		System.out.println("姓名：" + stu.getName() + ",年龄" +stu.getAge() );   //姓名：赵丽颖,年龄20
		System.out.println("==================================");
		
		//直接在new的时候通过构造方法给成员变量赋值
		Student stu2 = new Student("柳岩",18);		//有2个参数的构造方法执行！
		System.out.println("姓名：" + stu2.getName() + ",年龄" +stu2.getAge() );		//姓名：柳岩,年龄18
		
		//改变成员变量的值,则仍然要使用这个set
		stu2.setAge(19);
		System.out.println("姓名：" + stu2.getName() + ",年龄" +stu2.getAge() );    //姓名：柳岩,年龄19
	}

}
