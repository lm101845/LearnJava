package day05;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��25�� ����9:38:08
 * ���ı�����
 */
public class _zifuchuanfenge {
	public static void main(String[] args) {
		String str = "abc,def,ghi";
		String strarray[]= str.split(",");    //[������]
		for(int i=0;i<strarray.length;i++) {
			System.out.println(strarray[i]);
		}
		
		//�޶��ָ����
		String str01 = "192.168.0.1";
		String strarray01[] = str01.split("\\.");
		String strarray02[] = str01.split("\\.",2);
		for(int j=0;j<strarray01.length;j++) {
			System.out.print("["+strarray01[j]+"]");
		}
		System.out.println();
		
		for(int j=0;j<strarray02.length;j++) {
			System.out.print("["+strarray02[j]+"]");
		}
		
	}

}
