package day10.demo06;

/**
 * @author ����
 * @date 2021��06��13�� 22:01
 */

/**
����ת��һ���ǰ�ȫ�ģ�û������ģ���ȷ�ġ�����Ҳ��һ���׶ˣ�
����һ������ת��Ϊ���࣬��ô���޷���������ԭ�����е����ݡ�

����������ö��������ת�͡���ԭ����
 ע�⣺��������è�����ܻ�ԭ��Ϊè
 */
public class Demo01Main {
    public static void main(String[] args) {
        //���������ת�;��Ǹ�������ָ���������
        Animal animal = new Cat();
        animal.eat();

        //animal.catchMouse();
        //����д��������
        //��Ϊ�������ǰ��������������Դ��ģ����뿴�󣬶���û��catchMouse�������������

        //����ת�ͣ����л�ԭ����
        Cat cat = (Cat) animal;
        cat.catchMouse();


        // �����Ǵ��������ת��
        // ����new��ʱ����һֻè�����ڷ�Ҫ������
        // ����д�������벻�ᱨ���������л�����쳣��
        // java.lang.ClassCastException����ת���쳣
        Dog dog = (Dog) animal;

    }
}
