package myNet.demo10;

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
        ServerSocket ss = new ServerSocket(1022);
        while(true){
            //�����ͻ������ӣ�����һ����Ӧ��Socket����
            Socket s = ss.accept();
            //Ϊÿ���ͻ��˿���һ���߳�
            new Thread(new ServerThread(s)).start();
        }
    }
}
