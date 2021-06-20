package yiChang;

/**
 * @���� ����
 * @���� 2018��11��7������2:31:43
 * 
 * �Զ����쳣��
 * �ڳ����У����ܻ������κα�׼�쳣�඼û�г�ֵ�������������⣬��������¿��Դ����Լ����쳣��
 * 
 * ��Exception�����������������һ�����༴�ɡ�
 * 
 * ϰ���ϣ��������Ӧ�ð���������������һ����Ĭ�ϵĹ���������һ���Ǵ�����ϸ��Ϣ�Ĺ�����
 * 
 * �쳣Ҳ���࣬������ǰ��ѧ����һ����
 * 
 * �����쳣ʹ�ý��飺
 * 1.Ҫ����ʹ���쳣�����������������ή�ͳ���������ԣ�����Ч�ʵ��¡�
 * 2.�����쳣�����Դ���򵥲���--ֻ���쳣�����ʹ���쳣����
 * 3.��Ҫ����С���ȵ��쳣����--Ӧ�ý����������װ��һ��try������
 * 4.�쳣�����ڸ߲㴦��
 * 
 * 
 */
public class MyException extends Exception {

	public MyException() {   //д�����������Ϳ�����

	}

	public MyException(String message) {
		super(message);
	}

}

class TestMyException {
	void test() throws MyException {
		///
	}

	public static void main(String[] args) {
		try {
			new TestMyException().test();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
}
