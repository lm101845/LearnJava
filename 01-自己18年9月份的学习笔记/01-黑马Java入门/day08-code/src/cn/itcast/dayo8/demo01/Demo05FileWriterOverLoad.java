package cn.itcast.dayo8.demo01;

import java.io.FileWriter;
import java.io.IOException;

/**
 * ���ߣ�����
 * ���ڣ� 2018��11��27�� ����7:01:01
 * ���ı�����1
 * 
 * FileWriter����д���ݵķ���writer��5��������ʽ��
 * 
 * public void write(int ch)�������ǵ������ֶ�Ӧ�����֣��ο�ASCII������Unicode��
 * public void write(String str):дһ���������ַ���
 * public void write(String str�� int offset, int count):д�ַ������е�һ����
 * public void write(char[] array):дһ���������ַ�����
 * public void write(char[] array �� int offset, int count):д�ַ����鵱�е�һ����
 * 
 * 
 */
public class Demo05FileWriterOverLoad {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("file05.txt");
		
		//д�����ַ�
		fw.write(65);  //A
		fw.write(66);  //B
		fw.write(67);  //C
		fw.write(48);  //0
		fw.write(97);  //a
		//============================
		
		//дһ���������ַ���
		fw.write("Hello");
		fw.write("World\r\n");
		//============================
		
		//дһ���ַ������еĲ�������
		String str = "��ǰ�αؾ�˯�������Ի᳤�ߡ�";
		fw.write(str,7,6);  //�����Ի᳤��
		//============================
		
		//дһ���������ַ�����
		char[] array = {'j' , 'a' , 'v' , 'a' , '!' };
		fw.write(array);
		
		//дһ���ַ�����Ĳ�������
		fw.write(array,1,3);
		
		fw.close();
		
		
	}

}
