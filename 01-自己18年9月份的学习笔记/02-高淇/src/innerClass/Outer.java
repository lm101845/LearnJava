package innerClass;

import innerClass.Face.Nose;

/**
 * @���� ����
 * @���� 2018��11��5������5:11:03
 * 
 * �ڲ��ࣺ
 * 1.���壺һ����������ǰ��ඨ��ɶ����ĵ�Ԫ����Щ����£����� ��һ���������һ������ڲ����壬��Ϊ�ڲ��ࡣ
 * 
 * 2.�ڲ�������ã�
 * a.�ڲ����ṩ�˸��õķ�װ��ֻ�����ⲿ��ֱ�ӷ��ʣ�������ͬһ�����е�������ֱ�ӷ���
 * b.�ڲ������ֱ�ӷ����ⲿ���˽�����ԣ��ڲ��౻�������ⲿ��ĳ�Ա�����ⲿ�಻�ܷ����ڲ�����ڲ����ԡ�
 * 
 * 3.�ڲ����ʹ�ó��ϣ�
 * ͨ���ڲ�����ֻΪ�����ⲿ���ṩ��������������ʹ��
 * 
 */
public class Outer {
	public static void main(String[] args) {
		Face f = new Face();
		Nose n = f.new Nose();
		n.breath();
		Face.Ear e = new Face.Ear();	
		e.listen();
	}

}

class Face{
	int type;
	String shape = "������";
	static String color = "����";
	
	class Nose{
		 String type;
		 
		 void breath() {
			 System.out.println(Face.this.type);
			 System.out.println("����");
			 
		 }
	}
	
	static class Ear{
		void listen() {
			//System.out.println(shape);
			System.out.println(color);
			System.out.println("��");
		}
	}
}