package cn.itcast.dayo8.demo01;

import java.io.FileWriter;
import java.io.IOException;
/**
 * ���ߣ�����
 * ���ڣ� 2018��11��27�� ����7:01:01
 * ���ı�����1
 * 
 * ��ʹ��FileWriter��ʱ��
 *1.���ָ�����ļ������ڣ���ô���Զ��������ļ�
 *2.���ָ�����ļ��Ѿ����ڣ���ô���Ḳ��д��
 *3.�����ϣ�����и���д�룬����ϣ������׷�ӣ���ôҪ������һ��������ʽ�Ĺ��췽����
 *public FileWriter(String filename, boolean append):�ڶ������������trueֵ����ô����׷��д��  
 */

public class Demo02FileWriter {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("file02.txt",true);  //��
		
		fw.write("World");  //д
		
		fw.close();  //��
	}

}
