package day05;

/**String   StringBuffer StringBuilder三者比较
 * 作者：李明
 * 日期： 2018年12月26日 上午7:36:30
 * 看的遍数：
 */
public class _bijiao {
	public static void main(String[] args) {
		//String
		String str = "";
		long startTime = System.currentTimeMillis();		//获取时间
		for(int i=0;i<10000;i++) {
			str =str+i;
		}
		long endTime =System.currentTimeMillis();
		long time = endTime-startTime;
		System.out.println("String消耗的时间："+time);
		
		//StringBuffer
		StringBuffer sbf = new StringBuffer();
		 startTime = System.currentTimeMillis();		//获取时间
		for(int i=0;i<10000;i++) {
			sbf.append(i);
		}
		 endTime =System.currentTimeMillis();
		 time = endTime-startTime;
		System.out.println("StringBuffer消耗的时间："+time);
		
		//StringBuilder
		StringBuilder sbd = new StringBuilder();
		 startTime = System.currentTimeMillis();		//获取时间
		for(int i=0;i<10000;i++) {
			sbd.append(i);
		}
		 endTime =System.currentTimeMillis();
		 time = endTime-startTime;
		System.out.println("StringBuilder消耗的时间："+time);
	}

}
