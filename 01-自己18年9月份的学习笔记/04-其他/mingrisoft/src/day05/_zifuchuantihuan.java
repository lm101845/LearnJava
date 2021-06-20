package day05;

/**
 * 作者：李明
 * 日期： 2018年12月25日 下午9:28:15
 * 看的遍数：
 */
public class _zifuchuantihuan {
	public static void main(String[] args) {
		String str ="馒头一文一个";
		String restr = str.replace("一", "壹");
		System.out.println(restr);
		
		String str01 ="123456abcd";
		String restr01 = str01.replaceAll("\\d", "?");    //   \\d表示1-9中的任何一个
		System.out.println(restr01 );
		
		String str02 = "Java";
		String restr02 = str02.replaceFirst("a", "A");
		System.out.println(restr02);   //只将第一个a改为了大写
		
		
				
	}

}
