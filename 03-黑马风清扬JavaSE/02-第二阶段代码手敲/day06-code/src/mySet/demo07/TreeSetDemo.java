package mySet.demo07;

/**
 * @author ����
 * @date 2021��06��25�� 15:11
 */

import java.util.Comparator;
import java.util.TreeSet;

/**
    ����
        ��TreeSet���ϴ洢���ѧ����Ϣ(���������ĳɼ�����ѧ�ɼ�)���������ü���
        Ҫ�󣺰����ִܷӸߵ��ͳ���

    ˼·��
        1:����ѧ����
        2:����TreeSet���϶���ͨ���Ƚ��������������
        3:����ѧ������
        4:��ѧ��������ӵ�����
        5:��������
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        //����TreeSet���϶���ͨ���Ƚ��������������
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //int num = (s2.getChinese() + s2.getMath()) - (s1.getChinese() + s1.getMath());
                //��Ҫ����������Ŀ�и���
                int num = s2.getSum() - s1.getSum();
                //��Ҫ���������������Լ�����
                int num2 = num == 0 ? s1.getChinese() - s2.getChinese():num;
                int num3 = num2 == 0 ? s1.getName().compareTo(s2.getName()):num2;
                return num3;
            }
        });

        //����ѧ������
        Student s1 = new Student("����ϼ", 98, 100);
        Student s2 = new Student("������", 95, 95);
        Student s3 = new Student("������", 100, 93);
        Student s4 = new Student("����", 100, 97);
        Student s5 = new Student("������", 98, 98);

        Student s6 = new Student("������", 97, 99);
//        Student s7 = new Student("������", 97, 99);
        Student s7 = new Student("����", 97, 99);

        //��ѧ��������ӵ�����
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);

        //��������
        for (Student s : ts) {
            System.out.println(s.getName() + "," + s.getChinese() + "," + s.getMath() + "," + s.getSum());
        }
    }
}
