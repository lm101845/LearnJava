package day05;

/**
 * ���ߣ�����
 * ���ڣ� 2018��12��25�� ����6:24:33
 * ���ı�����
 */
public class _zizifuchuan {
	public static void main(String[] args) {
		String str = "We are the world";
		int index = str.indexOf("e");  		//����e��һ�γ��ֵ�λ��
		int index01 = str.indexOf("e",3);   //����e������3֮����ֵ�λ��
		System.out.println(index);   //1
		System.out.println(index01);   //5
		
		//��ȡ������һ�γ��ֵ�����
		String str01 = "Let it go! Let it go!";
		int lastIndex = str01.lastIndexOf("t");
		System.out.println(lastIndex);   //16
		
		int lastIndex01 = str01.lastIndexOf("t",14);    //��14���������ǰ��
		System.out.println(lastIndex01);   //13
		
		
	}

}
