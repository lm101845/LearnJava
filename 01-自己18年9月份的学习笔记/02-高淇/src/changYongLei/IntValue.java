package changYongLei;

/**
 * @姓名 李明
 * @日期 2018年11月6日下午3:21:40
 * 
 *  1.intValue()是java.lang.Number类的方法，Number是一个抽象类。Java中所有的数值类都继承它。也就是说，不单是Integer
 *  有intValue方法，Double，Long等都有此方法。 
 *  
 *  2.此方法的意思是：输出int数据。每个数值类中具体的实现是不同的。例如： Float类和Double类的intValue方法，就是丢掉了
 *  小数位，而Long的intValue方法又不一样的
 *  
 *  
 *  
 */
public class IntValue {
	public static void main(String[] args) {
		
		Double s = 2.5;
		Float k = 2.7f;
		double kk = 2.9;
		Double double1 = new Double(2.9);

		System.out.println(k.intValue());
		//System.out.println(kk.intValue());
		System.out.println(s.intValue());
	}

}
