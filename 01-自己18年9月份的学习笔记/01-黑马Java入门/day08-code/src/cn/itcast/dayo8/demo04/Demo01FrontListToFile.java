package cn.itcast.dayo8.demo04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��1�� ����7:21:27
 * ���ı�����1
 * 
 * ��Ŀ��
 * ����һ���������ڴ洢����ַ��������������һЩ�ַ���
 * Ȼ�󽫼��ϵ������ַ�������д���ļ��С�Ҫ��ÿ���ַ�����ռһ��
 * FrontListToFile���Ӽ��ϵ��ļ�---�Ѽ��ϵ��е��ַ���д���ļ�����ȥ
 * 
 * ���裺
 * 1.����һ�����ϣ��Ǿ��Ǵ���ArrayList
 * 2.�����洢����ַ�������ô���;���<string>
 * 3.����ַ��������ϵ��У���ô���ǵ��÷���:add
 * 4.��Ȼ��Ҫд�ļ���ô���ã�FileWriter��BufferedWriter
 * 5.˭�����ܸ��ߣ�BufferedWriter
 * 6.���ϵ��е�ÿһ���ַ�����Ҫ��һ����forѭ����������
 * 7.��ѭ�����н��ַ���д���ļ������write����
 * 8.Ҫ���ַ�����ռһ�У����Ե��ã�netLine����
 * 9.���Ҫ���ǹر���
 */
public class Demo01FrontListToFile {
	
	public static void main(String[] args) throws IOException {
		
		ArrayList<String> list = new ArrayList<>();		//��������
		
		//�����ַ���
		list.add("�����Ȱ�");
		list.add("��������");
		list.add("�������");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("��ϰ1.txt"));  //����һ��д
		
		//��������
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);   //��ǰ�ַ���
			
			bw.write(str);
			bw.newLine();   //��Ҫ���ǻ���
		}
		
		bw.close();  // ��Ҫ���ǹر���
	}

}
