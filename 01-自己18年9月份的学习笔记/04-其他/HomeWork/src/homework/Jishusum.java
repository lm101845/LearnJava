package homework;

//求1+3+5+7奇数求和

public class Jishusum {
	public static void main(String[] args) {
		//int sum = 0;
		//for (int i =1;i <=7;i = i+2) {
			//sum =sum+i;
		//}
		//System.out.println("sum=" + sum);
		
		//方法2：
		int sum = 0;
		for (int i =1; i <=7; i++) {
			if(i % 2 == 1){
				sum += i;
			}
		}
		
	}

}
