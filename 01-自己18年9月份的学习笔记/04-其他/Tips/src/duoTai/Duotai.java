package duoTai;
/**
 * @���� ����
 * @���� 2018��11��5������7:19:34
 * 
 * ��̬������

�����һ������ʱ��ͨ��ϣ���÷����߱�����ͨ���ԡ� ����Ҫʵ��һ������еķ���������ÿ�ֶ���Ľ����ǲ�ͬ�ģ�
��˿����ڷ����н���һ���������͵Ĳ�����������è�����ʱ�ͷ���è��Ľ���������Ȯ�����ʱ�ͷ���Ȯ��Ľ�����
��ͬһ�������У��������ڲ������Ͳ�ͬ������ִ��Ч�������������Ƕ�̬��

��Java��Ϊ��ʵ�ֶ�̬������ʹ��һ���������͵ı���������һ���������͵Ķ��󣬸��ݱ�����������������Ĳ�ͬ��
�õ���ͬ�����н����

 */
abstract class Animal {
	public abstract void shout(); // �������shout()����
}

//����Cat��̳�Animal
class Cat extends Animal {
	// ʵ��shout()����
	public void shout() {
		System.out.println("����...");

	}
}

//����Dog��̳�Animal
class Dog extends Animal {
	// ʵ��shout()����
	public void shout() {
		System.out.println("����...");

	}
}


public class Duotai {
	public static void main(String[] args) {
		Animal cat = new Cat();     //��Cat������Animal������ʹ��
		Animal dog = new Dog();		//��Dog������Animal������ʹ��
		/*
		 * ���������������ʹ��ʱ����Ҫ�κ���ʽ����������Ҫע����ǣ���ʱ����ͨ���������ȥ���������е�ĳЩ����
		 * ���ֲ���Ҫ��ʽ����������ת�����Զ�����ת����
		 * 
		 * ����animalShout()������˵������Ķ��������Animal���ͣ���������Animal�������ͣ�
		 * ��Ҫ��ô֪������ĵ���������һ�������أ�Java�ṩ��һ��instanceof�ؼ������ж�һ����������ͣ���ʹ�ø�ʽ���£�
		 * ���󣨻��������ñ�����  instanceof  �ࣨ��ӿڣ�
		 * 
		 * ������animalShout()������������޸ģ�
		 * 	public static void animalShout(Animal animal) {
		if (animal instanceof Cat) {
			Cat cat = (Cat) animal;
			cat.shout();
		} else if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			dog.shout();
		} else {
			animal.shout();
		}
	}

		����instanceof���������жϵĺô����Ǳ�����ǿ������ת�����������Ͳ�ƥ��Ĵ���


		 */

		animalShout(dog);   //����...
		animalShout(cat);   //����...
/*
 * Animal cat = new Cat();�� Animal dog = new Dog(); ���д���ʵ���˸������ͱ������ò�ͬ���������
����animalShout()����ʱ�����������õ�������ͬ�������ֱ��룬�����ӡ���ˡ�����...���͡�����...����
�ɴ˿ɼ�����̬��������˷���ͬ�������⣬���һ�ʹ�����ø����������Ӷ���Ч����߳���Ŀ���չ�ԺͿ�ά����
*/


	}

	// ����һ����̬��animalShout()����,����һ��Animal���͵Ķ���
	public static void animalShout(Animal animal) {
		animal.shout();// ����ʵ�ʲ�����shout()����
	}
}
