package cn.itcast.demo03;

/*
 * @姓名 李明
 * @日期 2018年10月29日下午10:30:44
 * 
 * 为什么需要接口？接口和抽象类的区别？
 * 接口就是比“抽象类”还“抽象”的抽象类，可以更加规范的对子类进行约束。全面的专业地实现了：规范和具体实现的分离
 * 
 * 接口就是规范，定义的是一组规则，提现了现实世界中“如果你是.......则必须能......"的思想。（如果你是天使，就必须能飞；如果你是汽车，
 * 就必须能跑；如果你是坏人，就必须欺负好人）
 * 
 * 接口的本质是契约，就像我们人间的法律一样。制定好后大家都遵守。
 * 
 * 项目的具体需求是多变的，我们必须以不变应万变才能从容开发，此处的“不变”就是“规范”。因此，我们开发项目往往都是面向接口编程
 */
public interface Flyable {
	int MAX_SPEED = 11000;
	int MIN_HEIGHT =1; 
	void fly();

}

interface Attack{
	void attack();
}

class Plane implements Flyable{

	@Override
	public void fly() {
		System.out.println("飞机依靠发动机在飞");
		
	}
}

class Man implements Flyable{

	@Override
	public void fly() {
		System.out.println("跳起来，飞！");
		
	}
	
}

 class Stone implements Flyable,Attack{
	int weight;
	@Override
	public void fly() {
		System.out.println("石头扔出去，飞！");
		
	}
	@Override
	public void attack() {
		System.out.println("石头攻击！");
		
	}
	
}
