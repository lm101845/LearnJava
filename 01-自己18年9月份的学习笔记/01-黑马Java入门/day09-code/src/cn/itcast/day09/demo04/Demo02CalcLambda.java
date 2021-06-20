package cn.itcast.day09.demo04;
/**
 * 作者：李明
 * 日期： 2018年12月1日 下午4:32:09
 * 看的遍数：1
 * 
 * 函数式编程思想：不需要定义接口实现类
 */
public class Demo02CalcLambda {
	
	public static void main(String[] args) {
		method((a , b)-> a + b);
		
		//Lamdba表达式：(a , b)-> a + b
		//method方法需要一个Calculator接口类型的参数
		//Lamdba表达式就是充当了Calculator接口类型的参数
		//初步理解：
		//1.Lamdba表达式前面的小括号，其实就是接口抽象方法的小括号
		//2.箭头代表拿着小括号的数据做什么事情，是一个指向的动作
		//3.箭头后面代表拿到了参数以后做什么事情
		//Lamdba表达式的语义本身就代表了怎么做这件事情，没有对象的概念在里面。（更加简单直观）
		
		
	}

public static void method(Calculator calculator) {
		
		int result = calculator.sum(10, 20);
		System.out.println("结果是：" + result);
		
	}
}
