package day04;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��24�� ����7:37:01
 * ���ı�����
 */
public class _shuzumax {
	public static void main(String[] args) {
		//����Ԫ�ز�����С��
		int a[] = {1,233,46,32,56,12,97,66,7};
		int max = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}
}
