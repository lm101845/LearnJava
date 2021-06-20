package chapter03;
/*
 * 俗话说没有规矩就没有方圆，java作为一门严谨的面向对象的高级编程语言，自然对权限整个重要的问题有严格的控制。

Java一共有四种权限，private (私有)，public（公有）。Protected（受保护）还有default(友好型）-

如果类的前面什么也不写，那么默认是default（友好型）
 */
	

public class TestAccess {

}

class T {
	private int i = 0;
			int j = 0;
	protected int k = 0;
	public int m = 0;
	
	public void m() {
		i = 9;
	}
}

class TT {
	public void m() {
		T t = new T();
		System.out.println(t.j);
	}
}
