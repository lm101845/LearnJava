package day05;

/**
 * 作者：李明
 * 日期： 2018年12月25日 下午9:56:33
 * 看的遍数：
 */
public class _quchukongge {
	public static void main(String[] args) {
		String str = "     	a b       d  k  d			";
		//System.out.println(str);
		System.out.println("["+str.trim()+"]");    //trim只能去除收尾的空格
		
		//去除所有空格
		String str01 = "    a	b	c		d			e	f	g";
		String strshort = str01.replaceAll("\\s", "");     //\\s表示所有空格
		System.out.println("["+strshort +"]");
	}

}
