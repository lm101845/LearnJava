package cn.itcast.dayo8.demo01;

import java.io.FileWriter;
import java.io.IOException;

/**
 * ���ߣ�����
 * ���ڣ� 2018��11��27�� ����7:01:01
 * ���ı�����1
 * 
 * ��β���ʵ�ֻ��е�Ч����
 * ������ʵҲ��һ���ַ�������"���з�"��
 * 
 * Windows���еĻ��з��ǣ�\r\n  ����������ַ���һ����\r , һ����\n
 * MacOS���еĻ��з���������\r , ������\n
 * Linux���еĻ��з��ǣ�\n
 */
public class Demo03FileWriterLine {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("file03.txt");
		fw.write("�����Ȱ�\r\n");
		fw.write("\r\n");    //����һ��windows���еĻ��з�
		fw.write("��������");
		
		fw.close();
		
	}

}
