package keyWord02;

 class Pet {

	public void play() { // ���ǳ�����,��ͨ���࣬�������ǿյ�
	}
}

 class Cat extends Pet { // �������࣬��һ��è��,��д�˸��෽��
	public void play() {
		System.out.println("1��è����");
	}
}

 class Dog extends Pet { // �������࣬��һ������,��д�˸��෽��
	public void play() {
		System.out.println("2�����й�ͷ");
	}
}

public class Chouxie {
	public static void main(String[] args) { // ���ǲ����࣬�ֱ����������Ĳ�ͬ����

		Pet p1 = new Dog(); // ����͵Ķ�̬���ְ����൱�ĸ���
		Pet p2 = new Cat();

		p1.play();
		p2.play();
	}
}
