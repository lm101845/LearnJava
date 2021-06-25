package mySet.demo03;

/**
 * @author ����
 * @date 2021��06��25�� 13:47
 */

import java.util.HashSet;

/**
    ����
        ����һ���洢ѧ������ļ��ϣ��洢3��ѧ������ʹ�ó���ʵ���ڿ���̨�����ü���
        Ҫ��ѧ������ĳ�Ա����ֵ��ͬ�����Ǿ���Ϊ��ͬһ������

    ˼·��
        1:����ѧ����
        2:����HashSet���϶���
        3:����ѧ������
        4:��ѧ����ӵ�����
        5:��������(��ǿfor)
 */
public class HashSetDemo02 {
    public static void main(String[] args) {
        //����HashSet���϶���
        HashSet<Student> hs = new HashSet<Student>();

        //����ѧ������
        Student s1 = new Student("����ϼ", 30);
        Student s2 = new Student("������", 35);
        Student s3 = new Student("������", 33);
        Student s4 = new Student("������", 33);

        //��ѧ����ӵ�����
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        //s3��s4����Ҫ������Ӳ���ȥ�ģ�����ʵ������ӽ�ȥ�ˣ���������Ҫ��дhashCode��equals����
        //alt + insertѡ��equals and hasCode()���Զ����ɼ���

        //��������(��ǿfor)
        for (Student s : hs) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
