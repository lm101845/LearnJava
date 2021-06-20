package cn.itcast.day06.demo03;

/**
 * @姓名 李明
 * @日期 2018年11月7日下午11:18:18
 * 看的遍数：1+1
 */
public class Demo02Person {
	
	public static void main(String[] args) {
		
		person person = new person();
		
		person.show();			//我叫null,今年0岁
		
		person.name = "赵丽颖";
		//person.age = 19;		//错误写法！private的内容不能直接访问
		
		person.setAge(-20);			//数据错误！
		person.setAge(19);			
		person.show(); 			//我叫赵丽颖，今年19岁
	}

}
