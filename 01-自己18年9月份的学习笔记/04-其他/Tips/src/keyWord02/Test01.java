package keyWord02;
/*
 * 这就表示Object中的toString方法已经不够用了。所以Object中的toString方法就是要被重写。
 */
public class Test01 {

	public static void main(String[] args) {
		
		Person p1 = new Person("king", 20);
		System.out.println(p1.toString());  //Person[name=king, age=20]

	}
}

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Person[name=" + name + ", age=" + age + "]";
		
		//这里就把toString方法重新写了，注意toString的返回值是String，结果明显就很符合逻辑了
	}
}
