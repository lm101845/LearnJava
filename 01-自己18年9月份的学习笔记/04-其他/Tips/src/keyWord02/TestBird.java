package keyWord02;
/*
 * The public type must be defined in its own file

���룺��������뱻���������Լ����ļ���

���������ԭ��

1.����Java����ͬ�ļ�����һ��

2.һ���ļ����ж���ֻ࣬�����ļ���һ�µ���������������Ϊ��public

�ڲ��಻������Ϊ��public

һ���ļ���ֻ����һ��public��


�̳У�
1.�����̳и�������public���͵�ʵ�������ͷ�����������̳и�������private�����ͺͷ���
2.�̳������ķ������Ա����ǵ�����ʵ���������ܱ����ǵ�
3.��ĳ�������������б����ǹ��������������ʱ����õ����ǹ��İ汾��
 */
 class Bird {
	// ����ָ���Ǹ���

	public void fly() {

		System.out.println("��ֻһֻ�����ܷ�");

	}

}

 class Ostrich extends Bird {
	// ���ﶨ��һ��������һ���ķ���;

	public void fly() {
		System.out.println("����һֻ�񣬵��Ҳ��ܷ�");

	}

}

public class TestBird {

	public static void main(String[] args) {

		Ostrich f = new Ostrich();

		f.fly();

	}

}
