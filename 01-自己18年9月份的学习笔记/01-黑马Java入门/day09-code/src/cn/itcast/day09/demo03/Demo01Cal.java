package cn.itcast.day09.demo03;

/**
 * 作者：李明
 * 日期： 2018年12月1日 下午4:32:09
 * 看的遍数：1
 */
public class Demo01Cal {
	public static void main(String[] args) {

		// 首先使用接口的格式来创建了一个计算器对象
		Calculator calculator = new CalculatorImpl();      //左边接口右边类

		// 将计算器对象交给method方法区使用
		method(calculator);
	}

	// 参数是接口类型：计算器接口
	public static void method(Calculator calculator) {		//方法体里面是接口类型

		int result = calculator.sum(10, 20);
		System.out.println("结果是：" + result);

	}

}
