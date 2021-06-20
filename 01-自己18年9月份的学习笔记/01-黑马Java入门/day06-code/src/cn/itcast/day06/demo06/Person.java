package cn.itcast.day06.demo06;
/**
 *@李明
 *@日期 2018年11月26日 
 *看的遍数：1+1
 *
 * 对于所有的数据类型，Getter都必须叫getXXX， Setter都必须叫setXXX，但是有一个特例
 * 如果是基本数据类型的blloean值，那么setXXX规则不变，而getXXX需要写成isXXX的形式
 */
public class Person {
	
	private String name;
	private int age;
	private boolean male;   //是不是爷们，true代表爷们，false代表不是爷们儿
	
	public boolean isMale() {
		return male;
	}
	
	public void setMale(boolean male) {
		this.male = male; 
	}
	
	public String getName() {			//get没有参数     get有返回值
		return name;
	}
	
	public void setName(String name) {	//set必须有参数   set没有返回值
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
