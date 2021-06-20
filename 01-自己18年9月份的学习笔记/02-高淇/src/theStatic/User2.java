package theStatic;

/**
 * @author 李明
 * @日期 2018年10月29日下午4:49:02
 * 
 * 测试static关键字的用法
 *
 *汽车都有了，图纸一定有 ---在普通方法里面可以调用静态方法，反之不可以
 */
public class User2 {
	int id; // id
	String name; // 账户名
	String pwd; // 密码

	static String company = "北京尚学堂"; // 公司名称 --这是static属性

	public User2(int id, String name) {    //构造方法
		this.id = id;
		this.name = name;
	}

	public void login() {			//这是普通方法
		printCompany();     //汽车都有了，图纸一定有 ---在普通方法里面可以调用静态方法
		System.out.println(company);   //调用静态的属性也是一点问题都没有
		System.out.println("登录：" + name);
	}

	public static void printCompany() {			//这是static方法
//         login();//在静态方法里面不可以调用非静态方法，编译就会报错
		System.out.println(company);    //在静态方法里面显然可以使用静态变量
	}

	public static void main(String[] args) {
		
		User2 u = new User2(101, "高小七");
		User2.printCompany();    //通过类名去调printCompany()
		
		User2.company = "阿里巴巴";  //通过类名去调company
		User2.printCompany();
	}
}