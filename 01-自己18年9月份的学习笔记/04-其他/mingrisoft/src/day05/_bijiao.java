package day05;

/**String   StringBuffer StringBuilder���߱Ƚ�
 * ���ߣ�����
 * ���ڣ� 2018��12��26�� ����7:36:30
 * ���ı�����
 */
public class _bijiao {
	public static void main(String[] args) {
		//String
		String str = "";
		long startTime = System.currentTimeMillis();		//��ȡʱ��
		for(int i=0;i<10000;i++) {
			str =str+i;
		}
		long endTime =System.currentTimeMillis();
		long time = endTime-startTime;
		System.out.println("String���ĵ�ʱ�䣺"+time);
		
		//StringBuffer
		StringBuffer sbf = new StringBuffer();
		 startTime = System.currentTimeMillis();		//��ȡʱ��
		for(int i=0;i<10000;i++) {
			sbf.append(i);
		}
		 endTime =System.currentTimeMillis();
		 time = endTime-startTime;
		System.out.println("StringBuffer���ĵ�ʱ�䣺"+time);
		
		//StringBuilder
		StringBuilder sbd = new StringBuilder();
		 startTime = System.currentTimeMillis();		//��ȡʱ��
		for(int i=0;i<10000;i++) {
			sbd.append(i);
		}
		 endTime =System.currentTimeMillis();
		 time = endTime-startTime;
		System.out.println("StringBuilder���ĵ�ʱ�䣺"+time);
	}

}
