package zhuanXing;

/**
 * @���� ����
 * @���� 2018��11��7������1:24:27
 * 
 * ��һ��ת�͵Ĳ��ͣ�
 * ����ת�ͣ��������õĶ���ת��Ϊ�������ͳ�Ϊ����ת�͡�ͨ�׵�˵�����ǽ��������תΪ������󡣴˴������������ǽӿڡ�
 * 
 * ���������ת�ͣ�Animal animal = new Cat();���������Catת��Ϊ�������Animal�����ʱ��animal������õ��õķ�����
 * ���෽����
 * 
 * ת�͹�������Ҫע�������

����ת��ʱ�����൥������ķ����ᶪʧ����������Dog���ж����run��������animal����ָ��Dog��ʵ��ʱ�Ƿ��ʲ���run�����ģ�
animal.run()�ᱨ��

�������ò���ָ�������Cat c = (Cat)new Animal()�����ǲ��еġ�

 */
 class Animal01 {
    public void eat(){
        System.out.println("animal eatting...");
    }
}

 class Cat extends Animal01{

    public void eat(){

        System.out.println("è����");
    }
}

 class Dog extends Animal01{

    public void eat(){

        System.out.println("���Թ�ͷ");
    }

    public void run(){
        System.out.println("������");
    }
}

public class Demo01 {

    public static void main(String[] args) {

        Animal01 animal = new Cat(); //����ת��
        animal.eat();

        animal = new Dog();
        animal.eat();
        //animal.run();     b��ָ��������󣬵���ʱ��ʧfly()����
        /*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
    	The method run() is undefined for the type Animal*/
    }

}

//���:
//�ҳ���
//�ҳԹ�ͷ
