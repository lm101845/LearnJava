package day02;

/**
 * 作者：李明
 * 日期： 2018年12月18日 上午5:34:19
 * 看的遍数：
 */
public class _fuhefuzhiyunsuanfu {

	public static void main(String[] args) {
		byte a = 1;
		//a = a + 2;  报错了，因为2是int值，int值与byte值相加，返回的是一个int值，无法赋给一个byte变量
		
		//复合赋值运算符可以自动完成类型转换
		a += 2;		//这样写就是对的
		System.out.println(a);  	//3

	}

}
