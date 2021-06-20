package cn.itcast.dayo8.demo01;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 作者：李明
 * 日期： 2018年11月27日 下午7:01:01
 * 看的遍数：1
 * 
 * FileWriter当中写数据的方法writer有5种重载形式：
 * 
 * public void write(int ch)：参数是单个文字对应的数字（参考ASCII或者是Unicode表）
 * public void write(String str):写一个完整的字符串
 * public void write(String str， int offset, int count):写字符串当中的一部分
 * public void write(char[] array):写一个完整的字符数组
 * public void write(char[] array ， int offset, int count):写字符数组当中的一部分
 * 
 * 
 */
public class Demo05FileWriterOverLoad {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("file05.txt");
		
		//写单个字符
		fw.write(65);  //A
		fw.write(66);  //B
		fw.write(67);  //C
		fw.write(48);  //0
		fw.write(97);  //a
		//============================
		
		//写一个完整的字符串
		fw.write("Hello");
		fw.write("World\r\n");
		//============================
		
		//写一个字符串当中的部分内容
		String str = "生前何必久睡，死后自会长眠。";
		fw.write(str,7,6);  //死后自会长眠
		//============================
		
		//写一个完整的字符数组
		char[] array = {'j' , 'a' , 'v' , 'a' , '!' };
		fw.write(array);
		
		//写一个字符数组的部分内容
		fw.write(array,1,3);
		
		fw.close();
		
		
	}

}
