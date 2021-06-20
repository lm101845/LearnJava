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
 * BufferedReader��FileReader��࣬Ҳ��������ȡ�ļ���������һ���ַ�������
 * ��������BufferedReader������Ҳ��һ��8192���ȵ�char[] �ַ����飬����������ʹ��
 * �ڶ�ȡ���ݵ�ʱ��һ���Դ�Ӳ�̵��ж�ȡ���8192���ַ����������黺��������
 * �ڵ���read������ʱ��ֻ�Ǵӻ����������ó����ַ�����ʹ��
 * 
 * ������������е��ַ�����ȡ�ա�����ô�����Զ��ٴζ�ȡ8192���ٴη��ڻ���������
 * 
 * ���ʹ�� BufferedReader?
 * 1.���ȴ���һ����ͨ��FileReader
 * 2.�������ͨ��FileReader��װ��Ϊ����� BufferedReader�����췽����
 * 3.ʹ����������ͨ��FileReader����û������
 * 
 * ���췽����
 * public  BufferedReader(FileReader fr):��������һ����ͨ��FileReader����
 */
public class Demo03BufferedReader {
	
	public static void main(String[] args) throws IOException {
		
		//���ȴ���һ����ͨ��FileReader
		FileReader fr = new FileReader("file10.txt");
		
		//�����װ��Ϊ�����BufferedReader
		BufferedReader br = new BufferedReader(fr);
		
		//��ȡ�����ַ�����ʵ���Ǵ�8192�Ļ���������ȡ�������ַ���
		/*int ch;
		while((ch = br.read()) != -1) {
			System.out.println((char)ch);
			
		}
		*/
		
		//��ȡ�ַ����飨��ʵ���Ǵ�8192�Ļ���������һ����ȡ������ַ�ʹ�ã�
		char[] buff = new char[2];  //һ��ȡ2��
		int len;
		while((len = br.read(buff)) != -1) {
			String str = new String(buff,0,len);
			System.out.println(str);
		}
		br.close();    //�ر�
	}
}
