package day02;

/**位移运算符
 * 作者：李明
 * 日期： 2018年12月18日 上午5:20:29
 * 看的遍数：
 */
public class _weiyi {

	public static void main(String[] args) {
		
		//int类型有4位，一共32个字节
		int a = 24;
		System.out.println(a+"右移两位结果："+(a>>2));	//6; 24/2/2=6
		
		int b = -16;
		System.out.println(b+"左移三位结果"+(b<<3));	//-128;  
		
		int c = -256;
		System.out.println(c+"无符号右移结果"+(c>>>2));	 //1073741760; 符号位从1变成了0
		
		byte d = (byte)(-32>>1);
		System.out.println(d); 		//-16
		
		short e = (short)(-128>>4);
		System.out.println(e);     //-8
		
		/*
		 * 为什么byte,short无符号右移的运算竟然得到了两个负数，这是为什么？从二进制实现的机制来说，byte和short属于低精度的整型，
		 * 他们两个不适合做无符号右移！！！！否则它们两个结果是会溢出的
		 */
		
		
		

	}

}
