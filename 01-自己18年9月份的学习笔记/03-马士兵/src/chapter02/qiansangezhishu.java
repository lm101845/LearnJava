package chapter02;
//求1-100内前5个可以被三整除的数
public class qiansangezhishu {
	public static void main(String[] args) {
		int num = 0,i =1;	//n是计数器
		while (i <= 100){
			if (i % 3 ==0)
				System.out.println(i + "");
			num++;
			
		if (num == 5) {
			break;
		}
		
		i++;
		}
	}

}
