package day04;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��24�� ����9:21:57
 * ���ı�����
 */
public class _maopaopaixun {
	public static void main(String[] args) {
		int a[] = {1,4,3,6,7,4};
		
		for(int i=1;i<a.length;i++) {		//6��Ԫ��ֻҪ�Ƚ�5�־����ˣ�����i��1��ʼ
			for(int j=0;j<a.length-i;j++) {
				if(a[j]>a[j+1]) {		//��ǰ���ҵ�Ԫ�ر��Һ����Ԫ�ش��򽻻�   ����������������������С������
					int tmp = a[j];
					a[j]=a[j+1];
					a[j+1]=tmp; 
				}
			}
		}
		System.out.println("ð������Ľ��:");
		for(int tmp:a) {
			System.out.print(tmp+" ");
		}
	}
}
