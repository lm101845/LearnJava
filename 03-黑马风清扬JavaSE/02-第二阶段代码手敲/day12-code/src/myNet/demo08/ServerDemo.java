package myNet.demo08;

/**
 * @Author ����
 * @Date 2022/2/3  11:49
 **/

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ���ܵ�������д���ı��ļ���
 * */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //����������Socket����
        ServerSocket ss = new ServerSocket(1006);
        //�����ͻ������ӣ�����һ����Ӧ��Socket����
        Socket s = ss.accept();
        //�������ݡ���ֱ����BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //������д���ı��ļ�
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\01-code\\28-LearnJavaSE��\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day12-code\\InetAddressDemo.java"));
        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //�ͷ���Դ
        bw.close();
        ss.close();
    }
}
