package cn.itcast.dayo8.demo02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��1�� ����7:00:08
 * ���ı�����1
 * 
 * �����ȡ�ַ���һ��һ���ģ���ôЧ�ʺܵ�
 * Ϊ�����Ч�ʣ�FileReader�ṩ������һ��������ʽ�ķ�����
 * 
 * public int read(char[] buf): һ�ζ�ȡ�����ַ����������
 * ������һ���ַ����飬�������ض�ȡ���Ķ���ַ�
 * ����ֵ����������鵱�ж�ȡ������Ч����
 */
public class Demo03FileReaderArray {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("file07.txt");
		
		char[] buf = new char[2];   //����һ��һ���Կ���װ�����ַ��ĳ���������(buf)
		
		int len = fr.read(buf);		//��һ�ж���̫���Ķ��ˣ�һ���ӳ�������������
		System.out.println("len=" + len);  //2
		
		String str = new String(buf,0,len);   //�����ַ�����������һ���ַ���
		System.out.println("str=" + str);  //he
		
		     len = fr.read(buf);			//lenǰ�治�ܼ�int��
			 System.out.println("len=" + len);  //2
			
		     str = new String(buf,0,len);   //�����ַ�����������һ���ַ���
			 System.out.println("str=" + str);  //ll
			
			 len = fr.read(buf);
		     System.out.println("len=" + len);  //1
			 str = new String(buf,0,len);   //ʹ���ַ����鵱�еġ���Ч�������������ַ���
			 System.out.println("str=" + str);  //o
			 
			 len = fr.read(buf);
		     System.out.println("len=" + len);  //-1������û�и�������
		     
		     len = fr.read(buf);
		     System.out.println("len=" + len);  //-1������û�и�������
		
		fr.close();
	}

}
