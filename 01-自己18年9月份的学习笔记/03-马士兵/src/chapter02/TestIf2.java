package chapter02;
//计算1！+2！+3！+......+10！
public class TestIf2 {
	public static void main(String[] args) {
		long result = 0;			//方法里面是局部变量，局部变量result放在栈里面
		long f = 1;					//方法里面是局部变量，局部变量f放在栈里面
		for (int i = 1; i <= 10; i++) {
			f = f*i;
			result += f;
			
		}
		System.out.println("result=" + result);
	}

}
