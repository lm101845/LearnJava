package day03;

 /**
 * @author ����
 * @date 2018��10��29������10:27:24
 */
class Test01 {
	 private static int argslength;    //��Ա����û�ж��壬Ĭ��Ϊ0

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
