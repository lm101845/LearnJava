package keyWord01;
/*
 * ������Ƕ���һ��ʵ���࣬���صĽ���ֻ���ʲô�أ�
 */
public class Test02 {
	public static void main(String[] args){
		
		Student p1 = new Student("king", 20);
		System.out.println(p1.toString());		//keyWord.Person@299a06ac
		//����Ȼҵ���߼���̫���ʣ���Ӧ����һ�������������֣���Ӧ���Ƿ����߼��Ķ���
		
	}
}
 
class Student{
	String name;
	int age;
	
	Student(String name,int age){
		this.name = name;
		this.age = age;
	}
}
