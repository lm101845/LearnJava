package cn.itcast.day09.demo02;
/**
 * ���ߣ�����
  * ���ڣ� 2018��12��1�� ����3:47:56
  * ���ı�����1
  * 
 * ʹ�ýӿ���Ϊ������͵ĺô����ڣ�
 * �������Ҳ�ĸ������е����ݣ��ﵽ���롢ͳһ��Ŀ�ġ�
 * 
 * ����ӿڱ�̣�
 * ���ʹ�õĹ��ܣ��ӿ��Ѿ��������㣬��ô�Ͳ��ں����������˭��ֻ�ں��ӿڼ���
 */
public class Demo03InterfaceBetter {
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();  //������һֻè
		method(cat);   //��è���󴫵ݸ����������ʹ�����е�eat��sleep����
		
		Dog dog = new Dog(); //������һ����
		method(dog);
		
		Animal animalA = cat;
		Animal animalB = dog;
		
	}

	//ʹ�ýӿ���Ϊ�������ͣ������Ͳ����ֵ�����è���ǹ�
	public static void method(Animal animal) {
		animal.eat();
		animal.sleep();
//		animal.watHouse();  //�����޷����ù�ר�õķ���
//		animal.catchMouse();  //�����޷����ù�ר�õķ���
	}

}
