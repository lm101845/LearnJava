package demo04;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.net.*;
import java.nio.charset.StandardCharsets;

/**
 * @Author 李明
 * @Date 2022/1/23  17:25
 **/
public class TestUDPClient {
    public static void main(String[] args) throws Exception{
        {
            long n = 10000L;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DataOutputStream dos = new DataOutputStream(baos);
            dos.writeLong(n);
            //byte[] buf = (new String("hello").getBytes(StandardCharsets.UTF_8));
            byte[] buf = baos.toByteArray();
            //System.out.println(buf.length);
            DatagramPacket dp = new DatagramPacket(buf,buf.length,new InetSocketAddress("127.0.0.1",5678));
            DatagramSocket ds = new DatagramSocket(9999);
            ds.send(dp);
            ds.close();

        }
    }
}
