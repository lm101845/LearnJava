package MyMap.demo03;

/**
 * @author ����
 * @date 2021��06��21�� 15:04
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
    ����
        ����һ���洢ѧ������ļ��ϣ��洢3��ѧ������ʹ�ó���ʵ���ڿ���̨�����ü���

    ˼·��
        1:����ѧ����
        2:����Collection���϶���
        3:����ѧ������
        4:��ѧ����ӵ�����
        5:��������(��������ʽ)
 */
public class CollectionDemo {
    public static void main(String[] args) {
        //����Collection���϶���
        Collection<Student> c = new ArrayList<Student>();

        //����ѧ������
        Student s1 = new Student("����ϼ",30);
        Student s2 = new Student("������",35);
        Student s3 = new Student("������",33);

        //��ѧ����ӵ�����
        c.add(s1);
        c.add(s2);
        c.add(s3);

        //��������
        Iterator<Student> it = c.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
