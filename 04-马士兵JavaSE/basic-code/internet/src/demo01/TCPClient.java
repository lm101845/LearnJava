package demo01;

/**
 * @Author 李明
 * @Date 2022/1/23  15:06
 **/
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.*;
public class TCPClient {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("127.0.0.1",6667);
        //client端的端口，系统给你随机选一个
        //第2个参数6666表示的是客户端申请要连接到服务器的哪个端口上
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        Thread.sleep(3000);
        dos.writeUTF("hello server!");
        dos.flush();
        dos.close();
        s.close();
        //socket也是一个连接，你连接完后，说完话了，最好老老实实关掉
    }
}
