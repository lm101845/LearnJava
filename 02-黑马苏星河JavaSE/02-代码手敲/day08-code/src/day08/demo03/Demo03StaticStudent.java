package day08.demo03;

/**
 * @author ����
 * @date 2021��06��04�� 21:04
 */


public class Demo03StaticStudent {
    public static void main(String[] args) {
        // ��������һ�½��ң����Ǿ�̬�Ķ�����Ӧ��ͨ�������ƽ��е���
        Student.room = "102����";

        Student one = new Student("����",20);
        System.out.println("one��������" + one.getName());
        System.out.println("one�����䣺" + one.getAge());
        System.out.println("one�Ľ��ң�" + Student.room);
        //��дone.room��ʵҲ�У����ǻ��ǽ�����������ֱ�ӵ��ã�������������������


        System.out.println("============");

        Student two = new Student("����", 18);
        System.out.println("two��������" + two.getName());
        System.out.println("two�����䣺" + two.getAge());
        System.out.println("two�Ľ��ң�" + Student.room);
    }
}
