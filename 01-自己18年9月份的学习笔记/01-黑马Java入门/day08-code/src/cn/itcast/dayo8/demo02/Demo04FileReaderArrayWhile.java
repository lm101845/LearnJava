package cn.itcast.dayo8.demo02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 * ���ߣ�����
 * ���ڣ� 2018��12��1�� ����7:21:27
 * ���ı�����1
 */
public class Demo04FileReaderArrayWhile {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("file07.txt");
		
		char[] buf = new char[2];  
		int len;  //������Ч����
		while((len = fr.read(buf)) != -1) {
			String str = new String(buf, 0 , len);
			System.out.println(str);
		}
		
		fr.close();
	}
}
