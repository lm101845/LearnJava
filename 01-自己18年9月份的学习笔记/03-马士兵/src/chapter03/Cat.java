package chapter03;      
/*
 * 1.main方法不需要new一个对象就可以运行
 *2.动态方法是针对某一个对象来调用的，静态方法不再是针对某个对象调用，没有对象照样调用
 *3.java中没有指针，只有“引用”
*
*static关键字:
*1.在类中，用static声明的成员变量为静态成员变量，它为该类的公用变量，在第一次使用时被初始化，对于该类的所有对象来说，
*static成员变量只有一份
*
*2.用static声明的方法为静态方法，在调用该方法时，不会将对象的引用传递给它，所以在static方法中不可访问非static的成员
*（静态方法不再是针对某个对象调用，所以不能访问非静态成员）
*
*3.可以通过对象引用或类名（不需要实例化）访问静态成员
*
*
 */
public class Cat {
	 private static int sid = 0;
	    private String name; 
	    int id;
	    Cat(String name) {
	        this.name = name;  
	        id = sid++;
	    }
	    public void info(){
	        System.out.println
	               ("My name is "+name+" No."+id);
	    }
	    public static void main(String arg[]){

	        Cat.sid = 100;
	        Cat mimi = new Cat("mimi");
	        mimi.sid = 2000;
	        Cat pipi = new Cat("pipi");
	        mimi.info(); 
	        pipi.info();
	    }

}
