package duoTai;

/**
 * ���Զ�̬
 * 
 * @���� ����
 * @���� 2018��10��29������6:44:19
 */
/*
 * ��ָ̬����ͬһ���������ã����ڶ���ͬ���ܻ��в�ͬ����Ϊ��ͬ����˯�������ڴ�������˯��������˯����ʵ�����У�
 * ͬһ�������� ����ʵ�ֻ���ȫ��ͬ
 * 
 * ��̬��Ҫ�㣺
 *  1.��̬�Ƿ����Ķ�̬���������ԵĶ�̬����̬�������޹أ� 
 *  2.��̬�Ĵ���Ҫ��3����Ҫ�������̳С�������д����������ָ���������
 *  3.��������ָ�����������øø������õ���������д�ķ�������ʱ��̬�ͳ�����
 * 
 * final�ؼ��ֵ����ã�
 *  1.���α������������εı������ɸı䡣һ�����˳�ֵ���Ͳ��ܱ����¸�ֵ
 *  2.���η������÷������ɱ�������д�����ǿ��Ա�����
 *  3.�����ࣺ���ε��಻�ܱ��̳С����磺Math��String��
 * 
 * ��д�����ص����� 1.��д�� 2.���أ�
 * 
 * 
 */
public class TestPolym {

	public static void main(String[] args) {

		Animal a = new Animal();
		animalCry(a);

		Animal d = new Dog(); 
		// �Զ�����ת�� ��Ȼ����animal�ı�ǩ�����Ǳ����ϻ���dog,���е�ʱ��������dog�ķ���
		// �������ڱ���ʱ��Ϊd����animal��ֻ��������ʱ����Ϊd��dog
		animalCry(d);
		
		Animal c = new Cat();
		animalCry(new Cat());

		// d.seeDoor(); //����������ʶd,��������animal
		Dog d2 = (Dog) d; // ǿ������ת�� dԭ����animal( Animal d),��ǿ�ư���תΪdog
		d2.seeDoor();
		
    	//Dog d3 = (Dog) c;    
		//��һֻèǿ��ת����һֻ���������Եġ�����û�����⣬���ǻᱨ��ClassCastException������ת������
		
        //d3.seeDoor();

	}

	static void animalCry(Animal a) { // ������static void sum(int a) ������Animal ,����Ϊa
		a.shout();
	}

	/*
	 * static void animalCry(Dog a){ a.shout(); } static void animalCry(Cat a){
	 * a.shout(); }
	 */

}

class Animal {

	public void shout() {
		System.out.println("�������һ����");
	}
}

class Dog extends Animal {

	public void shout() {
		System.out.println("����������"); // ��������д
	}

	public void seeDoor() {
		System.out.println("�����ţ�����");   //������ķ���
	}

}

class Cat extends Animal {

	public void shout() {
		System.out.println("è��������");
	}
}
