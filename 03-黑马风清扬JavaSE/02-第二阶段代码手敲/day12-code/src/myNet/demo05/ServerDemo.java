package myNet.demo05;

/**
 * @Author 李明
 * @Date 2022/2/3  11:15
 **/

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 *  服务器：接收数据，给出反馈
 * */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器端的Socket对象(ServerSocket)
        ServerSocket ss = new ServerSocket(10002);
        //监听客户端连接，返回一个Socket对象
        Socket s = ss.accept();
        //获取输入流，读数据，并把数据显示在控制台
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("服务器接收到的数据为：" + data);
        //给出反馈
        OutputStream os = s.getOutputStream();
        os.write("我是服务器，数据已经收到了".getBytes(StandardCharsets.UTF_8));
        //释放资源
//        s.close();
        ss.close();
    }
}
