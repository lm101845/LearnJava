package day04;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��24�� ����10:22:58
 * ���ı�����
 */
public class _sanweishuzu {
	public static void main(String[] args) {
		int a[][][] = new int[2][3][4];
		
		//��ͨ������ѭ�������������и�ֵ
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					a[i][j][k] = i+j+k;
					
				}
			}
		}
		//��ͨ������ѭ�������������б���
		for(int i=0;i<a.length;i++) {
			System.out.println("---------------���ǵ�"+i+"��---------------------------------------");
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
		}
	}

}
