package cn.itcast.day04.demo02;
/**
 *  @����
 * @���� 2018��11��26�� 
 * ���ı�����1+1
 * 
 * �����ڳ�ʼ����ʱ�򣬻�����һ�ַ�ʽ����̬��ʼ����
 * 
 * ��̬��ʼ������ֱ��ָ�����ȣ�����ֱ��ָ�������Ԫ������
 * 
 * ��׼��ʽ��
 * ��������[] �������� = new ��������[]{Ԫ��1,Ԫ��2,Ԫ��3,...}
 * 
 * ��׼��ʽҲ���Բ�ֳ��������裺
 * ��������[] �������ƣ�
 * ��������= new ��������[]{...}
 * 
 * ����ʽ��
 * ��������[] �������� ={Ԫ��1,Ԫ��2,Ԫ��3...}
 * һ��ʹ���˼���ʽ������һ��������ɳ�ʼ�������ܲ�ֳ�Ϊ2������
 * 
 * ע�����
 * 1.��Ȼ��̬��ʼ��û��ָ�����ȣ�������Ȼ���Ը��ݾ���Ԫ�صĸ����Զ������������
 * 2.��Ȼ����ʽ���п��Բ�дnew,������Ȼ���ڴ浱�п��ٿռ�Ĺ��̡�-----��Ҫ������
 * 3.��Ȼֱ��ָ���˾���Ԫ�����ݣ�������Ȼ����Ĭ��ֵ���滻�Ĺ���
  */


public class Demo03ArrayStatic {
	
	public static void main(String[] args) {
		
		//��̬��ʼ��
		int[] arrayA = new int[3];
		arrayA[0] = 10;
		arrayA[1] = 20;
		arrayA[2] = 30;
		System.out.println(arrayA[0]);    //10;
		System.out.println(arrayA[1]);    //20;
		System.out.println(arrayA[2]);    //30;
		System.out.println("=======================================");  
		
				
		//��̬��ʼ����һ������
		int[] arrayB = new int[] {15,25,35};
		System.out.println(arrayB);    //��ֵַ[I@7b1d7fff
		System.out.println(arrayB[0]);    //15
		System.out.println(arrayB[1]);    //25
		System.out.println(arrayB[2]);    //35
		System.out.println("=======================================");  
		
		//����ʽ������ʹ��һ������һ����λ
		int[]arrayD = {16,26,36};
		System.out.println(arrayD[0]);    //16
		System.out.println(arrayD[1]);    //26
		System.out.println(arrayD[2]);    //36
		
		//����д��������ʽ�ľ�̬��ʼ�����ܲ�ֳ�Ϊ�������裡
		//int[] arrayE;
		//arrayE = {1,2,3}

}
	}
