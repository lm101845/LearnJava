package cn.itcast.dayo8.demo03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 作者：李明
 * 日期： 2018年12月1日 上午7:21:27
 * 看的遍数：1
 * 
 * BufferedReader额外提供了一个方法，可以读取一整行字符串
 * public String readLine(): 读取一整行字符串，返回值当中不包含换行符
 */
public class Demo04ReadLine {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("file11.txt");
		BufferedReader br = new BufferedReader(fr);
		
//		 String line = br.readLine();
//		 System.out.println(line);  //hello
//		 
//		 line = br.readLine();  
//		 System.out.println(line);  //world
//		 
//		 line = br.readLine();
//		 System.out.println(line);  //java
//		 
//		 line = br.readLine();
//		 System.out.println(line);  //
//		 System.out.println(line == null);  //true
//		 
		String line;   //代表一行字符串
		while ((line = br.readLine()) != null) {
			System.out.println(line);    //如果不写ln,则就写到一行去了
		}
		
		 br.close();
	}
}
