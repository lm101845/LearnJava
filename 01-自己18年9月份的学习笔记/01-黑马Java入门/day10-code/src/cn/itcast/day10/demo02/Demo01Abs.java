package cn.itcast.day10.demo02;

/*
 * @���� ����
 * @���� 2018��11��4������5:18:36
 *
 * JDK�����Ѿ��������ṩ����һ��java.lang.Math�࣬������һ����̬����abs�Ϳ���ʵ�������ֵ�Ĺ���
 * ��ȻMath.abs�����Ѿ��������ֳɵ���������ô�Ҿ�û�б�Ҫ����Lambda�Լ�дһ����
 * �Ϳ���ͨ���������ã�ֱ���ù�����
 * 
 * ��ʽ��
 * �����ƣ�����̬������
 */
public class Demo01Abs {
	
	public static void main(String[] args) {
		method( num -> {
			int result;
			if(num >= 0) {
				result = num;
			}else {
				result = -num;
			}
			return result;
		});
		System.out.println("======================");
		
		//�������õ����壺Math�൱����һ��abs��̬�������Ѿ������ֳɵĹ��ܣ�ֱ���ù�����
		method(Math::abs);
		
	}
	
	public static void method(Calculator calculator) {
		int result = calculator.getAbs(-25);
		System.out.println("����ǣ�" + result);
	}

}
