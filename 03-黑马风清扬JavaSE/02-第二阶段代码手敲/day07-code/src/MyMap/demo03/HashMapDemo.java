package MyMap.demo03;

/**
 * @author ����
 * @date 2021��06��28�� 15:36
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
    ����
        ����һ��HashMap���ϣ�����ѧ��(String)��ֵ��ѧ������(Student)���洢������ֵ��Ԫ�أ�������

    ˼·��
        1:����ѧ����
        2:����HashMap���϶���
        3:����ѧ������
        4:��ѧ����ӵ�����
        5:��������
            ��ʽ1������ֵ
            ��ʽ2����ֵ�Զ����Ҽ���ֵ
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //����HashMap���϶���
        HashMap<String,Student> hm = new HashMap<>();

        //����ѧ������
        Student s1 = new Student("����ϼ", 30);
        Student s2 = new Student("������", 35);
        Student s3 = new Student("������", 33);

        //��ѧ����ӵ�����
        hm.put("01",s1);
        hm.put("02",s2);
        hm.put("03",s3);

        //�������Ϸ�ʽ1������ֵ
        Set<String> keySet = hm.keySet();
        for(String key:keySet){
            Student value = hm.get(key);
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }

        System.out.println("===================");

        //�������Ϸ�ʽ2����ֵ�Զ����Ҽ���ֵ
        Set<Map.Entry<String, Student>> entrySet = hm.entrySet();
        for(Map.Entry<String, Student> me:entrySet){
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }
    }
}
