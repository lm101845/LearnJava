package jiCheng;

/**测试重写(override)/覆盖
 * @author 李明
 * @date 2018年10月29日下午2:47:57
 */
/*
 * 方法的重写需要满足下面三个要点：
 * 1.方法名，形参列表相同
 * 2.返回值类型和声明异常类型：子类小于等于父类
 * 3.访问权限：子类大于等于父类
 */
public class TestOverride {
	public static void main(String[] args) {
		Horse   h   =  new Horse();
		h.run();
	}
}


class  Vehicle {
public  void  run(){
	System.out.println("跑....");
}

public   void stop(){
	System.out.println("停止！");
}

public  Person   whoIsPsg(){
	return  new Person();   //这个是父类里面的返回乘客
}

}

class    Horse   extends  Vehicle {
public  void  run(){
	System.out.println("四蹄翻飞，嘚嘚的。。。");
}

public  Student   whoIsPsg(){//返回值类型和声明异常类型子类小于等于父类的类型
	return  new Student();
}

}
