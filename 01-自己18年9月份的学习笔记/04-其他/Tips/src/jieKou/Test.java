package jieKou;

/**
 * @姓名 李明
 * @日期 2018年11月5日上午10:27:17
 * 
 * 接口注意事项：
 * 1.接口中的变量，本质上都是static的，不管你加不加static修饰
 * 2.在java开发中，我们把经常用的变量，定义在接口中，作为全剧变量使用。访问形式：接口名.变量名
 * 3.一个接口不能继承其他的类，但是可以继承别的接口
 * 
 * 接口是更加抽象的抽象类
 */
public class Test {
	public static void main(String[] args) {
		System.out.println(Usb.a);
		
		Computer computer = new Computer();
		
		Camera camera1 = new Camera();
		
		Phone01 phone1 = new Phone01();
		
		computer.useUsb(camera1);
		computer.useUsb(phone1);
		
	}

}
//定义Usb接口
interface Usb{
	int a = 1;   //接口中可以有变量，且本质上都是静态的(不管你加不加static)
	
	//声明了2个方法
	public void start();
	public void stop();
}
//接口继承别的接口
class Aaa{
	
}
interface Tt{
	
}
interface Son extends Tt{
	
}
//接口不能继承类，但能继承另一个接口
interface Kkk /*extends Aaa*/{		//什么都没写也是一个接口，这是个最简单的接口
	// public void cry();
}
//编写照相机类，并实现Usb接口
//一个重要的原则:当一个类实现了一个接口，就要求该类把这个接口的所有方法统统实现
class Camera implements Usb,Kkk{
	
	public void start() {
		
		System.out.println("我是相机，开始工作了！");
	}
	
	public void stop() {
		
		System.out.println("我是相机，停止工作了！");
	}
}


class Phone01 implements Usb{
	public void start() {
		
		System.out.println("我是手机，开始工作了！");
	}
	
	public void stop() {
		
		System.out.println("我是手机，停止工作了！");
	}
	
}
//计算机
class Computer{
	public void useUsb(Usb usb) {
		
		usb.start();
		usb.stop();
	}
}

