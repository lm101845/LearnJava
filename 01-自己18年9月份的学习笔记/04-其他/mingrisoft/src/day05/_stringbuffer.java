package day05;

/**
 * 作者：李明
 * 日期： 2018年12月26日 上午7:07:18
 * 看的遍数：
 */
public class _stringbuffer {
	public static void main(String[] args) {
		String str = new String("32");
		System.out.println(str);		//32
		
		StringBuffer stb = new StringBuffer(32);
		System.out.println(stb);		//什么都没有显示
		System.out.println("程序运行完了");
		
		StringBuffer stb1 = new StringBuffer();
		stb1.append("门前大桥下");
		stb1.append("\n游过一群鸭");
		stb1.append("\n快来快来数一数");
		stb1.append("\n二四六七八");
		System.out.println(stb1);
		System.out.println("程序运行完了");
	}

}
