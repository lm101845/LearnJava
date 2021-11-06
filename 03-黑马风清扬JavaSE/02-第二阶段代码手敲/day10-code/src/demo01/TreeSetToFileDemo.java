package demo01;

/**
 * @author ����
 * @date 2021��07��06�� 20:06
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * ����
 * ����¼�� 5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�)��Ҫ���ճɼ��ִܷӸߵ���д���ı��ļ�
 * ��ʽ������ ,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ� ����������ϼ,98,99,100
 * <p>
 * ˼·��
 * 1. ����ѧ����
 * 2. ����TreeSet���ϣ�ͨ���Ƚ��������������
 * 3. ����¼��ѧ������
 * 4. ����ѧ�����󣬰Ѽ���¼������ݶ�Ӧ��ֵ��ѧ������ĳ�Ա����
 * 5. ��ѧ��������ӵ�TreeSet����
 * 6. �����ַ��������������
 * 7. �������ϣ��õ�ÿһ��ѧ������
 * 8. ��ѧ�����������ƴ�ӳ�ָ����ʽ���ַ���
 * 9. �����ַ��������������ķ���д����
 * 10. �ͷ���Դ
 */

public class TreeSetToFileDemo {
    public static void main(String[] args) throws IOException {
        //����TreeSet���ϣ�ͨ���Ƚ��������������
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //�ɼ��ִܷӸߵ���
                int num = s2.getSum() - s1.getSum();
                //��Ҫ����
                int num2 = num == 0 ? s1.getchinese() - s2.getchinese() : num;
                int num3 = num2 == 0 ? s1.getMath() - s2.getMath() : num2;
                int num4 = num3 == 0 ? s1.getName().compareTo(s2.getName()) : num3;
                return num4;
            }
        });

        //����¼��ѧ������
        for(int i = 0 ; i < 5;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("��¼���" + (i+1) + "��ѧ����Ϣ");
            System.out.println("����:");
            String name = sc.nextLine();
            System.out.println("���ĳɼ�:");
            String chinese = sc.nextLine();
            System.out.println("��ѧ�ɼ�:");
            String math = sc.nextLine();
            System.out.println("Ӣ��ɼ�:");
            String english = sc.nextLine();

            //����ѧ�����󣬰Ѽ���¼������ݶ�Ӧ��ֵ��ѧ������ĳ�Ա����
            Student s = new Student();
            s.setName(name);
            s.setName(chinese);
            s.setName(math);
            s.setName(english);

            //��ѧ��������ӵ�TreeSet����
            ts.add(s);
        }

        //�����ַ��������������
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day10-code\\src\\content\\ts.txt"));

        //�������ϣ��õ�ÿһ��ѧ������
        //��ʽ������ ,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ� ����������ϼ,98,99,100
        for(Student s:ts){
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append(",").append(s.getchinese()).append(",").append(s.getMath()).append(",").append(s.getEnglish()).append(",").append(s.getSum());


            //�����ַ��������������ķ���д����
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        //�ͷ���Դ
        bw.close();
    }
}
