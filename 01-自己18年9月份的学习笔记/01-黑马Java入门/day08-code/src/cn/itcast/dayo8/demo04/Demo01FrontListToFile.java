package cn.itcast.dayo8.demo04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 作者：李明
 * 日期： 2018年12月1日 上午7:21:27
 * 看的遍数：1
 * 
 * 题目：
 * 定义一个集合用于存储多个字符串，向其中添加一些字符串
 * 然后将集合的所有字符串内容写到文件中。要求每个字符串独占一行
 * FrontListToFile：从集合到文件---把集合当中的字符串写到文件当中去
 * 
 * 步骤：
 * 1.定义一个集合，那就是创建ArrayList
 * 2.用来存储多个字符串，那么泛型就是<string>
 * 3.添加字符串到集合当中，那么就是调用方法:add
 * 4.既然需要写文件那么就用：FileWriter、BufferedWriter
 * 5.谁的性能更高：BufferedWriter
 * 6.集合当中的每一个字符串都要逐一处理：for循环遍历集合
 * 7.在循环当中将字符串写到文件里，调用write方法
 * 8.要求字符串独占一行，所以调用：netLine方法
 * 9.最后不要忘记关闭流
 */
public class Demo01FrontListToFile {
	
	public static void main(String[] args) throws IOException {
		
		ArrayList<String> list = new ArrayList<>();		//创建集合
		
		//加入字符串
		list.add("迪丽热巴");
		list.add("古力娜扎");
		list.add("马尔扎哈");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("练习1.txt"));  //放在一起写
		
		//遍历集合
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);   //当前字符串
			
			bw.write(str);
			bw.newLine();   //不要忘记换行
		}
		
		bw.close();  // 不要忘记关闭流
	}

}
