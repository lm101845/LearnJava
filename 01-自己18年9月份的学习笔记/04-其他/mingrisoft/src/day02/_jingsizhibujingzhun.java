package day02;

/**近似值不精确
 * 作者：李明
 * 日期： 2018年12月17日 上午11:19:34
 * 看的遍数：
 */
public class _jingsizhibujingzhun {

	public static void main(String[] args) {
		double a = 4.35*100;
		System.out.println(a); 	//434.99999999999994,不是435
		
		//解决方法：四舍五入法 Math.round()
		System.out.println(Math.round(a));  //435
		
		double b = 0.1;
		double c = 2.0-1.9;
		System.out.println(b);		//0.1
		System.out.println(c);  	//0.10000000000000009
		System.out.println(b==c);   //false
		
		//解决方法：最小数对比法Math.abs()与最小数"1e-6"相比较（1e-6是理论最小数，如有数比它还小，则视为0）
		System.out.println(Math.abs(b-c)<1e-6);		//true
		
	}

}
