package cn.itcast.day07.demo02;

import java.util.Scanner;

/**
 * ���ߣ�����
 * ���ڣ� 2018��11��26�� 
 * ���ı�����1
 * 
 * ʹ��String���е�equals��equalsIgnoreCase������������ģ��һ���򵥵ĵ�½����
 * 
 * ������
 * 1.��½��Ҫ�û���������������Ϣ��Ҳ���������ַ���
 * 2.�û���������Ӧ��ʹ�ü������룬��ȡ�����ַ�����ʹ��Scanner��Ҫ�������裩
 * 3.���������ǵ�½�ɹ��أ��϶���Ҫע��ʱ��ǰд����ȷ���û�������ȷ������
 * 4.�ж�������û��������룬����ȷ���û��������������ȫһ����
 * 	A.�û���������ȷ
 * 	B.���������ȷ
 * 5.�ж�һ���Ƿ��½�ɹ�:if
 * 6.�����¼�ɹ�����ʾ��ӭ��Ϣ�������½ʧ�ܣ��˳�ϵͳ
 * 
 */
public class Demo02Login {
	
	public static void main(String[] args) {
		
		//������Ҫע���ʱ��ָ��һ����ȷ���û���������ȷ������
		String registUsername = "admin";     //ע��ʱ��ȷ���û���
		String registPassword = "123456";     //ע��ʱ��ȷ���û���
		
		//��Ҫ�������������ַ���
		Scanner sc = new Scanner(System.in);    //����
		
		System.out.println("�������û�����");
		String inputUsername = sc.next();
		
		System.out.println("���������룺");
		String inputPassword = sc.next();   //��ȡ��������������ַ���
		
		//�ж�һ�£���������
		//1.�û�����ȷ--�����ִ�Сд  ʹ��equaIsIgnoreCase
		//2.������ȷ--���ִ�Сд  equals
		//����������Ҫ���㣺&&
		if(inputUsername.equalsIgnoreCase(registUsername) && inputPassword.equals(registPassword) ) {
			System.out.println("��ӭʹ��!");
		}else {
			System.out.println("��½ʧ�ܣ��˳���");
		}
		
	}

}
