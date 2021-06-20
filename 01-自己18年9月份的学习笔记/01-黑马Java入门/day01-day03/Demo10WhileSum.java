/*
求出1-100之间的奇数和
*/
public class Demo10WhileSum{
	public static void main(String[] args){
		int sum = 0;
		int i =1;	//1.初始化语句
		while (i <= 100){	//2.条件判断				//while后面的条件在（）里面
		//循环体
			if(i % 2 ==1){	//如果是奇数
				sum=sum+i;
			}
			//4.步进语句
			++i;	
		}
		
		System.out.println("奇数和：" + sum);	
	}
}