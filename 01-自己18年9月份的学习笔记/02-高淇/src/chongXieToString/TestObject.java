package chongXieToString;

/**
 * @姓名 李明
 * @日期 2018�?10�?29日下�?3:11:19
 */
/*
 * Object类中toString方法的源码为�?
 *  public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
 */
public class TestObject {
	public static void main(String[] args) {

		TestObject to = new TestObject();
		System.out.println(to);
		System.out.println(to.toString());

		Person2 p2 = new Person2("希希", 6);
		System.out.println(p2.toString());

	}

	public String toString() {
		return "测试Object对象";   //重写toString方法，这时再调用，则就会覆盖�?
	}

}

class Person2 {
	String name;
	int age;

	@Override    //这是注解符号	
	public String toString() {
		return name + ",年龄" + age;   //person2也重写了toString方法
	}

	public Person2(String name, int age) {     //person2�? 构�?�方�?
		this.name = name;
		this.age = age;
	}

}
