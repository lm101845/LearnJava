package quanXian;

/**仍然测试封装
 * @姓名 李明
 * @日期 2018年10月29日下午4:48:55
 */
/*
 * 类的属性的处理：
 * 1.一般使用private访问权限
 * 2.提供相应的get/set方法来访问相关属性，这些方法通常是public修饰的，以提供对属性的赋值（set）与读取(get)操作(注意：boolean
 * 变量的get方法是is开头！)
 * 3.一般只
 */
public class Person4 {
	private int id;
	private String name;
	private int age;
	private boolean man;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {   //getname的类型就不是void而是string了
		return this.name;
	}

	public void setAge(int age) {
		if (age >= 1 && age <= 130) {
			this.age = age;
		} else {
			System.out.println("请输入正常的年龄！");
		}
	}

	public int getAge() {
		return this.age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isMan() {
		return man;
	}

	public void setMan(boolean man) {
		this.man = man;
	}

}