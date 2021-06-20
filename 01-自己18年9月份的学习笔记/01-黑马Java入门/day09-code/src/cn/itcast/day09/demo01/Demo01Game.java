package cn.itcast.day09.demo01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *  ���ߣ�����
  * ���ڣ� 2018��12��1�� ����3:47:56
  * ���ı�����1
  * 
 * ��չһ��С֪ʶ��
 * ��β��ܽ�һ���ַ�����100��ת����Ϊint����100?   ��ʽ��			��ϵexcel������ı�ת����
 * 
 * int Integer.parseInt(String str):�������ַ���������ֵ��int���֣����Խ��ַ���ת����Ϊint����
 * ������ǰ�᣺��������ַ�������ֻ�������֣���ʽ������int���֣� 
 */
public class Demo01Game {
	
	public static void main(String[] args) throws IOException {
		
		//1.���ȴ���һ�����ϣ������洢5��Ӣ��
		ArrayList<Hero> list = new ArrayList<>();
		
		//2.���ļ��������ݼӵ����ϵ���
		//System.out.println("TODO �����ļ������ݵ����ϵ���");
		//list.add(new Hero());   //�����Ѿ����ļ����м��صõ������ݣ����Ҽ��뵽������
		loadFileToList(list);
		
		//3.�ж�һЩ���ϵ�����û�����ݣ��ǲ����µģ�
		boolean isNew = list.size() == 0;  //������ϵĳ���Ϊ0.˵�������µĶ���
		System.out.println("���ǲ����¶���" + isNew);
		
		//������µĶ��飬û���ˣ�����Ҫ����5��������뵽������
		if(isNew) {
			//���÷������򼯺ϵ������5��Ӣ��
			addFiveHeros(list);
			//System.out.println("����5��������뵽������");
		}
		
		//������鲻���µģ��Ѿ������ˣ��Ͳ���Ҫ������
		
		System.out.println("���Ƕ���������ǣ�");
		//�������ϣ�������е�ÿһ������ľ�����Ϣ
		//System.out.println("ѭ��5�ν��б���");
		showHeros(list);
		
		//ͳ��һ���ܺ�ս�����Ƕ��١�
		int totalAttack = getTotalAttack(list);		//���ݼ��ϵ���������ܹ�����
		System.out.println("���Ƕ������ս�����ǣ�" + totalAttack);
		
		//�ж�һ�¼����ǲ����µ�
		if(isNew) {
			//System.out.println("�����ϵ����ݱ��浽�ļ���");
			saveToFile(list);   //���÷��������ϵ���Ϣд���ļ��С�
		}
		
		//������ϲ����µģ����Ǵ��ļ��м��صõ������ݣ���ʲôҲ������
		System.out.println("�˳���Ϸ");
	}
	
	/*
	 *����һ��������������ȡ�ļ�����������ӵ����ϵ��С���Ҫ�أ�
	 *����ֵ���ͣ������������������ͣ���ʽ�����Ĳ�����Ӱ��ʵ�ʲ���������void
	 *�������ƣ�loadFileList
	 *�����б�ArrayList<Hero> 
	 */
	public static void loadFileToList(ArrayList<Hero> list) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("friends.txt"));
		
		String line;  //����һ���ַ���
		while((line = br.readLine()) != null) {
			//��Ҫ���ַ���ת����Ϊhero����
			//���Ƚ�һ���������ַ����зֳ�Ϊ����С�ζ�
			String[] array = line.split("��");
			String name = array[0];  //����
			//���ַ���ת����Ϊ��Ӧ�Ļ�����������
			int attack =Integer.parseInt(array[1]) ;  //������
			String type = array[2];  //����
			
			//����������Ϣ����һ��Ӣ�۶���
			Hero hero = new Hero(name,attack, type);
			list.add(hero);  //��������ӵ����ϵ���
			
		}
		br.close();  //��Ҫ���ǹر���
	}
	
	/*
	 * ����һ�����������������ϵ��еĶ�������ȫ��д���ļ����Ҫ�أ�
	 * ����ֵ��void
	 * �������ƣ�saveToFile
	 * �����б�ArrayList<Hero>
	 */
	public static void saveToFile(ArrayList<Hero> list) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("friends.txt"));
		
		//�������ϣ�һ������һ������İ�����д
		for (int i = 0; i < list.size(); i++) {
			Hero hero =list.get(i);   //��ǰӢ��
			//��Ҫ��һ��Hero����ת����Ϊ�ַ�������������Ա����ƴ�ӳ�Ϊһ���ַ���
			//����200����
			//�������1400�̿�
			String str = hero.getName() + ","+ hero.getAttack() + ","+ hero.getType();
			//����Ӧ���ַ���д��������
			bw.write(str);
			bw.newLine();   //��Ҫ���ǻ���
		}
	    //���ر���
		bw.close();
	}
	
	/*
	 * ����һ���������������ݼ������ս������ֵ����Ҫ�أ�
	 * ����ֵ���ͣ�int,�������ܺ�
	 * �������ƣ�getTotalAttack
	 * �����б�ArrayList<Hero>
	 */
	public static int getTotalAttack(ArrayList<Hero> list) {
		int total = 0;  //�����ܹ�����
		for(int i = 0; i < list.size();i++) {
			Hero hero = list.get(i);
			//��ÿ��Ӣ�۵�ս����ȫ���ۼӵ�total����
			total += hero.getAttack();
		}
		return total;
		
	}
	
	/*
	 *����һ�������������������ϵ������ж������Ϣ����Ҫ�أ�
	 *����ֵ���ͣ�ֻ��������ӡ������ѣ�����ʹ��void
	 *�������ƣ�showHeros
	 *�����б�ArrayList<Hero>
	 * 
	 */
	public static void showHeros(ArrayList<Hero> list) {
		for (int i =0; i < list.size(); i++) {
			Hero hero = list.get(i);  //��ǰӢ��
			System.out.println("Ӣ�۵�����" + hero.getName() +",������" + hero.getAttack() + ",����" + hero.getType());
		}
	}
	
	/*
	 * ����һ�������������򼯺ϵ������5λӢ�ۡ���Ҫ�أ�
	 * ����ֵ���ͣ��������������ͣ���ʽ�����Ĳ�����Ӱ��ʵ�ʲ��������Բ���Ҫ����ֵ��void
	 * �������ƣ�addFiveHeros
	 * �����б�ArrayList<Hero>
	 */
	
	public static void addFiveHeros(ArrayList<Hero> list) {
		//Ӣ����Ϣ�����ڼ������� ��Scanner��
		Scanner sc = new Scanner(System.in);   //����һ��Scanner�������м�������
		
		for(int i =1;i <=5; i++) {   //ѭ��5��
			//��������Ӣ�۵�������Ϣ
			System.out.println("�������" + i + "λӢ�۵�����");
			String name = sc.next();    //��ȡ�ַ���
			
			System.out.println("�������" + i + "λӢ�۵Ĺ�����");
			int attack = sc.nextInt();   //��ȡint����
			
			System.out.println("�������" + i + "λӢ�۵�����");
			String type = sc.next();
					
			Hero hero = new Hero(name, attack, type);  //����һ��Ӣ�۶���
			list.add(hero);  //��Ӣ�۶�����ӵ����ϵ���
		}
		
		
	}
}
