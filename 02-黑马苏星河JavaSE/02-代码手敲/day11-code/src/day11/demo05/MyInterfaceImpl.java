package day11.demo05;

/**
 * @author ����
 * @date 2021��06��15�� 10:30
 */

//ʹ���������ڲ��������ļ��Ϳ��Բ����ˣ�������ɾ����
//��ʱ��Ϊ�˽ӿڲ��ò�д��һ��ʵ���࣬������鷳���һ��õ���дһ��.java�ļ���implementsʵ������ӿ�
public class MyInterfaceImpl implements MyInterface {
    @Override
    public void method1() {
        System.out.println("ʵ���า����д�˷���111");
    }

    @Override
    public void method2() {
        System.out.println("ʵ���า����д�˷���222");
    }
}
