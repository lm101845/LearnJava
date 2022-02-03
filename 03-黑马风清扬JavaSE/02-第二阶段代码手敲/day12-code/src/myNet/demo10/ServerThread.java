package myNet.demo10;

import java.io.*;
import java.net.Socket;

/**
 * @Author 李明
 * @Date 2022/2/3  15:11
 **/
public class ServerThread implements Runnable {
    private Socket s;
    public ServerThread(Socket s) {
        this.s = s;
    }
    @Override
    public void run() {
        try {
            //接收数据写到文本文件
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//            BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\01-code\\28-LearnJavaSE★\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day12-code\\Copy.java"));
            //解决名称冲突问题
            int count = 0;
            File file = new File("E:\\01-code\\28-LearnJavaSE★\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day12-code\\Copy[" + count + "].java");
            while(file.exists()){
                count++;
                file = new File("E:\\01-code\\28-LearnJavaSE★\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day12-code\\Copy[" + count + "].java");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            String line;
            while((line = br.readLine()) != null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            //给出反馈
            BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwServer.write("文件上传成功");
            bwServer.newLine();
            bwServer.flush();
            //释放资源
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
