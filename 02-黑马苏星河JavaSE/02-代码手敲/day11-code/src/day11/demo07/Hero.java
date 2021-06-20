package day11.demo07;

/**
 * @author ����
 * @date 2021��06��15�� 15:34
 */
public class Hero {
    private String name;   //Ӣ�۵�����
    private Skill skill;   //Ӣ�۵ļ���

    public Hero() {
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public void attack(){
        System.out.println("�ҽУ�" + name + ",��ʼʩ�ż�����");
        skill.use();     //���ýӿ��еĳ��󷽷�
        System.out.println("ʩ�ż������");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
