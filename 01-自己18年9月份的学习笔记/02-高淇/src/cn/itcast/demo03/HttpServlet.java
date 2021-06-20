package cn.itcast.demo03;

public class HttpServlet {

	public void service() {
		System.out.println("HttpServlet.service()");
		this.doGet();      //这个不知道是干什么的，为什么把它注释掉以后下面那个就不显示了呢
		//service里面调了doGet
		//this指向整个对象，所以调整个对象的方法 
	}

	public void doGet() {
		System.out.println("HttpServlet.doGet()");
	}

}