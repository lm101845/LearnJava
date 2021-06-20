package day03;

/**
 * 作者：李明
 * 日期： 2018年12月23日 下午1:58:54
 * 看的遍数：
 */
public class _whilexunhuanbijiao {
	public static void main(String[] args) {
		int i = 0,j = 0;
		System.out.println("循环之前j="+j);
	/*	while(i<3) {
			j++;
			i++;
		}
		System.out.println("循环之后j="+j);
	*/
		
		do{
			j++;
			i++;
		}while(i<3);		//do..while循环中，while后面的分号不能少
		
		System.out.println("循环之后j="+j);
	}
}
