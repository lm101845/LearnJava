package mySet.demo05;

/**
 * @author ����
 * @date 2021��06��25�� 14:28
 */

import java.util.TreeSet;

/**
    �洢ѧ�����󲢱�������������ʹ���޲ι��췽��
    Ҫ�󣺰��������С��������������ͬʱ��������������ĸ˳������
 */
public class TreeSetDemo02 {
    public static void main(String[] args) {
        //�������϶���
        TreeSet<Student> ts = new TreeSet<>();

        //����ѧ������
        //����ѧ������
        Student s1 = new Student("xishi", 29);
        Student s2 = new Student("wangzhaojun", 28);
        Student s3 = new Student("diaochan", 30);
        Student s4 = new Student("yangyuhuan", 33);

        Student s5 = new Student("linqingxia",33);
        Student s6 = new Student("linqingxia",33);

        //��ѧ����ӵ�����
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        //��������
        for(Student s:ts){
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
