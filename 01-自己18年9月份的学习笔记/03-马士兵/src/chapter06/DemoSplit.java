package chapter06;
/*
 * String.split("Ҫ�и��׼��")���ص���һ��String[ ]���׵�ַ��String.split("Ҫ�и��׼��").length 
 * ���ص������String���и������ַ����ĸ����������и���˼����Σ���String.split(""),��ʱ��
 * �и��ĵ�һ�����ǿ��ַ�����

 */
public class DemoSplit {
	public static void main(String[] args) {
 
		test();
	}
 
	public  static void test(){
		
		String s="a,b,c,d,e";
		String temp[];
		
		temp=s.split(",");//String��split�и�󣬷��ص���һ��String���顣
		System.out.println("temp==="+temp);//System.out.print(s.split("Ҫ�и��׼��"))���ص����ַ���������׵�ַ
		System.out.println("֮��ĳ��ȣ�"+temp.length);
		System.out.println("�и���Ӷε�����Ϊ��");
		for(int i=0;i<temp.length;i++){
			System.out.println(temp[i]);
		}
		
		String temp1[];
		temp1=s.split("");
		System.out.println("temp1==="+temp1);//System.out.print(s.split("Ҫ�и��׼��"))���ص����ַ���������׵�ַ
		System.out.println("֮��ĳ��ȣ�"+temp1.length);
		System.out.println("�и���Ӷε�����Ϊ��");
		for(int i=0;i<temp1.length;i++){
			System.out.println(temp1[i]);
		}
	}
}
