package theStatic;

/**
 * @author ����
 * @���� 2018��10��29������4:49:02
 * 
 * ����static�ؼ��ֵ��÷�
 *
 *���������ˣ�ͼֽһ���� ---����ͨ����������Ե��þ�̬��������֮������
 */
public class User2 {
	int id; // id
	String name; // �˻���
	String pwd; // ����

	static String company = "������ѧ��"; // ��˾���� --����static����

	public User2(int id, String name) {    //���췽��
		this.id = id;
		this.name = name;
	}

	public void login() {			//������ͨ����
		printCompany();     //���������ˣ�ͼֽһ���� ---����ͨ����������Ե��þ�̬����
		System.out.println(company);   //���þ�̬������Ҳ��һ�����ⶼû��
		System.out.println("��¼��" + name);
	}

	public static void printCompany() {			//����static����
//         login();//�ھ�̬�������治���Ե��÷Ǿ�̬����������ͻᱨ��
		System.out.println(company);    //�ھ�̬����������Ȼ����ʹ�þ�̬����
	}

	public static void main(String[] args) {
		
		User2 u = new User2(101, "��С��");
		User2.printCompany();    //ͨ������ȥ��printCompany()
		
		User2.company = "����Ͱ�";  //ͨ������ȥ��company
		User2.printCompany();
	}
}