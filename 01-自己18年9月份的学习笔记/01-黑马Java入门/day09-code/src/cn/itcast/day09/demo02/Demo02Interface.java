package cn.itcast.day09.demo02;
/**
 * ���ߣ�����
  * ���ڣ� 2018��12��1�� ����3:47:56
  * ���ı�����1
  * 
 * ʹ�ýӿ���Ϊ������͵ĺô����ڣ�
 * �������Ҳ�ĸ������е����ݣ��ﵽ���롢ͳһ��Ŀ�ġ�
 */
public class Demo02Interface {
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();  //������һֻè
		method(cat);   //��è���󴫵ݸ����������ʹ�����е�eat��sleep����
		
		Dog dog = new Dog(); //������һ����
		method(dog);
		
	}
	//ʹ��һ���Զ��������Ϊ�������ͣ�û����
	public static void method(Cat cat) {
		cat.eat();
		cat.sleep();
	}
	
	public static void method(Dog dog) {
		dog.eat();
		dog.sleep();
	}
	
	
}
