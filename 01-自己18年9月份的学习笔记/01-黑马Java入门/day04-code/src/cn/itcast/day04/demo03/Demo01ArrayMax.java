package cn.itcast.day04.demo03;

/**
 * @����
 * @���� 2018��11��26�� 
 * ���ı�����1+1
 * 
 * ������鵱�е����ֵ
 */
public class Demo01ArrayMax {
	
	public static void main(String[] args) {
		
		//�������׵ĸ�λѡ��
		int[] array = {5 ,10, 15, 40, 30, 10000};
		
		//׼��һ����̨,��0��Ԫ��ս���������ϳ�
		int max = array[0];
		
		//������Ҫ��ÿһ��Ԫ����һ�����������д���
		//�ظ��Ĺ��̣�Ӧ��ʹ��ѭ������ʲôѭ����
		//����ȷ����ʹ��forѭ��
		for (int i=1;i< array.length; i++) {
			
			//�õ�ǰѡ��array[i]��̨�ϵ�max���бȽ�
			if (array[i] > max) {
				max = array[i];		//����
			}
		}
		System.out.println("���ֵ��" + max);
	}

}
