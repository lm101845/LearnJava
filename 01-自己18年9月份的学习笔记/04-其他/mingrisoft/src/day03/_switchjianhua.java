package day03;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��23�� ����12:31:05
 * ���ı�����
 */
public class _switchjianhua {
	public static void main(String[] args) {
		int grade = 4;
		System.out.println("�ɼ�Ϊ"+grade);
		switch(grade) {
			case 10:
			case 9:System.out.println("�ɼ�Ϊ��");break;
			case 8:System.out.println("�ɼ�Ϊ��");break;
			case 7:
			case 6:System.out.println("�ɼ�Ϊ��");break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:System.out.println("�ɼ�Ϊ��");break;
			default:System.out.println("�ɼ���Ч");
		}
	}
}
