package myNet.demo02;

import myNet.demo01.InetAddressDemo;

import java.io.IOException;
import java.net.*;


/**
 * @author ����
 * @date 2021��09��21�� 10:20
 */

/*
    UDP�������ݵĲ���
        1:�������Ͷ˵�Socket����(DatagramSocket)
        2:�������ݣ��������ݴ��
        3:����DatagramSocket����ķ�����������
        4:�رշ��Ͷ�
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        //�������Ͷ˵�Socket����(DatagramSocket)
        // DatagramSocket() �������ݱ��׽��ֲ�����󶨵����������ϵ��κο��ö˿�
        DatagramSocket ds = new DatagramSocket();

        //�������ݣ��������ݴ��
        //DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        //����һ�����ݰ������ͳ���Ϊ length�����ݰ���ָ�������ϵ�ָ���˿ںš�
        byte[] bys = "hello,udp,������".getBytes();
//        int length = bys.length;
//        InetAddress address = InetAddress.getByName("192.168.1.66");
//        //Ctrl+alt+v����������ߵ�����
//        int port = 10086;
//        DatagramPacket dp = new DatagramPacket(bys,length,address,port);

//        ����Ĵ���д���е��鷳�ˣ��������Ż�һ��
        DatagramPacket dp = new DatagramPacket(bys,bys.length,InetAddress.getByName("192.168.1.6"),10088);

        //����DatagramSocket����ķ�����������
        //void send(DatagramPacket p) �Ӵ��׽��ַ������ݱ���
        ds.send(dp);

        //�رշ��Ͷ�
        //void close() �رմ����ݱ��׽���
        ds.close();
    }
}
