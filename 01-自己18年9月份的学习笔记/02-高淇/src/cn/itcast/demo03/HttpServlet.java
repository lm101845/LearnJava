package cn.itcast.demo03;

public class HttpServlet {

	public void service() {
		System.out.println("HttpServlet.service()");
		this.doGet();      //�����֪���Ǹ�ʲô�ģ�Ϊʲô����ע�͵��Ժ������Ǹ��Ͳ���ʾ����
		//service�������doGet
		//thisָ�������������Ե���������ķ��� 
	}

	public void doGet() {
		System.out.println("HttpServlet.doGet()");
	}

}