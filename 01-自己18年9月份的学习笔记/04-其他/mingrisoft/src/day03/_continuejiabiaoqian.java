package day03;

/**
 * 作者：李明
 * 日期： 2018年12月23日 下午3:28:14
 * 看的遍数：
 */
public class _continuejiabiaoqian {
	public static void main(String[] args) {
		Loop:for(int i=0;i<=2;i++) {
			System.out.println("i="+i);
			for(int j=0;j<=10;j++) {
				if(j==2) {
					continue Loop;
				}
				System.out.println("j="+j);
			}
		}
	}

}
