package changYongLei;

/**
 * @���� ����
 * @���� 2018��11��6������3:37:02
 * 
 * �Զ�װ��(auto-boxing)��
 * �������;��Զ��ķ�װ��������ͬ���͵İ�װ�У��磺
 * Integer i = 10;
 * �������ǣ�������Ϊ��������ˣ�
 * Integer i = new Integer(10);
 * 
 * �Զ����䣺
 * ��װ������Զ�װ���ɻ����������ͣ��磺
 * int a = new Integer(10);
 * �����ϣ�������Ϊ��������ˣ�
 * int a = new Integer(10).intvalue(); 
 * 
 *
 * 
 */
public class ZiDongZhuangXiang {

	public static void main(String[] args) {
		
//		Integer a = new Integer(1000);
		Integer a = 1000;  //jdk5.0֮�� .  �Զ�װ�䣬�����������ǸĽ����룺Integer a = new Integer(1000);
		
		Integer b = null;    //����û�У���ָ�룬��ȥ�����ķ��������Ա���
		//Exception in thread "main" java.lang.NullPointerException
		//int c = b;  //�Զ����䣬�������Ľ���b.intValue();
		
		//System.out.println(c); 
		
		Integer  d1 = 1234;
		Integer  d2 = 1234;
		
		System.out.println(d1==d2);		//false
		System.out.println(d1.equals(d2));		//true
		
		System.out.println("=================================="); 
		Integer d3 = -100;    //[-128,127]֮���������Ȼ����������������������,�������Ч�ʡ�
		Integer d4 = -100;
		System.out.println(d3==d4);		//true
		System.out.println(d3.equals(d4));		//true
		
		
	}
}

