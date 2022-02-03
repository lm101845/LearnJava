package myNet.demo06;

/**
 * @Author ����
 * @Date 2022/2/3  11:31
 **/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ����ˣ����յ������ڿ���̨���
 * */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //����������Socket����
        ServerSocket ss = new ServerSocket(10003);
        //�����ͻ��˵����ӣ�����һ����Ӧ��Socket����
        Socket s = ss.accept();
        //��ȡ������
//        InputStream is = s.getInputStream();
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);
        //�ϲ�д����
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        //�ͷ���Դ
        s.close();
    }
}
