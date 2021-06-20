package day03;

 /**
 * @author 李明
 * @date 2018年10月29日上午10:27:24
 */
class Test01 {
	 private static int argslength;    //成员变量没有定义，默认为0

	public static void main(String[] args) {
		
		 String server;
		 int duration;
		 
		 if(argslength < 1) {
			 server = "lovation";
		 }
		 else {
			 server = "arguments";
		 }
		 System.out.println(server);   //lovation

	}

}
