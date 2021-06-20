package cn.itcast.dayo8.demo03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 作者：李明
 * 日期： 2018年12月1日 上午7:21:27
 * 看的遍数：1
 * 
 * BufferedWriter额外提供了一个换行的方法
 * public void newLine():将会自动根据操作系统的不同选择写入\r\n或者是\r或者是\n
 */
public class Demo02NewLine {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("file09.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hello");
		//bw.write("\r\n");  //这种写法不太好，一旦换了操作系统，那么就要修改代码
		
		bw.newLine();  //自动根据操作系统选择对应的换行符
		
		bw.write("World");
		
		bw.close();
	}
}
