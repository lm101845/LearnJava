package cn.itcast.dayo8.demo01;

import java.io.FileWriter;
import java.io.IOException;

/**
 * ���ߣ�����
 * ���ڣ� 2018��11��27�� ����7:01:01
 * ���ı�����1
 * 
 * ���������һ�ж������֣��ı��ļ�������ʵ����Ķ�������
 * �ܹ������ļ�ͼ�Σ�����Ϊ��������ǽ����˷��룬����Ĺ�����ǣ�
 * ASCII�����������һ�Ÿ���ı����Unicode���
 * ���߰�����ȫ��������������Ƶ�����
 * 
 * FileWriter�ṩ��һ��������ʽ��write����������ֱ�Ӹ�������д�ļ�
 * public void write(int ch):�������ǵ�����������Ӧ������ֵ
 */
public class Demo04FileWriterCharacter {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("file04.txt");
		
		fw.write("Hello");
		fw.write(20013);  //����"��"
		fw.write("��");
		
		fw.close();
	}
}
