package myNet.demo06;

/**
 * @Author ����
 * @Date 2022/2/3  11:31
 **/

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 *  �ͻ��ˣ��������Լ���¼��, ֱ�������������886���������ݽ���
 * */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //�����ͻ���Socket����
        Socket s = new Socket("192.168.1.6",10003);
        //���������ڼ���¼�룬ֱ�������������886���������ݽ���
        //ע������¼�����ǲ���Scanner�����Լ���װ��BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //��װ���������
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while((line = br.readLine()) != null){
            if("886".equals(line)){
                break;
            }
            //��ȡ���������
//            OutputStream os = s.getOutputStream();
//            os.write(line.getBytes(StandardCharsets.UTF_8));
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //�ͷ���Դ
        s.close();
    }
}
