package day03;

/**
 * 作者：李明
 * 日期： 2018年12月23日 下午3:25:05
 * 看的遍数：
 */
public class _continue {
	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
