package day03;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��23�� ����3:28:14
 * ���ı�����
 */
public class _continuejiabiaoqian {
	public static void main(String[] args) {
		Loop:for(int i=0;i<=2;i++) {
			System.out.println("i="+i);
			for(int j=0;j<=10;j++) {
				if(j==2) {
					continue Loop;
				}
				System.out.println("j="+j);
			}
		}
	}

}
