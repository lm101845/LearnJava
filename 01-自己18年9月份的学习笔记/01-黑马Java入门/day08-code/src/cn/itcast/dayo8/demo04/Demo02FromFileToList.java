package cn.itcast.dayo8.demo04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
  * ���ߣ�����
  * ���ڣ� 2018��12��1�� ����3:47:56
  * ���ı�����1
 * 
 * ��Ŀ��
 * ����һ���෴�����ļ��е��ַ����ı���ȡ�����ϵ���ȥ������ÿһ���ı���Ϊ�����е�һ���ַ���Ԫ��
 
 * ���裺
 * 1.��Ҫ��ȡ�ļ�����ô����ʹ��:FileReader��BufferedReader
 * 2.Ϊ�����ܸ��ߣ������˭��BufferedReader
 * 3.��Ҫ��ȡһ���У���ô���ã�readLine��������ֻ��BufferedReader���У�
 * 4.��Ҫ��һ����������Ŷ�ȡ�������ַ�����ArrayList<String>
 * 5.��ȡһ�У�readLine
 * 6.���������ַ�����ӵ����ϵ��У�add
 * 7.����4-6������һ��ѭ���Ĺ��̣���ȡ��null��Ҫֹͣ
 * 8.�ر���
 * 9.�������ϣ��鿴�����ַ���Ԫ�ص�����
 * 
 */
public class Demo02FromFileToList {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("��ϰ1.txt"));
		ArrayList<String> list = new ArrayList<>();
		
		String line;		//����һ���ַ���
		while((line = br.readLine()) != null) {
			list.add(line);  // ����ȡ�õ���һ���ַ�����ӵ����ϵ���
			
		}
		
		br.close();  //�ر���
		
		for(int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
		}
	}
}
