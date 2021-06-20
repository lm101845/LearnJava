package quanXian;

/**测试封装
 * @姓名 李明
 * @日期 2018年10月29日下午4:45:40
 */
public class TestEncapsulation {  //封装的意思 
	
	public static void main(String[] args) {
		Human  h = new Human();
//		h.age = 13;   //age被封装起来了，对我来说是不可见的
		h.name = "高淇";    //name为default属性，不能被不同包的类访问         没有被封装，所以可以用
		h.height = 230;
		
		Person4  p4 = new Person4();
//		p4.age = 14;    age已经被私有了，你访问不到
		p4.setAge(-14);
		p4.getName();
		System.out.println(p4.getAge());
	}
}


class   Boy  extends Human {
	public  void  sayHello(){
//		System.out.println(age);		//子类无法使用父类的私有属性和方法（你继承了但是用不了）
	}
}