package demo02;

/**
 * @author ����
 * @date 2021��06��22�� 14:43
 */
public class Cat extends Animal {
    public int age = 20;
    public int weight = 10;

    @Override
    public void eat() {
        System.out.println("è����");
    }

    public void playGame(){
        System.out.println("è׽�Բ�");
    }
}
