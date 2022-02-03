package myNet.demo06;

/**
 * @Author 李明
 * @Date 2022/2/3  11:31
 **/

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 *  客户端：数据来自键盘录入, 直到输入的数据是886，发送数据结束
 * */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("192.168.1.6",10003);
        //数据来自于键盘录入，直到输入的数据是886，发送数据结束
        //注：键盘录入我们不用Scanner，用自己包装的BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //封装输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while((line = br.readLine()) != null){
            if("886".equals(line)){
                break;
            }
            //获取输出流对象
//            OutputStream os = s.getOutputStream();
//            os.write(line.getBytes(StandardCharsets.UTF_8));
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //释放资源
        s.close();
    }
}
