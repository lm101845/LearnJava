package day03;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��23�� ����3:02:31
 * ���ı�����
 */
public class _break02 {
	public static void main(String[] args) {
		//Loop�Ǳ�ǩ��������ѭ�������ڲ��ѭ�����������ˡ�����Loop���Կ����ڲ�ѭ��������Loop�ȿ��Կ����ڲ�ѭ���ֿ��Կ������ѭ��
		Loop:for(int i=0;i<3;i++) {
			System.out.println("i="+i);
			for(int j=0;j<6;j++) {
				System.out.println("j+"+j);
				if(j==4) {
					break Loop;
				}
			}
		}
	}

}
