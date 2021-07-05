package myCharStream.demo06;

/**
 * @author ����
 * @date 2021��07��05�� 18:29
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * ���󣺰��ı��ļ��е����ݶ�ȡ�������У����������ϡ�Ҫ���ļ���ÿһ��������һ��ѧ������ĳ�Ա����ֵ
 * ������itheima001,����ϼ,30,����
 * <p>
 * ˼·��
 * 1:����ѧ����
 * 2:�����ַ���������������
 * 3:����ArrayList���϶���
 * 4:�����ַ���������������ķ���������
 * 5:�Ѷ�ȡ�����ַ���������split()���зָ�õ�һ���ַ�������
 * 6:����ѧ������
 * 7:���ַ��������е�ÿһ��Ԫ��ȡ������Ӧ�ĸ�ֵ��ѧ������ĳ�Ա����ֵ
 * 8:��ѧ��������ӵ�����
 * 9:�ͷ���Դ
 * 10:��������
 */
public class FileToArrayListDemo {
    public static void main(String[] args) throws IOException {
        //�����ַ���������������
        BufferedReader br = new BufferedReader(new FileReader("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\b.txt"));


        //����ArrayList���϶���
        ArrayList<Student> array = new ArrayList<>();

        //�����ַ���������������ķ���������
        String line;
        while ((line = br.readLine()) != null) {
            //�Ѷ�ȡ�����ַ���������split()���зָ�õ�һ���ַ�������
            String[] strArray = line.split(",");

            //����ѧ������
            Student s = new Student();
            //���ַ��������е�ÿһ��Ԫ��ȡ������Ӧ�ĸ�ֵ��ѧ������ĳ�Ա����ֵ
            //itheima001,����ϼ,30,����
            s.setSid(strArray[0]);
            s.setName(strArray[1]);
            s.setAge(Integer.parseInt(strArray[2]));  //���ַ���תΪint���͵�����
            s.setAddress(strArray[3]);

            //��ѧ��������ӵ�����
            array.add(s);
        }

        //�ͷ���Դ
        br.close();

        //��������
        for (Student s : array) {
            System.out.println(s.getSid() + "," + s.getName() + "," + s.getAge() + "," + s.getAddress());
        }
    }
}
