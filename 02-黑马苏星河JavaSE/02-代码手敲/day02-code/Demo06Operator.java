/*
������������ض������ķ��š� ���磺 + 
���ʽ�����������������ʽ�ӽ������ʽ�����磺20 + 5 �������磺a + b

�������㣺
�ӣ� +
���� - 
�ˣ� *
���� /
ȡģ(ȡ����)�� %

���ȼ���õ����ʽ�Ľ����Ȼ���ٴ�ӡ���������
��ϰһ��Сѧһ�꼶�ĳ�����ʽ��
������ / ���� = �� ... ����

����һ���������ʽ��˵�������õ����������������������������Ȼ��������ֻ���̣�����������
ֻ�ж��������ĳ�����˵��ȡģ������������������塣

ע�����
	1.һ�����㵱���в�ͬ���͵����ݣ���ô����������������ͷ�Χ������֡�
*/

public class Demo06Operator{
	public static void main(String[] args){
		//��������֮����Խ�����ѧ���㡣
		System.out.println(20 + 30);
		
		//��������֮��Ҳ���Խ�����ѧ����
		int a = 20;
		int b = 5;
		System.out.println(b-a);  //-15
		
		//�����ͳ���֮����Ի��ʹ��
		System.out.println(a * 10);  //200
		
		int x = 10;
		int y = 3;
		int result1 = x / y;  //3
		System.out.println(result1);
		
		int result2 = x % y;  //1
		System.out.println(result2);
		
		//int + double -->double + double -->double
		double result3 = x + 2.5;
		System.out.println(result3);		//12.5
	}
}