package MyMap.demo04;

/**
 * @author ����
 * @date 2021��06��28�� 15:45
 */

import java.util.HashMap;
import java.util.Set;

/**
    ����
        ����һ��HashMap���ϣ�����ѧ������(Student)��ֵ�Ǿ�ס�� (String)���洢�����ֵ��Ԫ�أ���������
        Ҫ��֤����Ψһ�ԣ����ѧ������ĳ�Ա����ֵ��ͬ�����Ǿ���Ϊ��ͬһ������

    ˼·��
        1:����ѧ����
        2:����HashMap���϶���
        3:����ѧ������
        4:��ѧ����ӵ�����
        5:��������
        6:��ѧ��������д��������
            hashCode()
            equals()
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //����HashMap���϶���
        HashMap<Student,String> hm = new HashMap<>();

        //����ѧ������
        Student s1 = new Student("����ϼ", 30);
        Student s2 = new Student("������", 35);
        Student s3 = new Student("������", 33);
        Student s4 = new Student("������", 33);
        //�������ͬ��ֵҪ����

        //��ѧ����ӵ�����
        hm.put(s1, "����");
        hm.put(s2, "�人");
        hm.put(s3, "֣��");
        hm.put(s4, "����");

        //��������
        Set<Student> keySet = hm.keySet();
        for(Student key:keySet){
            String value = hm.get(key);
            System.out.println(key.getName() + "," + key.getAge() + "," + value);
        }
    }
}
