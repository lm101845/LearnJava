package myNet.demo05;

/**
 * @Author ����
 * @Date 2022/2/3  11:15
 **/

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 *  ���������������ݣ���������
 * */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //�����������˵�Socket����(ServerSocket)
        ServerSocket ss = new ServerSocket(10002);
        //�����ͻ������ӣ�����һ��Socket����
        Socket s = ss.accept();
        //��ȡ�������������ݣ�����������ʾ�ڿ���̨
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("���������յ�������Ϊ��" + data);
        //��������
        OutputStream os = s.getOutputStream();
        os.write("���Ƿ������������Ѿ��յ���".getBytes(StandardCharsets.UTF_8));
        //�ͷ���Դ
//        s.close();
        ss.close();
    }
}
