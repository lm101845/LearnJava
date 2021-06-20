public class Demo07Switch {
	public static void main(String[] args) {
		int num = 10;
		
		switch (num) {
			//num为表达式
			//case右边是一个常量值
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期日");
				break;
			default:
			//default类似于else，负责收尾
			//default后面就一个冒号，不用写数值了
				System.out.println("数据不合理");
				break; // 最后一个break语句可以省略，但是强烈推荐不要省略
		}
	}
}