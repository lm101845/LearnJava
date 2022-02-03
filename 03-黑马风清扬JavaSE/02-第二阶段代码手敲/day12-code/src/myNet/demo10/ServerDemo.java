package myNet.demo10;

/**
 * @Author 李明
 * @Date 2022/2/3  11:49
 **/

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 接受到的数据写入文本文件中
 * */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器Socket对象
        ServerSocket ss = new ServerSocket(1022);
        while(true){
            //监听客户端连接，返回一个对应的Socket对象
            Socket s = ss.accept();
            //为每个客户端开启一个线程
            new Thread(new ServerThread(s)).start();
        }
    }
}
