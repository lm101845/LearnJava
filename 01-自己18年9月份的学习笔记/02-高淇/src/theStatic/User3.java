package theStatic;

/**
 * 测试静态初始化块的使用
 *
 *先加载类，才能谈到构造对象
 *
 *类变量是在类中定义和存储的。它们的值适用于类极其所有实例。
 *每个实例都将有实例变量的一个副本，它们可以修改实例变量的值，而不会影响其他的实例；而类变量只有一个副本，修改它的值将影响
 *所有的实例
 *
 *定义类变量的方法是，在前面加上关键字static
 *
 */
public class User3 {
	int id; // id
	String name; // 账户名
	String pwd; // 密码
	static String company; // 公司名称

	static {    //这个是静态块     这块不是个方法，仅仅是个语句块而已    在类初始化的时候进行执行
		System.out.println("执行类的初始化工作");    //初始化类，现在是画图纸
		company = "北京尚学堂";
		printCompany();
		//在static块里面不能调用普通的属性和普通的方法，因为这个时候是类的初始化
	}

	public static void printCompany() {
		System.out.println(company);
	}

	public static void main(String[] args) {
		User3 u3 = null;
	}
}