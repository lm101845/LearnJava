/*
���������������ڼ䣬���ݿ��Է����ı����
�����ñ���һ�������������������һ��ֻ�ܴ��һ������
��������һ��С���������һ������5��Ȼ�����������������ֻ�����6����������˱����Ŀɱ��ԡ�

����һ����������ʹ�õĸ�ʽ��
��ʽ1���ֳ�������
�������� ��������;		//������һ������
�������� = ����ֵ;		//��ֵ�����ұߵ�����ֵ����ֵ������ߵı���

��ʽ2��һ����λ
�������� �������� = ����ֵ;		//�ڴ���һ��������ͬʱ�����̷���ָ��������ֵ

*/

public class Demo02Variable{
	public static void main(String[] args){
		//����һ������
		//��ʽ���������� ��������;
		int num1;
		
		//������д���һ������
		//��ʽ���������� = ����ֵ;
		num1 = 10;
		//����ӡ����������Ƶ�ʱ����ʾ�������Ǳ���������
		System.out.println(num1);	//10
		
		//�ı�������б��������֣�����µ�����
		num1 = 20;
		System.out.println(num1);	//20
		
		
		//ʹ��һ����λ�ĸ�ʽ���������
		//��ʽ���������� �������� = ����ֵ;
		int num2 = 25;
		//�����ǲ����ظ���������һ���ı�����
		System.out.println(num2);	//25
		
		num2 = 35;
		System.out.println(num2);	//35
		System.out.println("==============================================");
		
		byte num3 = 30;		//ע�⣺�Ҳ���ֵ�ķ�Χ���ܳ�������������͵�ȡֵ��Χ
		System.out.println(num3);
		
		//byte num4 = 400;	//�Ҳ�400������byte�����ݷ�Χ(-128��127)���ᱨ��
		//System.out.println(num4);
		
		short num5 = 50;
		System.out.println(num5);		//50
		
		long num6 = 3000000000L;
		//30����
		//long num6 = 3000000000;
		//����д���У�����û�к�׺������
		//��дlong���͵�ʱ��һ����Ҫ������ĸ��׺L
		//��Сд�����ԣ������Ƽ���д������
		System.out.println(num6);		//3000000000
		
		float num7 = 2.5F;
		System.out.println(num7);		//2.5
		
		double num8 = 1.2;
		System.out.println(num8);		//1.2
		
		char zifu1 = 'A';
		System.out.println(zifu1);		//A
		
		char zifu2 = '��';
		//��Java�����У�char����������дһ��(ֻ��һ��)�й��ֵ�
		System.out.println(zifu2);		//��
		
		boolean var1 = true;
		System.out.println(var1);		//true
		
		var1 = false;
		System.out.println(var1);		//false
		
		//��һ���������������ݣ���ֵ������һ������
		//�Ҳ�ı�������var1�Ѿ����ڣ�����װ����false����ֵ
		//���Ҳ���������falseֵ�����󽻸�var2�������д洢
		boolean var2 = var1;
		System.out.println(var2);		//false
	}
}