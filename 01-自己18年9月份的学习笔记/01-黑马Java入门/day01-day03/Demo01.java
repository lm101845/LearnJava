//（1）需求：使用Java类描述一个动物；
//（2）实例：

class Animal{
	String name;	//成员变量
	String color;
	public Animal(String n,String c){
		name = n;
		color = c;
	}
	public void eat(){
		String name = "老鼠";	//局部变量
		System.out.println(name+"在吃……");
	}
}
 
class Demo1{
	public static void main(String[] args){
		Animal dog = new Animal("狗","白色");//此时在内存中存在两份name数据
		Animal cat = new Animal("猫","黑色");
		cat.eat();
	}
}

//（3）运行结果：老鼠在吃........
