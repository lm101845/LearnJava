package cn.itcast.dayo8.demo03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��1�� ����7:21:27
 * ���ı�����1
 * 
 * BufferedReader�����ṩ��һ�����������Զ�ȡһ�����ַ���
 * public String readLine(): ��ȡһ�����ַ���������ֵ���в��������з�
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
		String line;   //����һ���ַ���
		while ((line = br.readLine()) != null) {
			System.out.println(line);    //�����дln,���д��һ��ȥ��
		}
		
		 br.close();
	}
}
