package cn.itcast.dayo8.demo04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
  * 作者：李明
  * 日期： 2018年12月1日 下午3:47:56
  * 看的遍数：1
 * 
 * 题目：
 * 与上一题相反，将文件中的字符串文本读取到集合当中去，并且每一行文本作为集合中的一个字符串元素
 
 * 步骤：
 * 1.需要读取文件，那么可以使用:FileReader、BufferedReader
 * 2.为了性能更高，最好用谁：BufferedReader
 * 3.需要读取一整行，那么就用：readLine方法。（只有BufferedReader才有）
 * 4.需要有一个集合来存放读取出来的字符串：ArrayList<String>
 * 5.读取一行：readLine
 * 6.将读到的字符串添加到集合当中：add
 * 7.上述4-6步骤是一个循环的过程，读取到null就要停止
 * 8.关闭流
 * 9.遍历集合，查看所有字符串元素的内容
 * 
 */
public class Demo02FromFileToList {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("练习1.txt"));
		ArrayList<String> list = new ArrayList<>();
		
		String line;		//代表一行字符串
		while((line = br.readLine()) != null) {
			list.add(line);  // 将读取得到的一行字符串添加到集合当中
			
		}
		
		br.close();  //关闭流
		
		for(int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
		}
	}
}
