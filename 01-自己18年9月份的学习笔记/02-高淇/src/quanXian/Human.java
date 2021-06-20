package quanXian;

/**测试封装
 * @姓名 李明
 * @日期 2018年10月29日下午4:49:02
 */
public  class  Human {
	private  int age ;
	String  name;			//只可以被本包下面的类访问
	
	
	protected   int  height;   
	
	
	public  void   sayAge(){
		System.out.println(age);    //在自己的方法里面我是完全可以使用age的
	}
}