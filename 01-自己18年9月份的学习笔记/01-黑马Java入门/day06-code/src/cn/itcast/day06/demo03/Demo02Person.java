package cn.itcast.day06.demo03;

/**
 * @���� ����
 * @���� 2018��11��7������11:18:18
 * ���ı�����1+1
 */
public class Demo02Person {
	
	public static void main(String[] args) {
		
		person person = new person();
		
		person.show();			//�ҽ�null,����0��
		
		person.name = "����ӱ";
		//person.age = 19;		//����д����private�����ݲ���ֱ�ӷ���
		
		person.setAge(-20);			//���ݴ���
		person.setAge(19);			
		person.show(); 			//�ҽ�����ӱ������19��
	}

}
