package duoWeiShuZu;

import java.util.Arrays;

/**
 * @���� ����
 * @���� 2018��11��6������3:01:45
 * 
 * ð������
 */
public class MaoPaoPaiXu {
	public static void main(String[] args) {
		
		int[] values = {3,1,6,2,9,0,7,4,5,8};
		sort(values);
		System.out.println(Arrays.toString(values));
		
		//��ǿ��forѭ��--������������
		int[] a = {1,22,453,5,678,543,12};
		for(int i:a) {
			System.out.println(i);
		}
		
	}
	
	public static void sort (int[] values) {
		int temp;
		for(int i = 0; i < values.length; i++) {
			
			for(int j = 0; j < values.length-1-i; j++) {
				
				if(values[j] > values[j+1]) {
					
					//�������д�����������λ��
					temp = values[j];
					values[j] = values[j+1];
					values[j+1] =temp;
				}
			}
			
		}
	}

}
