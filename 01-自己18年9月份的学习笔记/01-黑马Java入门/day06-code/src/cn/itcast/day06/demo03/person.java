package cn.itcast.day06.demo03;
/**
 *@����
 *@���� 2018��11��26�� 
 *���ı�����1+1
 *
 * ��������������person��ʱ�����е�age���䲻Ӧ���Ǹ���������ȴ�޷���������ȡֵ��Χ�����ݲ���ȫ
 * 
 * ���������ʹ��private�ؼ���(������
 * һ��ʹ����private�ؼ��ֶԳ�Ա���������Σ���ô�����˱��෶Χ֮�⣬�Ͳ���ֱ�ӷ�����
 * �����Ҫʹ��private���εĳ�Ա����������ʹ�á���ӷ��ʡ���Ϊprivate��Ա������дһ�Զ�Setter Getter����
 */

public class person {
	
	//��Ա����
	String name;	//����
	private int age;		//����      //��ʱageֻ����������������ʹ��
	
	//��Ա������
	public void show() {
		System.out.println("�ҽ� "+ name + "����" + age + "�ꡣ");
	}
	
	//ר�Ŷ�����һ����Ա������������()���ã���������Ա���������ݣ�Setter����                      set������
	public void setAge(int num) {				//void��������û�з���ֵ
		
		//���������жϽ������ݺ����Լ�⣬�ѹأ�
		if(num < 0 || num > 200) {
			System.out.println("���ݴ���");
		}else {
			age = num;
		}
		
	}
	
	//ר�Ŷ�����һ����Ա�����������������ȡ(��ȡ����������)��Ա���������ݣ�Getter����		get:��ȡ
	public int getAge() {
		return age;
	}
		
}
