package com.atguigu.java1;

/**
 * @Author liming
 * @Date 2022/8/14 10:38
 **/

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * 实现TCP的网络编程
 * 例题3：从客户端发送文件给服务端，服务端保存到本地。并返回“发送成功”给客户端。
 * 并关闭相应的连接。
 */
public class TCPTest3 {
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
        socket.shutdownOutput();   //关闭一下数据的输出——图片已经传完了，就不再输出数据了
        //接收来自于服务器端的数据，并显示到控制台上
        InputStream is = socket.getInputStream();  //造一个输入流去读传过来的数据
        ByteArrayOutputStream baos = new ByteArrayOutputStream();  //造一个输出流把读到的数据再显示到控制台上
        byte[] bufferr = new byte[20];
        int len1;
        while((len1 = is.read(bufferr)) != -1){
            baos.write(bufferr,0,len1);
        }

        System.out.println(baos.toString());
        fis.close();
        os.close();
        socket.close();
        baos.close();
    }

    /**
     这里涉及到的异常，应该使用try-catch-finally处理
     */
    @Test
    public void server() throws IOException {
        ServerSocket ss = new ServerSocket(9090);
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();   //服务端造个输入流去读
        FileOutputStream fos = new FileOutputStream(new File("beauty2.jpg"));   //读完后造个输出流保存到本地
        byte[]  buffer = new byte[1024];
        int len;
        //read方法是一个阻塞式的方法，你不告诉我，我就不会退出循环
        while ((len = is.read(buffer)) != -1){
            fos.write(buffer,0,len);
        }
        System.out.println("图片传输完成");
        //服务器端给予客户端反馈
        OutputStream os = socket.getOutputStream();   //造一个输出流，往外写数据给客户端
        os.write("你好，美女，照片我已收到，非常漂亮".getBytes(StandardCharsets.UTF_8));
        fos.close();
        is.close();
        socket.close();
        ss.close();
        os.close();
    }
}
