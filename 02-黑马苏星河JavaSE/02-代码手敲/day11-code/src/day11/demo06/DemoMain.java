package day11.demo06;

/**
 * @author ����
 * @date 2021��06��15�� 15:28
 */
public class DemoMain {
    public static void main(String[] args) {
        //����һ��Ӣ�۽�ɫ
        Hero hero = new Hero();
        //ΪӢ����һ�����֣�������������
        hero.setName("����");
        hero.setAge(20);

        //����һ����������
        Weapon weapon = new Weapon("������");

        //ΪӢ���䱸����
        hero.setWeapon(weapon);
        hero.attack();
    }
}
