package day03;

/**
 * 作者：李明
 * 日期： 2018年12月23日 下午12:36:28
 * 看的遍数：
 */
public class _switch02 {
	public static void main(String[] args) {
		String name = "张三";
		
		switch(name) {
			case"张三":System.out.println("张三到！");break;
			case"李四":System.out.println("李四到！");break;
			case"王五":System.out.println("王五到！");break;
			default:System.out.println("查无此人");
		}
	}

}
