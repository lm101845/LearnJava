package day02;

/**字符和数字虽然字面值相同，但是他们的值绝对不一样
 * 作者：李明
 * 日期： 2018年12月18日 上午4:34:29
 * 看的遍数：
 */
public class _zifu {
	public static void main(String[] args) {
		System.out.println('8');		//8
		System.out.println(8);			//8
		System.out.println('8'*2);		//112   字符8乘以2是它的字符编码而不是它的字面值
		System.out.println(8*2);		//16
	}

}
