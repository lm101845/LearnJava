/*
������������еļӺţ�+�������ַ�����˵����������ӵ���˼���������ӵ���˼
ʹ���ַ������͵ı�����
Srring str="Hello";

ע�����
1.�κ��������ͺ��ַ����������Ӳ����������һ�����ַ���
2.�ַ������ӵ�ʱ��Ҫע������˳�����ȼ�����
*/
public class Demo05Operator{
	public static void main(String[] args){
		//������һ������str1�ı��������ַ������͵�
		String str1="Hello";
		String str2=str1+"World";
		
		System.out.println(str2);	//HelloWorld	
		
		String str3="Hello"+30;
		System.out.println(str3);	//Hello30
		
		String str4="Hello"+10+20;
		System.out.println(str4);	//Hello1020
		
		String str5="Hello"+(10+20);
		System.out.println(str5);	//Hello30
		
		
	}
}