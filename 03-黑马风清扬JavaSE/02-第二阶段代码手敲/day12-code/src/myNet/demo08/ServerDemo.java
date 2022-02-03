package myNet.demo08;

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
        ServerSocket ss = new ServerSocket(1006);
        //监听客户端连接，返回一个对应的Socket对象
        Socket s = ss.accept();
        //接收数据——直接用BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //把数据写入文本文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\01-code\\28-LearnJavaSE★\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day12-code\\InetAddressDemo.java"));
        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //释放资源
        bw.close();
        ss.close();
    }
}
