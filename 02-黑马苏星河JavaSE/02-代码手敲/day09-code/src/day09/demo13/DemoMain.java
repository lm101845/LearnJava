package day09.demo13;

/**
 * @author ����
 * @date 2021��06��09�� 10:00
 */
public class DemoMain {
    public static void main(String[] args) {
        //Animal animal = new Animal();   //����

        //Dog dog = new Dog()  //������Ҳ�ǳ�����

        Dog2Ha ha = new Dog2Ha();
        //���ӱ��ģ��������ͨ�࣬����ֱ��new����
        ha.eat();
        ha.sleep();

        System.out.println("============");

        DogGolden golden = new DogGolden();
        golden.eat();
        golden.sleep();
    }
}
