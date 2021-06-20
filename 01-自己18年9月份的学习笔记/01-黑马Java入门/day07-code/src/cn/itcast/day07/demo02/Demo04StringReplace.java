package cn.itcast.day07.demo02;
/**
 * 作者：李明
 * 日期： 2018年11月26日 
 * 看的遍数：1
 * 
 * 如果希望将字符串当中指定的部分进行替换操作，需要使用
 * 
 * public String replace(CharSequence oldStr, CharSequence newStr):将字符串当中出现的所有
 * oldStr部分，替换成为参数newStr
 * 
 * 参数oldStr代表需要被替换的老字符串部分
 * 参数newStr代表需要替换的新字符串部分
 * 参数类型charSequence 现阶段可以简单的认为就是字符串String 
 *  */
public class Demo04StringReplace {
	
	public static void main(String[] args) {
		
		String str1 = "How do you do?";
		String str2 = str1.replace("o", "*");    //replace方法的返回值结果是一个全新的字符串
		System.out.println(str1);	//How do you do? --没变！--字符串的内容不可发生改变！！！！！！！！！！
		System.out.println(str2);   //H*w d* y*u d*?
		System.out.println("======================================");
		
		String str3 = "会不会玩啊！你大爷！真是服了！";
		String str4 = str3.replace("你大爷！", "***");		
		System.out.println(str4);			//会不会玩啊！***真是服了！
	}

}
