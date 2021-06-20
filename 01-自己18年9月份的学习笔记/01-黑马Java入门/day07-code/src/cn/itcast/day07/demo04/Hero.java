package cn.itcast.day07.demo04;

/**
 * 作者：李明
 * 日期： 2018年11月26日 下午7:11:57
 * 看的遍数：1
 */
public class Hero {
	private String name;   //姓名
	private int attack;   //攻击力
	
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
