package cn.itcast.day10.demo02;

/*
 * @���� ����
 * @���� 2018��11��4������5:28:53
 * 
 * �������õ���һ�ָ�ʽ��
 * 
 * ͨ���������ó�Ա��������ʽ��
 * ������������Ա������
 */
public class Demo02MethodRef {
	public static void main(String[] args) {
		Cook cook = new Cook();   //������һ����ʦ����
		
		//������cook�����еĳ�Ա����makeFood
		method( cook::makeFood   );
		
	}
	
	public static void method(Sitter sitter) {
		sitter.work("����");
	}

}
