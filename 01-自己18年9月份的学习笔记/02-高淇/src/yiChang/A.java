package yiChang;
/**
 * @姓名 李明
 * @日期 2018年11月6日下午11:30:13
 * 
 * 子类声明的异常范围 不能超过父类声明的范围，包含如下意思：
 * 1.父类没有声明异常，子类也不能
 * 2.不可抛出原有方法抛出异常类的父类或上层类
 * 3.抛出的异常类型的数目不可以比原有的方法抛出的还多（不是指个数，而是指类型）
 * 
 * 手动抛出异常：throw
 * 
 * 5个关键字：try,catch,finally,throws,throw
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;


class A {
	public void method() throws IOException {
	}
}

class B extends A {
	public void method() throws FileNotFoundException {
	}
}

class C extends A {
	public void method() {
	}
}

//	class D extends A {		public void method() throws Exception {	}     //超过父类异常的范围，会报错！
//	}

class E extends A {
	public void method() throws IOException, FileNotFoundException {
	}
}

class F extends A {
	public void method() throws IOException, ArithmeticException {
	}
}
//	class G extends A {		public void method() throws IOException, ParseException {	}
//	}
