package cn.itcast.day07.demo04;

import java.util.ArrayList;

/**
 * ���ߣ�����
 * ���ڣ� 2018��11��26�� ����7:11:37
 * ���ı�����1
 */
public class Demo01Hero {
	
	public static void main(String[] args) {
		
		//����һ�����ϣ�����һ�����飬������5λӢ��
		ArrayList<Hero> team = new ArrayList<>();
		
		//����5��Ӣ�۶���
		Hero one = new Hero("���ļ�",200);
		Hero two = new Hero("����",250);
		Hero three = new Hero("���ʽ�",360);
		Hero four= new Hero("����̫һ",150);
		Hero five= new Hero("����",220);
		
		//��5��Ӣ�۶�����ӵ�������
		team.add(one);
		team.add(two);
		team.add(three);
		team.add(four);
		team.add(five);
		
		//�������ϣ���������չʾ
		for (int i = 0; i < team.size(); i++) {
			//��ȡ��ǰӢ��
			Hero hero = team.get(i);
			System.out.println("Ӣ�����ƣ�" + hero.getName() + ",��������" + hero.getAttack());
		}
			
	}
}
