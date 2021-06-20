package day02;

/**进制
 * 作者：李明
 * 日期： 2018年12月17日 上午11:05:09
 * 看的遍数：
 */
public class JinZhi {
	public static void main(String[] args) {
		int a  = 33;	//十进制
		int b  = 033;	//八进制，以0开头
		int c = 0x33;	//十六进制，以Ox或0x开头
		System.out.println(a);	//编译器将十进制的33转换成十进制的33
		System.out.println(b);	//编译器将八进制的33转换成十进制的27
		System.out.println(c);	//编译器将十六进制的33转换成十进制的27

	}
}
