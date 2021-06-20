package jiCheng;

/**测试继承
 * @author 李明
 * @date 2018年10月29日下午2:24:52
 */
/*
 * 子类继承父类，可以得到父类的全部属性和方法（除了父类的构造方法），但不见得可以直接访问（比如，父类私有的属性和方法）
 * 
 * 如果定义一个类时，没有调用extends,则它的父类是java.lang.Object
 */
public class TestExtends {
	public static void main(String[] args) {
		Student   stu1  =  new Student();
		stu1.name="高淇";    //虽然student类里面没有定义name变量，但是因为继承了person,所以这个变量可以拿来直接用
		stu1.height = 172;
		stu1.rest();
		
		Student  stu2 = new Student("希希",6,"挖掘机专业");
		
		System.out.println(stu2   instanceof  Student);
		System.out.println(stu2   instanceof   Person ); 
		System.out.println(stu2   instanceof   Object ); 
		System.out.println(new Person()   instanceof   Student );   //人不继承student,反了	 false
		System.out.println(new Student()   instanceof   Person );  	//true
		//instanceof是二元运算符，左边是对象，右边是类；当对象是右边类或子类所创建的对象时，返回true,否则返回false
		
	}
}


class  Person   /*extends  Object*/ {
	String  name;
	int   height;
	
	public void  rest(){
		System.out.println("休息一会！");
	}
}

class  Student   extends  Person  {
	//只要写了extends,Person类里面的name， height变量和 rest方法都是我的了，就不用我再写一次了，实现了代码的重用
	String   major;				
	
	public   void   study(){
		System.out.println("学习两小时！");
	}
	
	public  Student(String name,int height, String  major){    //这个是构造函数1
		this.name = name;
		this.height = height;
		this.major = major;
	}
	
	public Student(){		//这个是构造函数2
	}
	
	
}