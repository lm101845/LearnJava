package cn.itcast.day04.demo03;

/**
 * @����
 * @���� 2018��11��26�� 
 * ���ı�����1+1
 * 
 * ������鵱�е���Сֵ
 * ͳһ����ĸ��Alt +Shift +R
 */
public class Demo02ArrayMin {
	
	public static void main(String[] args) {
		
		//�������׵ĸ�λѡ��
		int[] array = {5 ,10, 15, 40, 30, 10000, -200 };
		
		//׼��һ����̨,��0��Ԫ��ս���������ϳ�
		int min = array[0];
		
		//������Ҫ��ÿһ��Ԫ����һ�����������д���
		//�ظ��Ĺ��̣�Ӧ��ʹ��ѭ������ʲôѭ����
		//����ȷ����ʹ��forѭ��
		for (int i=1;i< array.length; i++) {
			
			//�õ�ǰѡ��array[i]��̨�ϵ�min���бȽ�
			if (array[i] < min) {
				min = array[i];		//����
			}
		}
		System.out.println("��Сֵ��" + min);
	}

}
