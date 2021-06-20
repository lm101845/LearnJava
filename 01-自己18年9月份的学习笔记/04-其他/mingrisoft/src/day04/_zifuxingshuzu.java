package day04;

/**不熟
 * 作者：李明
 * 日期： 2018年12月24日 上午8:14:04
 * 看的遍数：
 */
public class _zifuxingshuzu {
	public static void main(String[] args) {
		char a[][] =new char[4][];
		
		a[0] = new char[] {'春','眠','不','觉','晓'};		//第一行是这5个字
		a[1] = new char[] {'初','处','闻','啼','鸟'};		
		a[2] = new char[] {'夜','来','风','雨','声'};		
		a[3] = new char[] {'花','落','知','多','少'};		
		
		//横版输出
		System.out.println("-----------横版输出-----------------------------");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
			}
			if(i%2==0) {
				System.out.println("，");
			}else {
				System.out.println("。");
			}
		}
		
		//竖版输出
		System.out.println("\n---------------竖版输出------------------------------");
		for(int j=0;j<5;j++) {
			for(int i=3;i>=0;i--) {		//因为要先输出花这个字，这个字是3
				System.out.print(a[i][j]);
			}	
			System.out.println();
		}
		System.out.println("。，。，");
	}

}
