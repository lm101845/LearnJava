package cn.itcast.dayo8.demo05;
/**
 *  ���ߣ�����
  * ���ڣ� 2018��12��1�� ����3:47:56
  * ���ı�����1
 * 
 * �����Ĳ���������ʲô���ͣ�
 * 1.��������
 * 2.����
 * 3.�ַ���
 * 4.�Զ������
 * 
 * ���ۣ����е��������Ͷ�������Ϊ�����Ĳ�������
 * 
 */
public class Demo01MethodParam {
	
	public static void main(String[] args) {
		
		method1(100);
		System.out.println("===============================");
		
		int[] arr = {10, 20, 30};
		method2(arr);			//����arr������Ǹ���ֵַ
		System.out.println("===============================");
		
		method3("how do you do?");
		System.out.println("===============================");
		
		Student xuesheng = new Student("����ӱ" ,20);
		method4(xuesheng);
	}
	
	//ʹ�û���������Ϊ�����Ĳ���������
	public static void method1(int num) {
		num += 20;
		System.out.println(num);
		System.out.println("================================");
	}
	
	//ʹ��������Ϊ�����Ĳ�����Ҳ����
	public static void method2(int[] array) {
		System.out.println(array[0]);   //10
		System.out.println(array[1]);	//20
		System.out.println(array[2]);	//30
		System.out.println("================================");
	}
	
	//ʹ���ַ�����Ϊ�����Ĳ�����������
	public static void method3(String str) {
		String result = str.replace("o", "*");
		System.out.println(result);    //h*w d* y*u d*?

	}
	
	//ʹ���Զ��������Ϊ�����Ĳ�������������
	public static void method4(Student stu) {
		System.out.println("����: " + stu.getName() + ",����:" + stu.getAge());
		
	}
}
