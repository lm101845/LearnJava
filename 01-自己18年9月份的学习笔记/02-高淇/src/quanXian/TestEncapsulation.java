package quanXian;

/**���Է�װ
 * @���� ����
 * @���� 2018��10��29������4:45:40
 */
public class TestEncapsulation {  //��װ����˼ 
	
	public static void main(String[] args) {
		Human  h = new Human();
//		h.age = 13;   //age����װ�����ˣ�������˵�ǲ��ɼ���
		h.name = "���";    //nameΪdefault���ԣ����ܱ���ͬ���������         û�б���װ�����Կ�����
		h.height = 230;
		
		Person4  p4 = new Person4();
//		p4.age = 14;    age�Ѿ���˽���ˣ�����ʲ���
		p4.setAge(-14);
		p4.getName();
		System.out.println(p4.getAge());
	}
}


class   Boy  extends Human {
	public  void  sayHello(){
//		System.out.println(age);		//�����޷�ʹ�ø����˽�����Ժͷ�������̳��˵����ò��ˣ�
	}
}