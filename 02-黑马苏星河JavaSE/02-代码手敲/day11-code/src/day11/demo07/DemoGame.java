package day11.demo07;

/**
 * @author ����
 * @date 2021��06��15�� 15:36
 */
public class DemoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("��ϣ");  //����Ӣ�۵�����
        //����Ӣ�ۼ���
        //д��1��ʹ�õ��������ʵ����
        //hero.setSkill(new SkilImpl());

        //д��2�������Ըĳ�ʹ�������ڲ���
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("Pia~pia~pia");
//            }
//        };
//        hero.setSkill(skill);

        //д��3����һ���򻯣�ͬʱʹ�������ڲ������������
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("Biu~Pia~Biu~Pia");
            }
        });
        hero.attack();
    }
}
