package chapter06;
/*
 * String.split("要切割的准侧")返回的是一个String[ ]的首地址；String.split("要切割的准侧").length 
 * 返回的是这个String被切割后的子字符串的个数（及被切割成了几个段）；String.split(""),此时，
 * 切割后的第一个段是空字符串。

 */
public class DemoSplit {
	public static void main(String[] args) {
 
		test();
	}
 
	public  static void test(){
		
		String s="a,b,c,d,e";
		String temp[];
		
		temp=s.split(",");//String用split切割后，返回的是一个String数组。
		System.out.println("temp==="+temp);//System.out.print(s.split("要切割的准则"))返回的是字符串数组的首地址
		System.out.println("之后的长度："+temp.length);
		System.out.println("切割后，子段的内容为：");
		for(int i=0;i<temp.length;i++){
			System.out.println(temp[i]);
		}
		
		String temp1[];
		temp1=s.split("");
		System.out.println("temp1==="+temp1);//System.out.print(s.split("要切割的准则"))返回的是字符串数组的首地址
		System.out.println("之后的长度："+temp1.length);
		System.out.println("切割后，子段的内容为：");
		for(int i=0;i<temp1.length;i++){
			System.out.println(temp1[i]);
		}
	}
}
