package MyCollections.demo01;

/**
 * @author ����
 * @date 2021��07��01�� 14:29
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
    ����
        ArrayList�洢ѧ������ʹ��Collections��ArrayList��������
        Ҫ�󣺰��������С��������������ͬʱ��������������ĸ˳������

    ˼·��
        1:����ѧ����
        2:����ArrayList���϶���
        3:����ѧ������
        4:��ѧ����ӵ�����
        5:ʹ��Collections��ArrayList��������
        6:��������
 */
public class CollectionsDemo02 {
    public static void main(String[] args) {
        //����ArrayList���϶���
        ArrayList<Student> array = new ArrayList<>();

        //����ѧ������
        Student s1 = new Student("linqingxia", 30);
        Student s2 = new Student("zhangmanyu", 35);
        Student s3 = new Student("wangzuxian", 33);
        Student s4 = new Student("liuyan", 33);

        //��ѧ����ӵ�����
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

        //ʹ��Collections��ArrayList�������򡪡����ַ���Ҫ��Student���ṩһ�����򷽷�
        //sort(List<T> list, Comparator<? super T> c)��������ʹ���������
        Collections.sort(array, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //��Ҫ���������������С�������򣬴�Ҫ����������ͬʱ��������������ĸ˳������
                int num1 = s1.getAge() - s2.getAge();
                int num2 = num1 == 0 ? s1.getName().compareTo(s2.getName()):num1;
                return num2;
            }
        });

        //��������
        for(Student s:array){
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
