package myNet.demo09;

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
        ServerSocket ss = new ServerSocket(1017);
        //�����ͻ������ӣ�����һ����Ӧ��Socket����
        Socket s = ss.accept();
        //�������ݡ���ֱ����BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //������д���ı��ļ�
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\01-code\\28-LearnJavaSE��\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day12-code\\Copy.java"));
        String line;
        while((line = br.readLine()) != null){  //�ȴ���ȡ����
//            if("886".equals(line)){
//                break;
//            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        System.out.println(1111);
        //��������
        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServer.write("�ļ��ϴ��ɹ�");
        bwServer.newLine();
        bwServer.flush();
        //�ͷ���Դ
        bw.close();
        ss.close();
    }
}
