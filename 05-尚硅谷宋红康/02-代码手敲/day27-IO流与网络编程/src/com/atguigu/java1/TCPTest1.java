package com.atguigu.java1;

/**
 * @Author liming
 * @Date 2022/8/14 9:55
 **/

import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

/**
 * 实现TCP的网络编程
 * 例子1：客户端发送信息给服务端，服务端将数据显示在控制台上
 */
public class TCPTest1 {
    //客户端
    @Test
    public void client() {
        Socket socket = null;
        OutputStream os = null;  //拿到流了(字节流)，往外写东西
        try {
            InetAddress inet = InetAddress.getByName("127.0.0.1");   //IP是指对方的IP

            //IP和端口号封装为一个socket
            socket = new Socket(inet, 8899);

            os = socket.getOutputStream();   //客户端去写

            os.write("你好，我是客户端mm".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //流是一种资源，需要关闭；socket也是一种资源，也需要关闭
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    //服务端——先要启动服务器，不然客户端一连接发现服务器没有起起来，就不会发送资源了
    @Test
    public void server(){
        ServerSocket ss = null;
        Socket socket = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            //1.创建服务器端的ServerSocket，指明自己的端口号
            ss = new ServerSocket(8899);   //服务器只要指明自己的端口号即可
            //2.调用accept()表示接收来自于客户端的socket
            socket = ss.accept();//接收来自客户端的socket
            //3.获取输入流
            is = socket.getInputStream();   //服务端去读
//        不建议这样写，可能会有乱码
//        byte[] buffer = new byte[20];
//        int len;
//        while((len = is.read(buffer))  != -1){
//            String str = new String(buffer,0,len);
//            System.out.print(str);
//        }

            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[5];
            int len;
            while((len = is.read(buffer)) != -1){
                baos.write(buffer,0,len);
            }
            System.out.println(baos.toString());
            System.out.println("收到了来自于：" + socket.getInetAddress().getHostName() + "的数据");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(baos != null){
                //5.关闭资源
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(ss != null){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
