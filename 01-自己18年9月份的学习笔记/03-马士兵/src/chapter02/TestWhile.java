package chapter02;

public class TestWhile {
	public static void main(String[] args) {
		int i =0;
		while (i <10) {
			System.out.println(i);
			i++;
		}
		
		i =0;
		do {
			i++;
			System.out.println(i);
		} while (i < 10);
							
		
	
				//不能写int i =0;因为前面已经声明了一个变量了，不能在同一个作用域里面再次声明一个变量）
					//这个是有分号的
		

	}
}
