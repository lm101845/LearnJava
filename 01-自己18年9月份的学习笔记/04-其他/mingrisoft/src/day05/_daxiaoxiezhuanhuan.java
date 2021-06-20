package day05;

/**
 * 作者：李明
 * 日期： 2018年12月25日 下午9:48:14
 * 看的遍数：
 */
public class _daxiaoxiezhuanhuan {
	public static void main(String[] args) {
		char a1 = 'a';
		char a2 = 'A';
		char a3 = (char)(a1-32);
		System.out.println((int)a1);		//97
		System.out.println((int)a2);		//65
		System.out.println(a3);            //A
		
		//字符串大小写转换
		String str = "abcDEF";
		String str02 = str.toLowerCase();   //小写
		String str03 = str.toUpperCase();   //大写
		System.out.println(str02);
		System.out.println(str03);
		
	}

}
