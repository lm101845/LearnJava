package day02;

/**这两种赋值的结果是相同的
 * 作者：李明
 * 日期： 2018年12月18日 上午4:39:00
 * 看的遍数：
 */
public class _char {
	public static void main(String[] args) {
		//上面是以字符的方式来赋值
		char a1 = 'a';
		char b1 = '汉';
		char c1 = '2';
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		
		//下面是以编码的方式来赋值
		char a2 = 97;
		char b2 = 27721;
		char c2 = 50;
		System.out.println(a2);
		System.out.println(b2);
		System.out.println(c2);
	}

}
