package demo02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * @Author 李明
 * @Date 2022/1/23  15:05
 **/

public class TCPServer {
    public static void main(String[] args){
        try{
            ServerSocket s = new ServerSocket(8890);
            while(true){
                Socket s1 = s.accept();
                OutputStream os = s1.getOutputStream();  //把服务端里面的内容写到客户端！！！
                DataOutputStream dos = new DataOutputStream(os);
                dos.writeUTF("hello" + s1.getInetAddress() + "port#" + s1.getPort() + "bye-bye");
                //这个拿的是【客户端的IP和端口！！】
                //因为这个socket连接的是客户端
                dos.close();
                s1.close();
            }
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("程序运行出错：" + e);
        }
    }
}



