package day05;
/*
 * 变量名首写字母使用小写，如果由多个单词组成，从第2个单词开始的其他单词的首写字母使用大写。
如果局部变量的名字和成员变量的名字相同， 要想在该方法中使用成员变量，必须使用关键字this
 */
class People {
	String name = "类体重定义的name";			//类中的成员变量并赋值
 
	People(){
	}
	
	public void speak() {
		String name = "类体方法中定义的name";		//在方法speak中定义和成员变量名字相同的name并赋值
		System.out.println(name);
		System.out.println(this.name);		//通过this来访问类中的成员变量
		
	}
}
 
 
public class TestThis {          //源文件中只能有一个类是public类，并且源文件的名字必须与这个类的名字完全相同，如
                                        //果没有public类，那么源文件的名字只要和某个类的名字相同就可以了。
	public static void main(String[] args) {       
		People myPeople = new People();
		myPeople.speak();
	}
 
}
