package cn.itcast.day06.demo06;

/**
 * @姓名 李明
 * @日期 2018年11月7日下午11:29:41
 * 看的遍数：1+1
 */
public class Demo01Student {
	
	public static void main(String[] args) {
		
		Student stu1 = new Student();  
		stu1.setName("鹿晗");
		stu1.setAge(20);
		System.out.println("姓名：" + stu1.getName() + ",年龄" +stu1.getAge() );
		
		Student stu2 = new Student("吴亦凡",25); 
		System.out.println("姓名：" + stu2.getName() + ",年龄" +stu2.getAge() );
		
		stu2.setAge(26);
		System.out.println("姓名：" + stu2.getName() + ",年龄" +stu2.getAge() );
		
		
	}

}
