package day02;

/**����ֵ����ȷ
 * ���ߣ�����
 * ���ڣ� 2018��12��17�� ����11:19:34
 * ���ı�����
 */
public class _jingsizhibujingzhun {

	public static void main(String[] args) {
		double a = 4.35*100;
		System.out.println(a); 	//434.99999999999994,����435
		
		//����������������뷨 Math.round()
		System.out.println(Math.round(a));  //435
		
		double b = 0.1;
		double c = 2.0-1.9;
		System.out.println(b);		//0.1
		System.out.println(c);  	//0.10000000000000009
		System.out.println(b==c);   //false
		
		//�����������С���Աȷ�Math.abs()����С��"1e-6"��Ƚϣ�1e-6��������С����������������С������Ϊ0��
		System.out.println(Math.abs(b-c)<1e-6);		//true
		
	}

}
