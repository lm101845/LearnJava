package day03;

/**
 * 作者：李明
 * 日期： 2018年12月23日 下午2:59:02
 * 看的遍数：
 */
public class _break {
	public static void main(String[] args) {
		int i =1;
		while(i>0) {
			i++;
			System.out.println(i);
			
			if(i==10) {
				break;		//本来是个死循环，弄了个break后，就硬生生从中间掐断了，变成了活的了
			}
		}
		System.out.println("程序终止");
	}
}
