package day02;

/**
 * 作者：李明
 * 日期： 2018年12月18日 上午5:53:05
 * 看的遍数：
 */
public class _shujuleixingzidongzhuanhuan {

	public static void main(String[] args) {
		//低精度向高精度转换时可以自动转换，直接赋值
		byte a = 1;
		System.out.println(a);		//1
		
		int  b = a;
		System.out.println(b);		//1
		
		long c = b;
		System.out.println(c);		//1
		
		double d = c;
		System.out.println(d);		//1,0
		
		//char要特殊一点，在char的取值范围内，可以跟int进行直接转换
		char e = 'A';				//这个字符A可以直接当作整数来运算
		int f = e-2;
		System.out.println(f);   //63
		
		

	}

}
