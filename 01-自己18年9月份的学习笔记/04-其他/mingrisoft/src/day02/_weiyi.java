package day02;

/**λ�������
 * ���ߣ�����
 * ���ڣ� 2018��12��18�� ����5:20:29
 * ���ı�����
 */
public class _weiyi {

	public static void main(String[] args) {
		
		//int������4λ��һ��32���ֽ�
		int a = 24;
		System.out.println(a+"������λ�����"+(a>>2));	//6; 24/2/2=6
		
		int b = -16;
		System.out.println(b+"������λ���"+(b<<3));	//-128;  
		
		int c = -256;
		System.out.println(c+"�޷������ƽ��"+(c>>>2));	 //1073741760; ����λ��1�����0
		
		byte d = (byte)(-32>>1);
		System.out.println(d); 		//-16
		
		short e = (short)(-128>>4);
		System.out.println(e);     //-8
		
		/*
		 * Ϊʲôbyte,short�޷������Ƶ����㾹Ȼ�õ�����������������Ϊʲô���Ӷ�����ʵ�ֵĻ�����˵��byte��short���ڵ;��ȵ����ͣ�
		 * �����������ʺ����޷������ƣ�����������������������ǻ������
		 */
		
		
		

	}

}
