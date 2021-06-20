package day05;

/**StringBuilder因为不同步，所以比StringBuffer效率上要快一点。它们都共享相同的API
 * 作者：李明
 * 日期： 2018年12月26日 上午7:15:53
 * 看的遍数：
 */
public class _xiugaizifu {
	public static void main(String[] args) {
		StringBuffer stb = new StringBuffer("123456");
		stb.setCharAt(3, 'A');
		System.out.println(stb);
		System.out.println("程序运行完了");
		
		//字符串反序
		StringBuffer stb1 = new StringBuffer("同一个世界，同一个梦想");
		stb1.reverse();
		System.out.println(stb1);
		
		//删除子字符串
		StringBuffer stb2 = new StringBuffer("天行健，君子以自强不息");
		stb2.delete(4,7);   //前闭后开
		System.out.println(stb2);
		
		//替换子字符串
		StringBuffer stb3 = new StringBuffer("18612345678");
		stb3.replace(3,7,"****");   //前闭后开  可以更改指定范围内的字符，用String是做不到这点的
		System.out.println(stb3);
		
	}

}
