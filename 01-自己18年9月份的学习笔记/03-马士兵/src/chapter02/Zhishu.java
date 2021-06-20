package chapter02;
//求出101-200内的质数

public class Zhishu {
	public static void main(String[] args) {
		for (int i =101;i <200; i += 2) {		//偶数肯定不是质数，所以连加2
			boolean f = true;		//假定f是真
			for (int j =2; j < i; j++) {
				if (i % j ==0) {
					f =false;
					break;			//break是将里面的一层if终止
				}
			}
			if (!f) {continue;}
			System.out.println("" + i);
		}
	}

}
