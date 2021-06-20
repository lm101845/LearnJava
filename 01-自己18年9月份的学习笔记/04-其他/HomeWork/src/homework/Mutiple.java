package homework;
/*
 * 用for循环输出99乘法表
 */
public class Mutiple {
	public static void main(String[] args) {
		
		for(int b = 1; b < 10; b++) {
			 for(int a = 1; a<10; a++) {
				 if(a > b)
					 break;
				System.out.print(a + "*" + b + "=" + a * b + "\t");
				
			}
			System.out.println();
		}
	}

}
