package cn.itcast.day06.demo02;

/**
 * @姓名 李明
 * @日期 2018年11月7日下午11:08:13
 * 看的遍数：1+1
 */
public class Demo02PhoneTwo {
	
	public static void main(String[] args) {
		
		//根据Phone类创建了一个手机对象，名叫one
		Phone one = new Phone();
		
		//访问这个成员变量的默认值
		System.out.println(one.brand); 	//null
		System.out.println(one.price); 	//0.0
		System.out.println(one.color); 	//null
		System.out.println("===========================================================");
		
		one.brand = "苹果";
		one.price = 8388.0;
		one.color = "深空灰";
		System.out.println(one.brand); 	//苹果
		System.out.println(one.price); 	//8388
		System.out.println(one.color); 	//深空灰
		System.out.println("===========================================================");
		
		//调用成员方法
		one.call("乔布斯");
		one.sendMessage();
		System.out.println("=====================================================================");
		
		Phone two = new Phone();
		
		//访问这个成员变量的默认值
		System.out.println(two.brand); 	//null
		System.out.println(two.price); 	//0.0
		System.out.println(two.color); 	//null
		System.out.println("===========================================================");
		
		two.brand = "三星";
		two.price = 4999.0;
		two.color = "深邃蓝";
		System.out.println(two.brand); 	//苹果
		System.out.println(two.price); 	//8388
		System.out.println(two.color); 	//深空灰
		System.out.println("===========================================================");
		
		//调用成员方法
		two.call("欧巴");
		two.sendMessage();
	}

	

}
