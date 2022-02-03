package myNet.demo04;

/**
 * @Author ����
 * @Date 2022/2/3  10:50
 **/

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

/**
 * TCP�������ݵĲ���
 * 1.�����ͻ��˵�Socket����(Socket)
 * 2.��ȡ�������д����
 * 3.�ͷ���Դ
 * */

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //�����ͻ��˵�Socket����(Socket)
        //Socket(InetAddress address, int port)  ����һ�����׽��ֲ��������ӵ�ָ�� IP ��ַ��ָ���˿ںš�
        //Socket s = new Socket(InetAddress.getByName("192.168.1.6"),10000);
        //Socket(String host, int port)
        Socket s = new Socket("192.168.1.6",10001);
        //��ȡ�������д����
        // OutputStream getOutputStream()  ���ش��׽��ֵ��������
        OutputStream os = s.getOutputStream();
        os.write("hello,tcp,������".getBytes());
        s.close();
    }
}
