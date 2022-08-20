package com.atguigu.java1;

/**
 * @Author liming
 * @Date 2022/8/14 10:21
 **/

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * 实现TCP的网络编程
 * 例题2：客户端发送文件给服务端，服务端将文件保存在本地。
 */
public class TCPTest2 {
    /**
    这里涉及到的异常，应该使用try-catch-finally处理
   */
    @Test
    public void client() throws IOException {
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9090);
        OutputStream os = socket.getOutputStream();//造一个输出流，往外发——发一张图片给服务器
        FileInputStream fis = new FileInputStream(new File("beauty.jpg"));//先读取本地的一张图片
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) != -1){
            os.write(buffer,0,len);
        }

        fis.close();
        os.close();
        socket.close();
    }

    /**
     这里涉及到的异常，应该使用try-catch-finally处理
     */
    @Test
    public void server() throws IOException {
        ServerSocket ss = new ServerSocket(9090);
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();   //服务端造个输入流去读
        FileOutputStream fos = new FileOutputStream(new File("beauty1.jpg"));   //读完后造个输出流保存到本地
        byte[]  buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1){
            fos.write(buffer,0,len);
        }
        fos.close();
        is.close();
        socket.close();
        ss.close();
    }
}
