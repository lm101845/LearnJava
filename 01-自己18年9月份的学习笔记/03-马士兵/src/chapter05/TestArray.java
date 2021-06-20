package chapter05;

public class TestArray {
	public static void main(String[] args) {			//数组args的作用是将输入的数值打印出来用的
		int[] a = {2,4,6,7,3,5,1,9,8};
/*		for (int i = 0;i < a.length;i++) {
			System.out.print(a[i] + " ");
		}
		*/
		for (int i = 0; i < args.length;i++) {
			System.out.println(args[i]);
		}
		
	}

}
