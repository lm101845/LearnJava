package cn.itcast.day06.demo02;
/**
 *@李明
 *@日期 2018年11月26日 
 *看的遍数：1+1
 *
 * 如何使用定义好的类？
 * 
 * 类就是一种引用数据类型，使用起来可以分成三个步骤：
 * 1.导包
 * 如果需要使用的目标类，和当前类（含有main方法）位于同一个包下的，那么可以省略导包不写，
 * 否则需要使用import导包语句
 * 
 * 2.创建
 * 类名称 对象名 = new 类名称（）；
 * 
 * 马士兵：
 * 对象的创建和使用：
 * 
 * 1.必须使用new关键字创建对象
 * 2.使用对象（或者叫引用）.成员变量来引用对象的成员变量（java里面没有箭头只有点来代替箭头)
 * 3.使用对象（或者叫引用）.方法（参数列表）来调用对象的方法
 * （这些方法在执行的过程中是针对具体的对象，比如方法：捉老鼠，每个狗的属性（腿长，腿短）不一样，同样的方法（捉老鼠）
 * 得到的效果也就不一样（腿长的捉的多，腿短的捉的少）
 * 4.同一类的每个对象有不同的成员变量存储空间
 * 5.同一类的每个对象共享该类的方法--方法共享，但是成员变量各有各的不同。(孩子有的5岁，有的10岁，但都有吃饭方法)
 * （方法就是一段静态的代码，只有在执行的时候，才到内存里面去分配空间）
 * 
 * 3.使用
 * 使用成员变量：对象名.成员变量名
 * 调用成员方法：对象名.成员方法名（参数）
 * 
 */

public class Demo01PhoneOne {
	
	public static void main(String[] args) {
		
		//根据Phone类创建了一个手机对象，名叫one
		Phone one = new Phone();
		
		//访问这个成员变量的默认值
		System.out.println(one.brand); 	//null
		System.out.println(one.price); 	//0.0
		System.out.println(one.color); 	//null
		System.out.println("===========================================================");
		
		one.brand = "苹果";
		one.price = 8388.0;
		one.color = "深空灰";
		System.out.println(one.brand); 	//苹果
		System.out.println(one.price); 	//8388
		System.out.println(one.color); 	//深空灰
		System.out.println("===========================================================");
		
		//调用成员方法
		one.call("乔布斯");     //给乔布斯打电话
		one.sendMessage();		//	群发短信！
		
		
	}

	

}
