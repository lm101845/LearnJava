package myNet.demo06;

/**
 * @Author 李明
 * @Date 2022/2/3  11:31
 **/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端：接收到数据在控制台输出
 * */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器Socket对象
        ServerSocket ss = new ServerSocket(10003);
        //监听客户端的连接，返回一个对应的Socket对象
        Socket s = ss.accept();
        //获取输入流
//        InputStream is = s.getInputStream();
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);
        //合并写法：
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        //释放资源
        s.close();
    }
}
