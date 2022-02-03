package myNet.demo10;

import java.io.*;
import java.net.Socket;

/**
 * @Author ����
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
            //��������д���ı��ļ�
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//            BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\01-code\\28-LearnJavaSE��\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day12-code\\Copy.java"));
            //������Ƴ�ͻ����
            int count = 0;
            File file = new File("E:\\01-code\\28-LearnJavaSE��\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day12-code\\Copy[" + count + "].java");
            while(file.exists()){
                count++;
                file = new File("E:\\01-code\\28-LearnJavaSE��\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day12-code\\Copy[" + count + "].java");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            String line;
            while((line = br.readLine()) != null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            //��������
            BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwServer.write("�ļ��ϴ��ɹ�");
            bwServer.newLine();
            bwServer.flush();
            //�ͷ���Դ
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
