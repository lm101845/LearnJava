package day04;

/**����
 * ���ߣ�����
 * ���ڣ� 2018��12��24�� ����8:14:04
 * ���ı�����
 */
public class _zifuxingshuzu {
	public static void main(String[] args) {
		char a[][] =new char[4][];
		
		a[0] = new char[] {'��','��','��','��','��'};		//��һ������5����
		a[1] = new char[] {'��','��','��','��','��'};		
		a[2] = new char[] {'ҹ','��','��','��','��'};		
		a[3] = new char[] {'��','��','֪','��','��'};		
		
		//������
		System.out.println("-----------������-----------------------------");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
			}
			if(i%2==0) {
				System.out.println("��");
			}else {
				System.out.println("��");
			}
		}
		
		//�������
		System.out.println("\n---------------�������------------------------------");
		for(int j=0;j<5;j++) {
			for(int i=3;i>=0;i--) {		//��ΪҪ�����������֣��������3
				System.out.print(a[i][j]);
			}	
			System.out.println();
		}
		System.out.println("��������");
	}

}
