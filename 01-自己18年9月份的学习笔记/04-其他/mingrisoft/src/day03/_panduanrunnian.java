package day03;

import java.util.Scanner;

/**�ж����꣺����һ�򣬰��겻���İ�������
 * ���ߣ�����
 * ���ڣ� 2018��12��23�� ����11:13:47
 * ���ı�����
 */
public class _panduanrunnian {
	public static void main(String[] args) {
		int year = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ݣ�");
		year = sc.nextInt();
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println(year+"��������");	//2000
				}else {
					System.out.println(year+"�겻������");	//1900
				}
				
			}else {
				System.out.println(year+"��������");
			}
			
		}else {
			System.out.println(year+"�겻������");
		}
	}

}
