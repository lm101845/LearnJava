package cn.itcast.dayo8.demo03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��1�� ����7:21:27
 * ���ı�����1
 * 
 * BuffererWriter��FileWriter��࣬Ҳ��һ������д�ļ����࣬�����ַ������
 * ��������BuffererWriter��������һ������Ϊ8192��[]�ַ����飬����������ʹ��
 * ÿ����д���ݵ�ʱ��ʵ���϶����ڲ��ϵ��򻺳����鵱������ַ�
 * ������������Ѿ����ˣ���ô����ͳһ��д��Ӳ�̵��ļ�����
 * �����û��д������ô�͵ȴ���һ��д��
 * ������չر�����ʱ��������Ȼû������ôҲ�Ὣʣ�����Ч����д��Ӳ���ļ���
 * 
 * ���ʹ��BuffererWriter��
 * 1.���ȴ���һ����ͨ��FileWriter
 * 2.�������ͨ��FileWriter��װ��Ϊ�����BuffererWriter���ù��췽��
 * 3.����BuffererWriterʹ�õķ�����FileWriter����һ��
 * 
 * ���췽����
 * public FileWriter(FileWriter fw):��������һ����ͨ��FileWriter����
 */
public class Demo01BuffereredWriter {
	
	public static void main(String[] args) throws IOException {
		
		//���ȴ���һ����ͨ��FileWriter
		FileWriter fw = new FileWriter("file08.txt");
		
		//�������ͨ��FileWriter���󴫵ݸ�BuffererWriter���췽������
		BufferedWriter bw = new BufferedWriter(fw);			//�����Ҫ�ٿ�һ��API�ĵ�
		
		//����bw��ʹ�ã���fw����û������
		bw.write("Hello");
		
		//�ر���
		bw.close();
		
	}
}
