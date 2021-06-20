package cn.itcast.dayo8.demo04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *  作者：李明
  * 日期： 2018年12月1日 下午3:47:56
  * 看的遍数：1
  * 
 * 反转藏头情诗：
 * 分析：
 * 1.肯定需要读取文件，所以创建一个BufferedReader
 * 2.定义一个集合，用来存放所有的句子：ArrayList<String>
 * 3.添加需要add,读取一行需要readLine
 * 4.要将结果写到另一个文件当中，另外创建一个BufferedWriter
 * 5.倒序遍历集合。for循环，但是i不是从0开始，而是从.size()-1开始
 * 6.在倒序遍历集合的时候，当前字符串写在文件中：write
 * 7.不要忘记换行：newLine
 * 8.关闭流
 */
public class Demo03Reverse {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("练习2-表白信-之前.txt"));
		ArrayList<String> list = new ArrayList<>();
		
		String line;		//代表一行字符串
		while((line = br.readLine()) != null) {
			list.add(line);  // 将读取得到的一行字符串添加到集合当中
	 }
		br.close();  //关闭流
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("练习2-表白信-之后.txt"));
		for(int i = list.size() - 1; i >= 0 ; i--) {
			bw.write(list.get(i));
			bw.newLine();
		}
		bw.close();
	}
}
