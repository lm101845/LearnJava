/*
��ֵ�������Ϊ��
������ֵ�����������һ���Ⱥ�"="�������Ҳ�����ݽ������ı�����
	int a = 30;
	
���ϸ�ֵ�������
	+=   a += 1          �൱��       a = a + 1
	-=   
	*=
	/=
	%=
	
ע�����
	1.ֻ�б�������ʹ�ø�ֵ��������������ܽ��и�ֵ��
	2.���ϸ�ֵ���������������һ��ǿ������ת����
*/
public class Demo09Operator{
	public static void main(String[] args){
		int a = 10;
		a += 5;
		System.out.println(a);
		
		//50 = 30;   //�������ܽ��и�ֵ������
		
		byte num = 30;
		num += 5;
		//num = num + 5;
		//num = byte + int
		//num = int + int
		//num = int
		//num = (byte)int
		System.out.println(num);
	}
}