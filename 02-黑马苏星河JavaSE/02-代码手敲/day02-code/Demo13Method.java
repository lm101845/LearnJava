/*
����һ�������ĸ�ʽ��
public static void ��������() {
	������
}

�������Ƶ���������ͱ���һ����ʹ��С�շ塣
�����壺Ҳ���Ǵ����ŵ��п��԰�����������䡣

ע�����
1. ����������Ⱥ�˳������ν��
2. �����Ķ��岻�ܲ���Ƕ�װ�����ϵ��
3. �����������֮�󣬲���ִ�еġ����Ҫ��ִ�У�һ��Ҫ���з����ġ����á���

��ε��÷�������ʽ��

��������();
*/

public class Demo13Method{
	public static void main(String[] args){
		farmer();
		seller();
		cook();
		me();
	}
	
	//��main���������棬��class������д����
	//Ŀǰ�ķ����ĸ�ʽ����public static void ��������() {������}
	public static void farmer(){
		//ũ�񲮲�
		System.out.println("����");
		System.out.println("��ˮ");
		System.out.println("ʩ��");
		System.out.println("����");
		System.out.println("�ո�");
		System.out.println("����С�̷�");
	}
	
	public static void seller(){
		//С�̷�
		System.out.println("���䵽ũó�г�");
		System.out.println("̧�߼۸�");
		System.out.println("ߺ��");
		System.out.println("��������");
	}
	public static void cook(){
		//����
		System.out.println("ϴ��");
		System.out.println("�в�");
		System.out.println("����");
		System.out.println("װ��");
	}
	
	public static void me(){
		//��
		System.out.println("��");
	}
}