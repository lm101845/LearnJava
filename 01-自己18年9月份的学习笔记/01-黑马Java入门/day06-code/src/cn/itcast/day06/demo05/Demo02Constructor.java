package cn.itcast.day06.demo05;

/**
 * @���� ����
 * @���� 2018��11��7������11:21:12
 * ���ı�����1+1
 */
public class Demo02Constructor {
	
	public static void main(String[] args) {
		
		//�����޲����Ĺ��췽������������
		Student one = new Student();		//�޲����Ĺ��췽��ִ�У�
		
		//�����в����Ĺ��췽������������
		Student two = new Student(18);		//�в����Ĺ��췽��ִ�У�18
		System.out.println("==================================");
		
		Student stu = new Student();		//�޲����Ĺ��췽��ִ�У�
		stu.setName("����ӱ");
		stu.setAge(20);
		System.out.println("������" + stu.getName() + ",����" +stu.getAge() );   //����������ӱ,����20
		System.out.println("==================================");
		
		//ֱ����new��ʱ��ͨ�����췽������Ա������ֵ
		Student stu2 = new Student("����",18);		//��2�������Ĺ��췽��ִ�У�
		System.out.println("������" + stu2.getName() + ",����" +stu2.getAge() );		//����������,����18
		
		//�ı��Ա������ֵ,����ȻҪʹ�����set
		stu2.setAge(19);
		System.out.println("������" + stu2.getName() + ",����" +stu2.getAge() );    //����������,����19
	}

}
