package day04;

import java.util.Arrays;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��24�� ����10:18:08
 * ���ı�����
 */
public class _sortfangfa {
	public static void main(String[] args) {
		int a[] = new int[] {1,5,7,2,1};
		
		Arrays.sort(a);		//sort��������ֱ�����򣬵���ֻ������
		for(int tmp:a) {
			System.out.print(tmp+" ");
		}
	}

}
