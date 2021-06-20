package day02;

/**
 * 作者：李明
 * 日期： 2018年12月18日 上午6:02:14
 * 看的遍数：
 */
public class _jingdudiushi {
	public static void main(String[] args) {
		float f = (float)3.1415926;		//小数默认是double，即3.1415926是double类型，强制转换成了float值
		System.out.println(f);   //3.1415925,丢了一个数字
		
		int i = (int)f;
		System.out.println(i);		//3
		
		byte b = (byte)129;		//数值溢出，byte最大127，这里是强制转换
		System.out.println(b);	//-127
		
		
	}

}
