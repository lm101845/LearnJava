package keyWord02;
/*
 * ��ͱ�ʾObject�е�toString�����Ѿ��������ˡ�����Object�е�toString��������Ҫ����д��
 */
public class Test01 {

	public static void main(String[] args) {
		
		Person p1 = new Person("king", 20);
		System.out.println(p1.toString());  //Person[name=king, age=20]

	}
}

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Person[name=" + name + ", age=" + age + "]";
		
		//����Ͱ�toString��������д�ˣ�ע��toString�ķ���ֵ��String��������Ծͺܷ����߼���
	}
}
