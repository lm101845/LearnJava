package cn.itcast.day09.demo04;
/**
 * ���ߣ�����
 * ���ڣ� 2018��12��1�� ����4:32:09
 * ���ı�����1
 * 
 * ����ʽ���˼�룺����Ҫ����ӿ�ʵ����
 */
public class Demo02CalcLambda {
	
	public static void main(String[] args) {
		method((a , b)-> a + b);
		
		//Lamdba���ʽ��(a , b)-> a + b
		//method������Ҫһ��Calculator�ӿ����͵Ĳ���
		//Lamdba���ʽ���ǳ䵱��Calculator�ӿ����͵Ĳ���
		//������⣺
		//1.Lamdba���ʽǰ���С���ţ���ʵ���ǽӿڳ��󷽷���С����
		//2.��ͷ��������С���ŵ�������ʲô���飬��һ��ָ��Ķ���
		//3.��ͷ��������õ��˲����Ժ���ʲô����
		//Lamdba���ʽ�����屾��ʹ�������ô��������飬û�ж���ĸ��������档�����Ӽ�ֱ�ۣ�
		
		
	}

public static void method(Calculator calculator) {
		
		int result = calculator.sum(10, 20);
		System.out.println("����ǣ�" + result);
		
	}
}
