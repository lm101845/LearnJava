package cn.itcast.day06.demo02;

/**
 * @���� ����
 * @���� 2018��11��7������11:10:02
 * ���ı�����1+1
 */
public class Demo03PhoneThree {
	
	public static void main(String[] args) {
		
		//����Phone�ഴ����һ���ֻ���������one
		Phone one = new Phone();
		
		//���������Ա������Ĭ��ֵ
		System.out.println(one.brand); 	//null
		System.out.println(one.price); 	//0.0
		System.out.println(one.color); 	//null
		System.out.println("===========================================================");
		
		one.brand = "ƻ��";
		one.price = 8388.0;
		one.color = "��ջ�";
		System.out.println(one.brand); 	//ƻ��
		System.out.println(one.price); 	//8388
		System.out.println(one.color); 	//��ջ�
		System.out.println("===========================================================");
		
		//���ó�Ա����
		one.call("�ǲ�˹");
		one.sendMessage();
		System.out.println("=====================================================================");
		
		
		//��one���д洢�ĵ�ֵַ��ֵ����twoһ��
		Phone two = one;    //---������д����̫����
		
		//���������Ա������Ĭ��ֵ
		System.out.println(two.brand); 	//ƻ��
		System.out.println(two.price); 	//8388.0
		System.out.println(two.color); 	//��ջ�
		System.out.println("===========================================================");
		
		two.brand = "����";
		two.price = 4999.0;
		two.color = "������";
		System.out.println(two.brand); 	//ƻ��
		System.out.println(two.price); 	//8388
		System.out.println(two.color); 	//��ջ�
		System.out.println("===========================================================");
		
		//���ó�Ա����
		two.call("ŷ��");
		two.sendMessage();
	}

	

}
