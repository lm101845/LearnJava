package day03;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��23�� ����2:59:02
 * ���ı�����
 */
public class _break {
	public static void main(String[] args) {
		int i =1;
		while(i>0) {
			i++;
			System.out.println(i);
			
			if(i==10) {
				break;		//�����Ǹ���ѭ����Ū�˸�break�󣬾�Ӳ�������м������ˣ�����˻����
			}
		}
		System.out.println("������ֹ");
	}
}
