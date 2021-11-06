package myNet.demo02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author ����
 * @date 2021��09��21�� 10:47
 */

/*
    UDP�������ݵĲ���
        1:�������ն˵�Socket����(DatagramSocket)
        2:����һ�����ݰ������ڽ�������
        3:����DatagramSocket����ķ�����������
        4:�������ݰ������������ڿ���̨��ʾ
        5:�رս��ն�
 */
public class ReceiveDemo {
    //�������ն˵�Socket����(DatagramSocket)
    //DatagramSocket(int port) �������ݱ��׽��ֲ�����󶨵����������ϵ�ָ���˿�
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        //����һ�����ݰ������ڽ�������
        //DatagramPacket(byte[] buf, int length) ����һ�� DatagramPacket���ڽ��ճ���Ϊ length���ݰ�
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys,bys.length);

        //����DatagramSocket����ķ�����������
        ds.receive(dp);

        //�������ݰ������������ڿ���̨��ʾ
        //byte[] getData() �������ݻ�����
        byte[] datas = dp.getData();

        //int getLength() ����Ҫ���͵����ݵĳ��Ȼ���յ������ݵĳ���
        int len = dp.getLength();
        //String dataString = new String(datas);
        String dataString = new String(datas,0,len);
        //��һ���ֽ����������ת��Ϊһ���ַ���
        System.out.println("������" + dataString);

        //�رս��ն�
        ds.close();
    }
}
