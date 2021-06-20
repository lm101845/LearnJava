package cn.itcast.dayo8.demo02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 * 作者：李明
 * 日期： 2018年12月1日 上午7:21:27
 * 看的遍数：1
 */
public class Demo04FileReaderArrayWhile {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("file07.txt");
		
		char[] buf = new char[2];  
		int len;  //代表有效个数
		while((len = fr.read(buf)) != -1) {
			String str = new String(buf, 0 , len);
			System.out.println(str);
		}
		
		fr.close();
	}
}
