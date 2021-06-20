package day05;

/**
 * 作者：李明
 * 日期： 2018年12月25日 下午9:38:08
 * 看的遍数：
 */
public class _zifuchuanfenge {
	public static void main(String[] args) {
		String str = "abc,def,ghi";
		String strarray[]= str.split(",");    //[不能少]
		for(int i=0;i<strarray.length;i++) {
			System.out.println(strarray[i]);
		}
		
		//限定分割次数
		String str01 = "192.168.0.1";
		String strarray01[] = str01.split("\\.");
		String strarray02[] = str01.split("\\.",2);
		for(int j=0;j<strarray01.length;j++) {
			System.out.print("["+strarray01[j]+"]");
		}
		System.out.println();
		
		for(int j=0;j<strarray02.length;j++) {
			System.out.print("["+strarray02[j]+"]");
		}
		
	}

}
