package yiChang;

/**
 * @姓名 李明
 * @日期 2018年11月7日上午2:31:43
 * 
 * 自定义异常：
 * 在程序中，可能会遇到任何标准异常类都没有充分的描述清楚的问题，这种情况下可以创建自己的异常类
 * 
 * 从Exception类或者它的子类派生一个子类即可。
 * 
 * 习惯上，定义的类应该包含两个构造器：一个是默认的构造器，另一个是带有详细信息的构造器
 * 
 * 异常也是类，和我们前面学的是一样的
 * 
 * 处理异常使用建议：
 * 1.要避免使用异常处理代替错误处理，这样会降低程序的清晰性，并且效率低下。
 * 2.处理异常不可以代替简单测试--只在异常情况下使用异常机制
 * 3.不要进行小粒度的异常处理--应该将整个任务包装在一个try语句块中
 * 4.异常往往在高层处理
 * 
 * 
 */
public class MyException extends Exception {

	public MyException() {   //写两个构造器就可以了

	}

	public MyException(String message) {
		super(message);
	}

}

class TestMyException {
	void test() throws MyException {
		///
	}

	public static void main(String[] args) {
		try {
			new TestMyException().test();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
}
