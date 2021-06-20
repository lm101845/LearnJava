package cn.itcast.demo03;

public class Test01 {

	public static void main(String[] args) {
		
		HttpServlet s = new MyServlet();     //弄了一个多态
		s.service();
	}
}
