package myCharStream.demo04;

/**
 * @author ����
 * @date 2021��07��05�� 10:08
 */

import java.io.*;

/**
 * �ַ������������й���
 * BufferedWriter��
 * void newLine()��дһ���зָ������зָ����ַ�����ϵͳ���Զ���
 * <p>
 * BufferedReader��
 * public String readLine()����һ�����֡�
 * ��������е����ݵ��ַ������������κ�����ֹ�ַ���������Ľ�β�Ѿ������Ϊnull
 */
public class BufferStreamDemo02 {
    public static void main(String[] args) throws IOException {
        //�����ַ����������
//        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\bw.txt"));

        //д����
//        for (int i = 0; i < 10; i++) {
//            bw.write("hello" + i);
//            bw.write("\r\n");
//            bw.newLine();
//            bw.flush();
//        }

        //�ͷ���Դ
//        bw.close();

//        //�����ַ�����������
          BufferedReader br = new BufferedReader(new FileReader("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\bw.txt"));
//        //public String readLine()����һ�����֡�
//        //��һ�ζ�ȡ����
//        String line = br.readLine();
//        System.out.println(line);
//
//        //�ڶ��ζ�ȡ����
//        line = br.readLine();
//        System.out.println(line);
//
//        //�ڶ������
//        line = br.readLine();
//        System.out.println(line);
//
//        line = br.readLine();
//        System.out.println(line);
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }

        br.close();
    }
}
