package cn.itcast.day09.demo03;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��1�� ����4:32:09
 * ���ı�����1
 */
public class Demo01Cal {
	public static void main(String[] args) {

		// ����ʹ�ýӿڵĸ�ʽ��������һ������������
		Calculator calculator = new CalculatorImpl();      //��߽ӿ��ұ���

		// �����������󽻸�method������ʹ��
		method(calculator);
	}

	// �����ǽӿ����ͣ��������ӿ�
	public static void method(Calculator calculator) {		//�����������ǽӿ�����

		int result = calculator.sum(10, 20);
		System.out.println("����ǣ�" + result);

	}

}
