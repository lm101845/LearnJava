package demo01;
import java.io.*;
import java.net.*;
/**
 * @Author 李明
 * @Date 2022/1/23  15:05
 **/

public class TCPServer {
    public static void main(String[] args) throws Exception{
        //注意：你应该先启动server,再启动client
        //写代码时，server和client也要一块开发。
        ServerSocket ss = new ServerSocket(6667);
        //ServerSocket是阻塞式的，它启动后，如果没有客户端连接它，它就傻等着
        //告诉server你在哪个端口监听客户端的连接(你不能监听所有的端口号，只能从65536个端口中选一个)

        //client端已经申请连接了，server端要接受
        //多个client端可以申请连接同一个server端，接收还是不接收，由server端说了算
        //我在服务器端专门建了一个插座(套接字),专门用来跟你做连接
        //有一个人连上我就accept，有一个人连上我就accept，所以server端都是死循环
        while(true){
            Socket s = ss.accept();
            //System.out.println("A client connect!");
            DataInputStream dis = new DataInputStream(s.getInputStream());
            System.out.println(dis.readUTF());
            dis.close();
            s.close();
        }
    }
}



