package day03;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��23�� ����11:06:41
 * ���ı�����
 */
public class _duoifyuju {
	public static void main(String[] args) {
		int balance = 5;
		System.out.println("��ǰ���"+balance+"��Ԫ");
		if(balance>=500) {
			System.out.println("����������");
		}else if(balance<500&&balance>=200) {
			System.out.println("����");
		}else if(balance>=50&&balance<200) {
			System.out.println("�򱼳�");
		}else {
			System.out.println("�����г�");
		}
			
	}

}
