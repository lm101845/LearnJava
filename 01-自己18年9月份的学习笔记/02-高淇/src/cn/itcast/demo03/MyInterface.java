package cn.itcast.demo03;

/*
 * @���� ����
 * @���� 2018��10��29������9:39:56
 * 
 * �����Աд�ӿڣ���ũ��ʵ�������������ƶȣ���������ʵ��
 * �ӿ�ûʲô�ü̳У�extends)�ģ��ӿ�����ʲô��û�У��ӿ�������ʵ����implements)��
 * 
 * ��Ϊ�ӿ��Ѿ��㹻���ˣ����Կ��Զ�̳�
 */
public interface MyInterface {
	//�ӿ�����ֻ�У����������󷽷���
	
	/*public static final   �ӿ��г�������ʱ��д��д��������*/
	String MAX_GREAD = "BOSS";
	int MAX_SPEED = 120;
	
	/*public abstract*/ void test01();    //�㶨���ƶȿ϶��ǹ����ģ�public��д�ɲ�д
	public int test02(int a , int b);
	

}
