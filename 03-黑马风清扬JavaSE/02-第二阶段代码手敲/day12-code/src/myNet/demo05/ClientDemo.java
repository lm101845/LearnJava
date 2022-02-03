package myNet.demo05;

/**
 * @Author 李明
 * @Date 2022/2/3  11:15
 **/

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**案例要求：
 * 1.客户端：发送数据，接受服务器反馈
 * 2.服务器：收到消息后给出反馈
 * 案例分析：
 * 1.客户端创建对象，使用输出流输出数据
 * 2.服务端创建对象，使用输入流接受数据
 * 3.服务端使用输出流给出反馈数据
 * 4.客户端使用输入流接受反馈数据
 * */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器端的Socket对象(ServerSocket)
        Socket s = new Socket("192.168.1.6",10002);
        //监听客户端连接，返回一个Socket对象
        //获取输出流，写数据，并把数据显示在控制台
        OutputStream os = s.getOutputStream();
        os.write("hello,tcp,我来了".getBytes());
        //接收服务器反馈
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("客户端接收到的服务器的反馈数据：" + data);
        //释放资源
//        is.close();
//        os.close();
//        is和os是根据s对象得到的，所以s释放后，is,os它们两个就自动释放了
        s.close();
    }
}
