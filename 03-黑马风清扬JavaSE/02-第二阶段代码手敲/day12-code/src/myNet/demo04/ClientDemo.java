package myNet.demo04;

/**
 * @Author 李明
 * @Date 2022/2/3  10:50
 **/

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

/**
 * TCP发送数据的步骤
 * 1.创建客户端的Socket对象(Socket)
 * 2.获取输出流，写数据
 * 3.释放资源
 * */

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象(Socket)
        //Socket(InetAddress address, int port)  创建一个流套接字并将其连接到指定 IP 地址的指定端口号。
        //Socket s = new Socket(InetAddress.getByName("192.168.1.6"),10000);
        //Socket(String host, int port)
        Socket s = new Socket("192.168.1.6",10001);
        //获取输出流，写数据
        // OutputStream getOutputStream()  返回此套接字的输出流。
        OutputStream os = s.getOutputStream();
        os.write("hello,tcp,我来了".getBytes());
        s.close();
    }
}
