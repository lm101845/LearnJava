package day10.demo06;

/**
 * @author ����
 * @date 2021��06��13�� 22:26
 */

/**
��β���֪��һ���������õĶ��󣬱�����ʲô���ࣿ
��ʽ��
���� instanceof ������
�⽫��õ�һ��booleanֵ�����Ҳ�����ж�ǰ��Ķ����ܲ��ܵ����������͵�ʵ����
 */
public class Demo02Instanceof {
    public static void main(String[] args) {
        //Animal animal = new Cat();   //������һֻè
        Animal animal = new Dog();   //������һֻ��
        //�������ֻ�ܵ��ù��з��������������еķ���
        animal.eat();  //è����

        //���ϣ�������������з�������Ҫ����ת��
        System.out.println(animal instanceof Cat);  //true
        //�ж�һ�¸�������animal�ǲ���Dog
        if(animal instanceof Dog){
            //����ת��һ��Ҫ����instanceof�жϣ������п��ܻᷢ����ת���쳣
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }

        giveMeAPet(new Dog());
    }

    public static void giveMeAPet(Animal animal){
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
