/*
java���е��������ͷ�Ϊ2�֣�

1.�������ͣ������ص㣩
	�������ͣ�byte short int long
	�������ͣ�float double
	�ַ����ͣ�char
	�������ͣ�boolean

2.��������(�Ժ󽲣�
	�ַ���
	����
	��
	�ӿڵ�
	
ע���������byte,short,int���͵ı�����˵��ֻҪ�Ҳ಻�������ķ�Χ���ɣ�
���Ƕ���long���͵ı�����˵���Ҳ�ֱ��д�Ͼ���һ��int���ͣ�����һ��Ҫ�к�׺��ĸL.
*/
public class Demo01DataType{
	public static void main(String[]args){
		//����ʹ���������Ͷ�Ӧ�ı���
		//����1����������
		byte num1;	//����һ��byte���͵ı��������ƽ���num1
		num1=100;	//��ֵ�����Ҳ�ĳ���100���������ı���num1���д洢
		System.out.println(num1);	//��ʾ100
		
		num1=108;	//�ı��˱���num1���е�����
		System.out.println(num1);
			//����2��һ������
		byte num2 = 90;		//�Ҳ���и�ֵ����ֵ�����ܳ��������������ͷ�Χ
		System.out.println(num2);
		
		//ע�⣡�Ҳ���һ��int���͵ĳ���������ֱ��д�Ͼͳ�����21����
		//long num3=4200000000;	//42����
		long num3=4200000000L;	//����Ҫ�Ӹ�L��׺����
		System.out.println(num3);
		
		//�Ҳ���һ����������Ĭ����double���ͣ����������float���ͣ�
		//float num4=3.14;	//����д����
		float num4=3.14F;	//�ұߴ��к�׺F�ģ������ұ���float����
		System.out.println(num4);
	
		char zifu1 ='A';
		System.out.println(zifu1);
		
		char zifu2 ='��';
		System.out.println(zifu2);
		
		boolean var1=true;
		System.out.println(var1);
		
		//���ʹ���ַ������͵ı����أ�
		//�ַ������͵�д���ǣ�String(���ǹؼ��֣�
		
		String str1;
		str1="Hello";
		System.out.println(str1);
	}
	
}