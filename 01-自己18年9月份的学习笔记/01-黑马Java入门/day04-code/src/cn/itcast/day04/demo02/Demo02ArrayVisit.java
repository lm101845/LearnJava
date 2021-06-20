package cn.itcast.day04.demo02;
/**
 * @李明
 * @日期 2018年11月26日 
 * 看的遍数：1+1
 * 
 * 如何访问数组当中的元素？
 * 
 * 如果直接打印数组的名称，那么得到的是16进制是地址值（哈希值）
 * 
 * 如何访问数组当中的一个具体元素呢？格式：
 * 数组名称[索引编号]
 * 索引：也就是数组当中的多个元素的编号，从0开始，一直到“长度-1”为止。
 * 
 * 动态初始化的时候，数组当中的元素都会被赋予一个默认值。例如：
 * 如果是整数，默认就是0；如果是浮点数，默认就是0.0；如果是字符，默认就是'\u0000'（Unicode写法）
 * 如果是布尔值，默认就是false（0）;如果是字符串或其他引用类型---如类！！！，那么默认null(闹，空常量）
 */
public class Demo02ArrayVisit {
	
	public static void main(String[] args) {
		
		int[]arrayA = new int[3];
		
		System.out.println(arrayA);		//数组名称	[I@7b1d7fff------不熟！！！！！
		System.out.println(arrayA[0]);	//代表访问第0号元素
		System.out.println(arrayA[1]);	//代表访问第1号元素
		System.out.println(arrayA[2]);	//代表访问第2号元素
		System.out.println("============================================");	
	
		
		double[] arrayB = new double[3];
		System.out.println(arrayB);		//数组名称，打印得到地址值：[D@299a06ac
		System.out.println(arrayB[0]);		//0.0
		System.out.println(arrayB[1]);		//0.0
		System.out.println(arrayB[2]);		//0.0
		System.out.println("============================================");	
		
		//改变数组当中的具体元素
		arrayB[1] = 3.14;
		System.out.println(arrayB[0]);		//0.0
		System.out.println(arrayB[1]);		//3.14
		System.out.println(arrayB[2]);		//0.0
		
		double num = arrayB[1];
		System.out.println("num的内容是："+ num);	//num的内容是：3.14

	}
	

}
