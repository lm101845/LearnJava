package demo05;

/**
 * @author ����
 * @date 2021��06��21�� 15:38
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
    ����
        ����һ���洢ѧ������ļ��ϣ��洢3��ѧ������ʹ�ó���ʵ���ڿ���̨�����ü���

    ˼·��
        1:����ѧ����
        2:����List���϶���
        3:����ѧ������
        4:��ѧ����ӵ�����
        5:��������(��������ʽ��forѭ����ʽ)
 */
public class ListDemo {
    public static void main(String[] args) {
        //�������϶���
        List<Student> list = new ArrayList<>();

        //����ѧ������
        Student s1 = new Student("����ϼ", 31);
        Student s2 = new Student("������", 34);
        Student s3 = new Student("������", 32);

        //��ѧ����ӵ�����
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //��������֮��������ʽ
        Iterator<Student> it = list.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge());
        }

        //forѭ����ʽ
        for(int i=0; i<list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
