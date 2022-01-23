package demo04;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.net.*;
/**
 * @Author 李明
 * @Date 2022/1/23  17:17
 **/
public class TestUDPServer {
    public static void main(String[] args) throws Exception{
        byte buf[] = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf,buf.length);
        DatagramSocket ds = new DatagramSocket(5678);
        //这是UDP的5678端口
        while (true){
            ds.receive(dp);
            //只要有人发数据，我socket接收过来就给它仍包裹里
            ByteArrayInputStream bais = new ByteArrayInputStream(buf);
            DataInputStream dis = new DataInputStream(bais);
            System.out.println(dis.readLong());
            //System.out.println(new String(buf,0,dp.getLength()));
        }
    }
}
