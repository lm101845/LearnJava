/*
�߼������

�루���ң�  &	ȫ����true����true;�������false.
�򣨻��ߣ�	|	����һ��true����true;ȫ����false����false.
��� 		^	2����ͬ����false;2����ͬ����true.���еĺ�Ů�Ľ�����true)
�ǣ�ȡ����	��	������true���false;������false���true.

ע�����
	1.�߼������ͨ���������Ӷ������ֵ��
	2.�����2������ֵ�������ӣ�����ֵA & ����ֵB
	3.�����ȡ�����������ôֻ������һ������ֵ���ϣ�������ֵ
*/
public class Demo09Operator{
	public static void main(String[] args){
		
		System.out.println(true&true);	 //true
		System.out.println(true&false);	 //false
		
		System.out.println("==============================================================================");
		
		boolean a= true;
		boolean b= false;
		System.out.println(a&b);	//false
		
		System.out.println("==============================================================================");
		
		System.out.println(true^true);	 	//false
		System.out.println(true^false);	 	//true
		System.out.println(false^true);	 	//true
		System.out.println(false^false);	//false
	}
}