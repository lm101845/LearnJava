package day06.demo05;

/**
 * @author ����
 * @date 2021��06��02�� 1:49
 */
public class Demo01Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("�����Ȱ�");
        stu1.setAge(20);

        System.out.println("������" + stu1.getName() + ",���䣺" + stu1.getAge());
        System.out.println("===============");

        Student stu2 = new Student("��������",21);
        System.out.println("������" + stu2.getName() + ",���䣺" + stu2.getAge());

        stu2.setAge(22);
        System.out.println("������" + stu2.getName() + ",���䣺" + stu2.getAge());
    }

}
