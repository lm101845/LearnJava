package day06.demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu1 = new Student();   //�޲ι���
        //������ͨ��new���������ʱ����ʵ������ʹ�ù��췽��
        //�����췽���ĵ��á���ͨ��new�ؼ��ּӿո񣬶�����ͨ��ʲô�������õġ�

        System.out.println("=================");

        Student stu2 = new Student("����ӱ",20);  //ȫ�ι���
        System.out.println("������" + stu2.getName() + ",���䣺" + stu2.getAge());
        //�����Ҫ�ı�����еĳ�Ա�����������ݣ���Ȼ����Ҫʹ��setxxx����

        stu2.setAge(21);  //�ı�����
        System.out.println("������" + stu2.getName() + ",���䣺" + stu2.getAge());

    }
}
