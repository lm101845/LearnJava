package cn.itcast.day06.demo07;

/**
 * @���� ����
 * @���� 2018��11��7������11:32:50
 * ���ı�����1+1
 */
public class DemoPerson {
	
	public static void main(String[] args) {
		
		Person yaSe = new Person();		//Ĭ�Ϲ���
		yaSe.setName("��ɪ");
		yaSe.setAge(20);
		
		Person houYi = new Person("����",18);		//�вι���
		
		
		//��������ɪ�ͺ�����к�
		//Ԥ��Ч��Ӧ���ǣ�������ã��ҽ���ɪ������20��
		
		yaSe.sayHello(houYi.getName());
		
		//Ȼ���ú������ɪ���к�
		houYi.sayHello(yaSe.getName());
		
		
	}

}
