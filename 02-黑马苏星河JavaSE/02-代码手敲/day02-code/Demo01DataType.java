/*
���������Ͳ�һ��ʱ�����ᷢ����������ת��

�Զ�����ת��(��ʽ)
	1.�ص㣺���벻��Ҫ�������⴦���Զ���ɡ�
	2.�������ݷ�Χ��С����(�������ֽ�����һ����أ���������long��float)��

ǿ������ת��(��ʽ)
*/
public class Demo01DataType{
	public static void main(String[] args){
		System.out.println(1024);  //�����һ��������Ĭ����int����
		System.out.println(3.14); //�����һ����������Ĭ�Ͼ���double����
		
		long num1 = 100L;
		System.out.println(num1);    //100  
		
		//�����long���ͣ��ұ�û�к�׺����Ĭ�ϵ�int���ͣ����Ҳ�һ��
		//һ���ȺŴ���ֵ�����Ҳ��int��������������long�������д洢
		//int  --> long (�Ҳ��int�ŵ���ߵ�long�����У���װ��)������������ݷ�Χ��С�����Ҫ��
		//��һ�д��뷢�����Զ�����ת����
		long num2 = 108;    
		//100���治��LҲ�У������Զ�ת��
		System.out.println(num2);
		
		//�����double���ͣ��ұ���float���ͣ����Ҳ�һ��
		//float -->double�����ϴ�С����Ĺ���Ҳ�������Զ�����ת��
		double num3 = 2.5F;
		System.out.println(num3);
		
		
		//ע�⣺floatռ4���ֽڣ�Lռ8���ֽڣ�������float�ܱ�ʾ���ķ�Χ���󣡣�
		//long --> float:��Χ��float����һЩ�����ϴ�С����Ĺ���Ҳ�������Զ�����ת��
		float num4 = 30L;
		System.out.println(num4);   //��ʾ30.0������30
	}
}