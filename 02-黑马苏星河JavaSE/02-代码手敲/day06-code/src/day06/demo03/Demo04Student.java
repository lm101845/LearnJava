package day06.demo03;

public class Demo04Student {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("¹��");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("����" + stu.getName());
        System.out.println("����" + stu.getAge());
        System.out.println("�ǲ���ү�ǣ�" + stu.isMale());
    }
}
