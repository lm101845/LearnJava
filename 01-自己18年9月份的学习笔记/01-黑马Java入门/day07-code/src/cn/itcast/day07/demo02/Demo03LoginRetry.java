package cn.itcast.day07.demo02;

import java.util.Scanner;

/**
 * ���ߣ�����
 * ���ڣ� 2018��11��26�� 
 * ���ı�����1
 * 
 * �ڸղŵĵ�½���뵱�У������������εĹ���
 * 
 * ������
 * 1.�ظ����ε��߼���Ӧ��ʹ��ѭ��
 * 2.�����ظ�����ȷ����Ӧ��ʹ��forѭ��
 * 3.��Ҫ�ڴ����ʱ����ʾʣ����ٴε���ʾ
 * 4.����ɹ��ˣ���ô��ʾ��ӭ��Ϣ�������˳�ϵͳ
 * 5.���ʧ���ˣ���ô��ʾʣ����ٴΣ���������
 */
public class Demo03LoginRetry {
	
	public static void main(String[] args) {
		
		//������Ҫע���ʱ��ָ��һ����ȷ���û���������ȷ������
				String registUsername = "admin";     //ע��ʱ��ȷ���û���
				String registPassword = "123456";     //ע��ʱ��ȷ���û���
				
				
				for (int i = 1;i <= 3; i++) {
					Scanner sc = new Scanner(System.in);  
					
					System.out.println("�������û�����");
					String inputUsername = sc.next();
					
					System.out.println("���������룺");
					String inputPassword = sc.next();   
				
				
				if(inputUsername.equalsIgnoreCase(registUsername) && inputPassword.equals(registPassword) ) {
					System.out.println("��ӭʹ��!");
					//�����½�ɹ�����Ӧ����ѭ����Ӧ���˳�ѭ��
					break;
				}else { //�����½ʧ��
					//����һ���ǲ������һ��
					//��������һ�Σ���ô����ʾ���Դ����ľ�
					//����������һ�Σ���ô��ʾʣ�����
					if(i == 3) {
						System.out.println("��½ʧ�ܣ����Դ����ľ������ǵ��ŵİ�?���ݶ���");
					}else {
					System.out.println("��½ʧ�ܣ�ʣ�����"+(3-i)+ "�Σ�������");
				}
			}	
		}	
	}
}		

				
	


