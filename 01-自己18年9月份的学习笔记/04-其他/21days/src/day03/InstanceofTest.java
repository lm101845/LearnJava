package day03;
/*
 * 1.instanceof�������ǰһ��������ͨ����һ���������ͱ�������һ��������ͨ����һ����
 * ��Ҳ�����ǽӿڣ����԰ѽӿ�����һ��������ࣩ���������ж�ǰ��Ķ����Ƿ��Ǻ�����࣬
 * ���������ࡢʵ�����ʵ��������ǣ��򷵻�true�����򷵻�false��
2.��ʹ��instanceof�����ʱ��Ҫע�⣺instanceof�����ǰ��������ı���ʱ����Ҫô����������ͬ��
Ҫô����������и��Ӽ̳й�ϵ�����������������

 */
class BaseClass{}
class SubClass extends BaseClass{}
 
public class InstanceofTest
{
	public static void main(String[] args)
	{
		//����helloʱʹ��Object�࣬��hello�ı���������Object
		//Object��������ĸ��࣬��hello������ʵ��������String
		Object hello = "Hello";
		System.out.println("�ַ����Ƿ���Object���ʵ��:"+(hello instanceof Object));
		System.out.println("�ַ����Ƿ���String���ʵ��:"+(hello instanceof String));
		System.out.println("�ַ����Ƿ���Math���ʵ��:"+(hello instanceof Math));
		System.out.println("�ַ����Ƿ���Comparable�ӿڵ�ʵ��:"+(hello instanceof Comparable));
		String a = "hello";
		//System.out.println("�ַ����Ƿ���Object���ʵ��:"+(a instanceof Math));
 
		BaseClass b = new BaseClass();
		SubClass aa = new SubClass();
		System.out.println(aa instanceof BaseClass);
	}
}
