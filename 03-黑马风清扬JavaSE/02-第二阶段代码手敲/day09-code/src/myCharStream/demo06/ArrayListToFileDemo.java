package myCharStream.demo06;

/**
 * @author ����
 * @date 2021��07��05�� 18:48
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
    ����
        ��ArrayList�����е�ѧ������д�뵽�ı��ļ���Ҫ��ÿһ��ѧ�������������Ϊ�ļ��е�һ������
        ��ʽ��ѧ��,����,����,��ס��	������itheima001,����ϼ,30,����

    ˼·��
        1:����ѧ����
        2:����ArrayList����
        3:����ѧ������
        4:��ѧ��������ӵ�������
        5:�����ַ��������������
        6:�������ϣ��õ�ÿһ��ѧ������
        7:��ѧ�����������ƴ�ӳ�ָ����ʽ���ַ���
        8:�����ַ��������������ķ���д����
        9:�ͷ���Դ
 */
public class ArrayListToFileDemo {
    public static void main(String[] args) throws IOException {
        //����ArrayList����
        ArrayList<Student> array = new ArrayList<Student>();

        //����ѧ������
        Student s1 = new Student("itheima001", "����ϼ", 30, "����");
        Student s2 = new Student("itheima002", "������", 35, "�人");
        Student s3 = new Student("itheima003", "������", 33, "֣��");

        //��ѧ��������ӵ�������
        array.add(s1);
        array.add(s2);
        array.add(s3);

        //�����ַ��������������
        BufferedWriter bw = new BufferedWriter(new FileWriter("myCharStream\\students.txt"));

        //�������ϣ��õ�ÿһ��ѧ������
        for (Student s : array) {
            //��ѧ�����������ƴ�ӳ�ָ����ʽ���ַ���
            StringBuilder sb = new StringBuilder();
            sb.append(s.getSid()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());

            //�����ַ��������������ķ���д����
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        //�ͷ���Դ
        bw.close();
    }
}
