package chapter02;
//f1=1,f2=2,f(n)=f(n-1)+f(n-2)(n>2)
public class Fab {
	public static void main(String[] args) {
		System.out.println(f(5));
	}
	
	public static int f(int n) {
		if (n ==1 || n == 2) {
			return 1;
		}else {
			return f(n-1) + f(n-2);
		}
	}
}
