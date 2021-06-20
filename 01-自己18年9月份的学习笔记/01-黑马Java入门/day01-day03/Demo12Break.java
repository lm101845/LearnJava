//使用break来打断循环
public class Demo12Break{
	public static void main(String[] args){
		for(int i =1; i <= 10;i++){
			
			//如果当前是第4次，那么就让整个循环终止！
			
			if(i == 4){		//后面不能写分号！
			
				break;	//这行代码一旦执行，整个for循环立刻结束！
			}
			System.out.println("你爱不爱我？" + i);
		}
	}
}