package day05;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��25�� ����9:56:33
 * ���ı�����
 */
public class _quchukongge {
	public static void main(String[] args) {
		String str = "     	a b       d  k  d			";
		//System.out.println(str);
		System.out.println("["+str.trim()+"]");    //trimֻ��ȥ����β�Ŀո�
		
		//ȥ�����пո�
		String str01 = "    a	b	c		d			e	f	g";
		String strshort = str01.replaceAll("\\s", "");     //\\s��ʾ���пո�
		System.out.println("["+strshort +"]");
	}

}
