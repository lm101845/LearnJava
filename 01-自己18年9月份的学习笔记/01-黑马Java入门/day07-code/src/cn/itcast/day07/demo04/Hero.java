package cn.itcast.day07.demo04;

/**
 * ���ߣ�����
 * ���ڣ� 2018��11��26�� ����7:11:57
 * ���ı�����1
 */
public class Hero {
	private String name;   //����
	private int attack;   //������
	
	public Hero() {
		
	}

	public Hero(String name, int attack) {
		super();
		this.name = name;
		this.attack = attack;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	

}
