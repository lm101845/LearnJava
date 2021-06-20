package day03;

/**
 * 作者：李明
 * 日期： 2018年12月23日 下午3:02:31
 * 看的遍数：
 */
public class _break02 {
	public static void main(String[] args) {
		//Loop是标签，最外层的循环被最内层的循环给结束掉了。不加Loop可以控制内层循环，加了Loop既可以控制内层循环又可以控制外层循环
		Loop:for(int i=0;i<3;i++) {
			System.out.println("i="+i);
			for(int j=0;j<6;j++) {
				System.out.println("j+"+j);
				if(j==4) {
					break Loop;
				}
			}
		}
	}

}
