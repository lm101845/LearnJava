//��1������ʹ��Java������һ�����
//��2��ʵ����

class Animal{
	String name;	//��Ա����
	String color;
	public Animal(String n,String c){
		name = n;
		color = c;
	}
	public void eat(){
		String name = "����";	//�ֲ�����
		System.out.println(name+"�ڳԡ���");
	}
}
 
class Demo1{
	public static void main(String[] args){
		Animal dog = new Animal("��","��ɫ");//��ʱ���ڴ��д�������name����
		Animal cat = new Animal("è","��ɫ");
		cat.eat();
	}
}

//��3�����н���������ڳ�........
