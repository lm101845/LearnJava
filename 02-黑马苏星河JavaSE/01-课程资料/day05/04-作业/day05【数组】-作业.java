��һ�⣺��ϰ���յĴ���

�ڶ��⣺������������ʵ��
	1.������˵������벻Ҫ��ǰ����
	public class Test03_01 {
		public static void main(String[] args) {
			int[] arr1 = {1,2,3,4,5};
			int[] temp1 = arr1;
			int[] temp2 = arr1;
			System.out.println("ͨ��temp1ȡ������ֵ: ");
			
			for(int i = 0;i<temp1.length;i++) {
				System.out.print(temp1[i]+" ");
			}
			System.out.println();
			System.out.println("ͨ��temp2ȡ������ֵ: ");
			for(int i = 0;i<temp2.length;i++) {
				System.out.print(temp2[i]+" ");
			}
			System.out.println();
			temp1[2] = 9;
			
			System.out.println("ͨ��temp1ȡ������ֵ: ");
			for(int i = 0;i<temp1.length;i++) {
				System.out.print(temp1[i]+" ");
			}
			System.out.println();
			System.out.println("ͨ��temp2ȡ������ֵ: ");
			for(int i = 0;i<temp2.length;i++) {
				System.out.print(temp2[i]+" ");
			}
			System.out.println();
			
		}
	}

�����⣺������������ʵ��
	1.������˵������벻Ҫ��ǰ����
	public class Test03_02 {
		public static void main(String[] args) {
			int[] arr1 = {1,2,3,4,5};
			int[] arr2 = {5,6,7};
			int[] temp = arr1;
			
			System.out.println("ͨ��tempȡ��arr1�е�Ԫ��: ");
			
			for(int i = 0;i<temp.length;i++) {
				System.out.print(temp[i]+" ");
			}
			
			temp = arr2;
			
			System.out.println("ͨ��tempȡ��arr2�е�Ԫ��: ");
			
			for(int i = 0;i<temp.length;i++) {
				System.out.print(temp[i]+" ");
			}
		}
	}

�����⣺������������ʵ��
	1.����һ�����ڴ�Ű༶����������
		int[] score = {80,90,85,90,78,88,89,93,98,75};
	2.����༶����������(��������60�ֵľ��ǲ�����)
	3.����༶��ƽ����
	4.����༶���ܷ���