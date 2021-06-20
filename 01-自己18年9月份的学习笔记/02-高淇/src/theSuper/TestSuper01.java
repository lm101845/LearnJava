package theSuper;

/**
 * @���� ����
 * @���� 2018��10��29������3:47:16
 */
/*
 * super��ֱ�Ӹ����������ã�����ͨ��super�����ʸ����б����า�ǵķ��������� ʹ��super������ͨ���������û��λ�����ƣ�
 * �������������������
 * 
 * ���ǹ��췽���ĵ�һ�д���û����ʽ�ĵ���super(...)����this(...),��ôjavaĬ�϶������super(),�����ǵ��ø�����޲������췽����
 * �����super()����ʡ��
 */
public class TestSuper01 {
	public static void main(String[] args) {

		new ChildClass().f(); // �����д���У���ʲô������û�п���
	}
}

class FatherClass {
	public int value;

	public void f() {
		value = 100;
		System.out.println("FatherClass.value=" + value); // FatherClass.value=100
	}
}

class ChildClass extends FatherClass {
	public int value; // �������и�����Ҳ��value �����ʲô����Ҳû����

	public void f() { // �����е�f()������д�˸����е�f()�������Ѹ���ķ����Ѿ����ǵ���
		// f(); ���ֱ��дf���ǵ����Լ���
		super.f(); // ���ø���������ͨ����
		value = 200;
		
		System.out.println("ChildClass.value=" + value); // ChildClass.value=200
		System.out.println(value); // 200
		System.out.println(super.value); // ���ø������ĳ�Ա���� ���100
	}
}