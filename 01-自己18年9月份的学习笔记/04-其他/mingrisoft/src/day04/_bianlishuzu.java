package day04;

/**��α�������-˫��forѭ������foreachѭ��
 * ���ߣ�����
 * ���ڣ� 2018��12��24�� ����8:36:43
 * ���ı�����
 */
public class _bianlishuzu {
	public static void main(String[] args) {
		int a[][] = new int[][] {{1},{2,3},{4,5,6}};	//���һ��������Ķ�ά����
		
		//˫forѭ��
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
		}
		System.out.println();
	    }
		
		
		//˫foreachѭ��
		for(int i[]:a) {		//��������Ԫ����ȡ����
			for(int j:i) {		//������������Ԫ����ȡ����
				System.out.print(j);
			}
			System.out.println();
		}
	}
}