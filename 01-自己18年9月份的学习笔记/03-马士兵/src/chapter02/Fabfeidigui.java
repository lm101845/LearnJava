package chapter02;
//使用非递归方法求f(40)
//三个数调试来调试去

public class Fabfeidigui {
	public static void main(String[] args) {
		System.out.println(f(40));
	}
	
	public static long f(int index) {
		
		if (index < 1) {
			System.out.println("invalid paramerer!");
			return -1;
		}
		
		if (index == 1 || index ==2 ){
			return 1;
		}
		
		long f1 = 1L;
		long f2 = 1L;
		long f = 0;
		for(int i = 0; i < index - 2; i++) {
			f = f1+f2;
			f1 = f2;
			f2 = f;
		}
		return f; 
	}
}
