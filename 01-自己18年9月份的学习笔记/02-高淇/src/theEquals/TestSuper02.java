package theEquals;

/**
 * @���� ����
 * @���� 2018��10��29������4:10:04
 */
/*
 * ������˳��Ϊ��
 * ��ʼ����һ��ChildClass����......
 *	����FatherClass
 *	����ChildClass
 *
 *new����childclass2,����˵Ӧ������ʾ"����ChildClass"����ʵ������ʾ����FatherClass
 *
 *���췽������˳��
 *���췽���ĵ�һ�����ǣ�super(...)�����ø����Ӧ�Ĺ��췽�������ԣ����̾��ǣ�������׷�ݵ�Object,Ȼ������������ִ����ĳ�ʼ�����
 *���췽����ֱ����ǰ����Ϊֹ
 *ע����̬��ʼ�������˳���빹�췽������˳��һ���������ظ�
 */
public class TestSuper02 {
	public static void main(String[] args) {
		
		System.out.println("��ʼ����һ��ChildClass����......");
		new ChildClass2();
	}
}

class FatherClass2 {
	public FatherClass2() {
		super();
		System.out.println("����FatherClass");
	}
}

class ChildClass2 extends FatherClass2 {
	public ChildClass2() {
		super();   //��仰д�У���дĬ�ϻ������仰
		System.out.println("����ChildClass");
	}
}