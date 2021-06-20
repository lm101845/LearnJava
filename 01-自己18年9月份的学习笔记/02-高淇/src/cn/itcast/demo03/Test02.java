package cn.itcast.demo03;

public class Test02 {
	public static void main(String[] args) {
		 //Animal01 animal = new  Animal01();   抽象类不能被实例化，即不能用new来实例抽象类
		   Animal01 a = new  Cat01();  //这样就可以了（抽象类可以作为一个类型）
	}

}
