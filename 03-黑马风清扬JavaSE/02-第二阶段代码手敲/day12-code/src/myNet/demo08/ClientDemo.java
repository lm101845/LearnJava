package myNet.demo08;

/**
 * @Author ����
 * @Date 2022/2/3  11:31
 **/

import java.io.*;
import java.net.Socket;

/**
 *  �ͻ��ˣ��������Լ���¼��, ֱ�������������886���������ݽ���
 * */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //�����ͻ���Socket����
        Socket s = new Socket("192.168.1.6",1006);
        //��װ�ı��ļ�������
        BufferedReader br = new BufferedReader(new FileReader("E:\\01-code\\28-LearnJavaSE��\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day12-code\\InetAddressDemo.java"));
        //��װ�����д����
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //�ͷ���Դ
        br.close();
        s.close();
    }
}
