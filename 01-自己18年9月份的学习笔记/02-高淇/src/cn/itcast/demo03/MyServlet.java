package cn.itcast.demo03;

public class MyServlet extends HttpServlet {
	
	public void doGet(){     //重写了doGet方法     另一个方法没有重写
		System.out.println("MyServlet.doGet()");
	}
	
}
