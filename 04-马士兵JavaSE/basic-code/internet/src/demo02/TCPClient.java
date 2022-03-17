package demo02;

/**
 * @Author 李明
 * @Date 2022/1/23  15:06
 **/

import java.io.*;
import java.net.ConnectException;
import java.net.Socket;
public class TCPClient {
    public static void main(String[] args){
       try{
            Socket s1 = new Socket("127.0.0.1",8890);
            InputStream is = s1.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            dis.close();
            s1.close();
       }catch(ConnectException connExc){
           System.out.println("服务器连接失败");
           connExc.printStackTrace();
       }catch (IOException e){
           e.printStackTrace();
       }
    }
}
