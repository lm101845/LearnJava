package jiCheng;

/**������д(override)/����
 * @author ����
 * @date 2018��10��29������2:47:57
 */
/*
 * ��������д��Ҫ������������Ҫ�㣺
 * 1.���������β��б���ͬ
 * 2.����ֵ���ͺ������쳣���ͣ�����С�ڵ��ڸ���
 * 3.����Ȩ�ޣ�������ڵ��ڸ���
 */
public class TestOverride {
	public static void main(String[] args) {
		Horse   h   =  new Horse();
		h.run();
	}
}


class  Vehicle {
public  void  run(){
	System.out.println("��....");
}

public   void stop(){
	System.out.println("ֹͣ��");
}

public  Person   whoIsPsg(){
	return  new Person();   //����Ǹ�������ķ��س˿�
}

}

class    Horse   extends  Vehicle {
public  void  run(){
	System.out.println("���㷭�ɣ��N�N�ġ�����");
}

public  Student   whoIsPsg(){//����ֵ���ͺ������쳣��������С�ڵ��ڸ��������
	return  new Student();
}

}
