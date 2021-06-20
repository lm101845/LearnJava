package cn.itcast.demo03;

/*
 * @姓名 李明
 * @日期 2018年10月29日下午9:39:56
 * 
 * 设计人员写接口，码农来实践。经理定规章制度，底下人来实行
 * 接口没什么好继承（extends)的，接口里面什么都没有，接口是用来实践（implements)的
 * 
 * 因为接口已经足够简单了，所以可以多继承
 */
public interface MyInterface {
	//接口里面只有：常量、抽象方法！
	
	/*public static final   接口中常量定义时，写或不写都是这样*/
	String MAX_GREAD = "BOSS";
	int MAX_SPEED = 120;
	
	/*public abstract*/ void test01();    //你定的制度肯定是公开的，public可写可不写
	public int test02(int a , int b);
	

}
