package quanXian;

/**��Ȼ���Է�װ
 * @���� ����
 * @���� 2018��10��29������4:48:55
 */
/*
 * ������ԵĴ���
 * 1.һ��ʹ��private����Ȩ��
 * 2.�ṩ��Ӧ��get/set����������������ԣ���Щ����ͨ����public���εģ����ṩ�����Եĸ�ֵ��set�����ȡ(get)����(ע�⣺boolean
 * ������get������is��ͷ��)
 * 3.һ��ֻ
 */
public class Person4 {
	private int id;
	private String name;
	private int age;
	private boolean man;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {   //getname�����;Ͳ���void����string��
		return this.name;
	}

	public void setAge(int age) {
		if (age >= 1 && age <= 130) {
			this.age = age;
		} else {
			System.out.println("���������������䣡");
		}
	}

	public int getAge() {
		return this.age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isMan() {
		return man;
	}

	public void setMan(boolean man) {
		this.man = man;
	}

}