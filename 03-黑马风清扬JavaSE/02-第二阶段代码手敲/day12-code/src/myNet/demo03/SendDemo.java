package myNet.demo03;

/**
 * @Author ����
 * @Date 2022/2/2  21:07
 **/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

/**
 * ��������
 * UDP�������ݣ����������ڼ���¼�룬ֱ�������������886���������ݽ���
 * UDP�������ݣ���Ϊ���ն˲�֪�����Ͷ�ʲôʱ��ֹͣ���ͣ��ʲ�����ѭ������
 * */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        //�������Ͷ˵�Socket����(DatagramSocket)
        DatagramSocket ds = new DatagramSocket();
        //�Լ���װ����¼������
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine()) != null){
            //�����������886���������ݽ���
            if("886".equals(line)){
                break;
            }
            //�������ݣ��������ݴ��
            byte[] bys = line.getBytes();  //��¼�������ת�����ֽ�����
            DatagramPacket dp = new DatagramPacket(bys,bys.length, InetAddress.getByName("192.168.1.6"),12345);
            //����DatagramSocket����ķ�����������
            ds.send(dp);
        }
        //�رշ��Ͷ�
        ds.close();
    }
}
