package cn.itcast.dayo8.demo01;

import java.io.FileWriter;
import java.io.IOException;

/**
 * ���ߣ����� 
 * ���ڣ� 2018��11��26�� ����7:13:57 
 * ���ı�����1
 * 
 * ���ϣ��������д�����ı��ļ����У���ô����ʹ��FileWriter��
 * 
 * 1.����
 * import java.io.FileWriter
 * 
 * 2.���������췽��(������)
 * public FileWriter(String fileName):�����ַ��������ļ���·�����ơ�
 * FileWriter fw = new FileWriter("file01.txt");
 * �ļ���չ��ֻ�ܾ���Ĭ����ʲô������ļ������ܾ���������
 * 
 * 
 * 3.ʹ�ã���Ա����
 * д���ݣ�public void write(String str):����������Ҫд���ļ��е��ַ���
 * �ر�����public void close():�رգ��ͷ������Դ
 * 
 * �ܽ�һ�£�FileWriter����ʹ�ò��裺����д����
 * 
 * ע������
 * 1.ǧ��Ҫ����������close�������йر�
 * 2.������ʱ�������ʾ�������쳣����ô�������ͣ��Ȼ����Add throws...����
 * 
 */
public class Demo01FileWriter {
	
	public static void main(String[] args) throws IOException {
		
		//1.����һ��FileWriter����
		FileWriter fw = new FileWriter("file01.txt");
		
		//2.����write����д����
		fw.write("Hello,World");
		
		//3.����close�����ر���
		fw.close();
	}
	

}
