package cn.itcast.day04.demo02;
/**
 * @����
 * @���� 2018��11��26�� 
 * ���ı�����1+1
 * 
 * ��η������鵱�е�Ԫ�أ�
 * 
 * ���ֱ�Ӵ�ӡ��������ƣ���ô�õ�����16�����ǵ�ֵַ����ϣֵ��
 * 
 * ��η������鵱�е�һ������Ԫ���أ���ʽ��
 * ��������[�������]
 * ������Ҳ�������鵱�еĶ��Ԫ�صı�ţ���0��ʼ��һֱ��������-1��Ϊֹ��
 * 
 * ��̬��ʼ����ʱ�����鵱�е�Ԫ�ض��ᱻ����һ��Ĭ��ֵ�����磺
 * �����������Ĭ�Ͼ���0������Ǹ�������Ĭ�Ͼ���0.0��������ַ���Ĭ�Ͼ���'\u0000'��Unicodeд����
 * ����ǲ���ֵ��Ĭ�Ͼ���false��0��;������ַ�����������������---���࣡��������ôĬ��null(�֣��ճ�����
 */
public class Demo02ArrayVisit {
	
	public static void main(String[] args) {
		
		int[]arrayA = new int[3];
		
		System.out.println(arrayA);		//��������	[I@7b1d7fff------���죡��������
		System.out.println(arrayA[0]);	//������ʵ�0��Ԫ��
		System.out.println(arrayA[1]);	//������ʵ�1��Ԫ��
		System.out.println(arrayA[2]);	//������ʵ�2��Ԫ��
		System.out.println("============================================");	
	
		
		double[] arrayB = new double[3];
		System.out.println(arrayB);		//�������ƣ���ӡ�õ���ֵַ��[D@299a06ac
		System.out.println(arrayB[0]);		//0.0
		System.out.println(arrayB[1]);		//0.0
		System.out.println(arrayB[2]);		//0.0
		System.out.println("============================================");	
		
		//�ı����鵱�еľ���Ԫ��
		arrayB[1] = 3.14;
		System.out.println(arrayB[0]);		//0.0
		System.out.println(arrayB[1]);		//3.14
		System.out.println(arrayB[2]);		//0.0
		
		double num = arrayB[1];
		System.out.println("num�������ǣ�"+ num);	//num�������ǣ�3.14

	}
	

}
