package day04;

import java.util.Arrays;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��24�� ����9:09:36
 * ���ı�����
 */
public class _fuzhishuzu {
	public static void main(String[] args) {
		int a[] = new int[] {12,23,56,54,2,2};
		
		//int newArr[] = Arrays.copyOf(a,6);
		
		int newArr[] = Arrays.copyOfRange(a, 1, 4);   //ǰ�պ�
		
		for(int tmp:newArr) {
			System.out.println(tmp);
		}
	}

}
