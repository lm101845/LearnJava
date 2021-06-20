package chapter02;
//注意事项：
//1.小心case穿透，推荐使用break语句
//2.多个case可以合并到一起
//3.default可以省略，但不推荐省略
//4.switch
//5.java中switch语句只能探测int类型值
public class Testswitch {
	public static void main(String[] args) {
		int i =18;			//在java里面，switch只能探测int类型的值
		switch(i){
		
		case 8:			//注意：是冒号不是分号啊！！！
		System.out.println("8");
		break;			//必须每段后面跟一个break,否则它会穿到下面去
		
		case 3:
		System.out.println("3");
		break;
		
		case 2:
		System.out.println("2");
		break;
		
		case 9:
		System.out.println("9");
		break;
		
		default:
		System.out.println("error");
		
		}
	}

}
