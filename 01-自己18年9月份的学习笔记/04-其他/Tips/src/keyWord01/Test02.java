package keyWord01;
/*
 * 如果我们定义一个实体类，返回的结果又会是什么呢？
 */
public class Test02 {
	public static void main(String[] args){
		
		Student p1 = new Student("king", 20);
		System.out.println(p1.toString());		//keyWord.Person@299a06ac
		//很显然业务逻辑不太合适，不应该是一串看不懂的数字，而应该是符合逻辑的东西
		
	}
}
 
class Student{
	String name;
	int age;
	
	Student(String name,int age){
		this.name = name;
		this.age = age;
	}
}
