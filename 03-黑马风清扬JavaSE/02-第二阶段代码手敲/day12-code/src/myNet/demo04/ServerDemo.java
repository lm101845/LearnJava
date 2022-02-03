package myNet.demo04;

/**
 * @Author ����
 * @Date 2022/2/3  11:05
 **/

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *  TCP�������ݵĲ��衢
 *  1.�����������˵�Socket����(ServerSocket)
 *  2.��ȡ�������������ݣ�����������ʾ�ڿ���̨
 *  3.�ͷ���Դ
 * */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //�����������˵�Socket����(ServerSocket)
        //ServerSocket(int port)  �����󶨵��ض��˿ڵķ������׽��֡�
        ServerSocket ss = new ServerSocket(10001);
        //Socket accept() ����Ҫ���ӵ����׽��ֲ�������
        Socket s = ss.accept();
        //��ȡ�������������ݣ�����������ʾ�ڿ���̨
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("������" + data);
        //�ͷ���Դ
        s.close();
        ss.close();
    }
}
