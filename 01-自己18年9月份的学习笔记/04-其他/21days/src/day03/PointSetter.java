package day03;

import java.awt.Point;
/*
 * Point(4,13)--Բ�����пɰ����Ĳ����������������౾�����������ͨ��һ�ֽ������캯�����ֽй�����constructor)�����ⷽ�������
 * �����ʹ���ഴ������ʱ���ṩ�Ĳ�������Ŀ�����Ͳ���ȷ����������Ҫ����ʱ����û���ṩ������������ʱ������
 * 
 * ͬһ��������ж�����캯����ÿ�����캯���Ĳ��������͸�����ͬ��ʹ��newʱ���������ڲ����б���ָ����ͬ�Ĳ���������������
 * ��Ӧ�Ĺ��캯��
 * 
 * �����������ͱ�ʾ��������С��Ԫ�أ����ǲ��Ƕ�����Ȼ�ںܶ�����´����������������-���Խ��丳�����������ݸ�������ӷ�������
 * ���������ʵ�������ͨ���Ǳ����ֺ��ַ����ӵĶ���������ͣ������������ֺ��ַ���Ϊʵ�������������
 */
 class PointSetter {
	 public static void main(String[] args) {
		 
		Point location = new Point(4,13);
		
		System.out.println("Starting location:");
		System.out.println("X equals"  +  location.x);
		System.out.println("Y equals"  +  location.y);
		
		System.out.println("\nMoving to (7,6)");
		location.x = 7;
		location.y = 6;
		
		System.out.println("\nEnding location");
		System.out.println("X equals"  +  location.x);
		System.out.println("Y equals"  +  location.y);
	}

}
