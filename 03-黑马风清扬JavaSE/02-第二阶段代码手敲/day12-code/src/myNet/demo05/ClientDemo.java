package myNet.demo05;

/**
 * @Author ����
 * @Date 2022/2/3  11:15
 **/

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**����Ҫ��
 * 1.�ͻ��ˣ��������ݣ����ܷ���������
 * 2.���������յ���Ϣ���������
 * ����������
 * 1.�ͻ��˴�������ʹ��������������
 * 2.����˴�������ʹ����������������
 * 3.�����ʹ�������������������
 * 4.�ͻ���ʹ�����������ܷ�������
 * */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //�����������˵�Socket����(ServerSocket)
        Socket s = new Socket("192.168.1.6",10002);
        //�����ͻ������ӣ�����һ��Socket����
        //��ȡ�������д���ݣ�����������ʾ�ڿ���̨
        OutputStream os = s.getOutputStream();
        os.write("hello,tcp,������".getBytes());
        //���շ���������
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("�ͻ��˽��յ��ķ������ķ������ݣ�" + data);
        //�ͷ���Դ
//        is.close();
//        os.close();
//        is��os�Ǹ���s����õ��ģ�����s�ͷź�is,os�����������Զ��ͷ���
        s.close();
    }
}
