package myNet.demo01;

/**
 * @author ����
 * @date 2021��07��19�� 11:34
 */

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
    InetAddress
        �����ʾInternetЭ�飨IP����ַ

    public static InetAddress getByName(String host)��ȷ���������Ƶ�IP��ַ���������ƿ����ǻ������ƣ�Ҳ������IP��ַ
    public String getHostName()����ȡ��IP��ַ��������
    public String getHostAddress()�������ı���ʾ�е�IP��ַ�ַ���
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        //public static InetAddress getByName(String host)��ȷ���������Ƶ�IP��ַ���������ƿ����ǻ������ƣ�Ҳ������IP��ַ
        //InetAddress address = InetAddress.getByName("LAPTOP-8DLHC9EA");
        InetAddress address = InetAddress.getByName("192.168.1.4");

        //public String getHostName()����ȡ��IP��ַ��������
        String name = address.getHostName();

        // public String getHostAddress()�������ı���ʾ�е�IP��ַ�ַ���
        String ip = address.getHostAddress();

        System.out.println("������" + name);
        System.out.println("ip��ַ" + ip);
    }
}
