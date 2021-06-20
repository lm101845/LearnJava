package day05;

/**
 * 作者：李明
 * 日期： 2018年12月25日 下午9:21:24
 * 看的遍数：
 */
public class _jiequzifuchuan {
	public static void main(String[] args) {
		String 	id = "123456199001014321";
		String substr = id.substring(6);
		System.out.println(substr);
		
		String birthdate = id.substring(6, 14);
		System.out.println(birthdate);
	}

}
