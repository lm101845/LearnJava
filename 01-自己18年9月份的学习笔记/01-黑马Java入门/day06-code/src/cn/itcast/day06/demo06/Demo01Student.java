package cn.itcast.day06.demo06;

/**
 * @���� ����
 * @���� 2018��11��7������11:29:41
 * ���ı�����1+1
 */
public class Demo01Student {
	
	public static void main(String[] args) {
		
		Student stu1 = new Student();  
		stu1.setName("¹��");
		stu1.setAge(20);
		System.out.println("������" + stu1.getName() + ",����" +stu1.getAge() );
		
		Student stu2 = new Student("���ෲ",25); 
		System.out.println("������" + stu2.getName() + ",����" +stu2.getAge() );
		
		stu2.setAge(26);
		System.out.println("������" + stu2.getName() + ",����" +stu2.getAge() );
		
		
	}

}
