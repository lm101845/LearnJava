package jiCheng;

/**���Լ̳�
 * @author ����
 * @date 2018��10��29������2:24:52
 */
/*
 * ����̳и��࣬���Եõ������ȫ�����Ժͷ��������˸���Ĺ��췽�������������ÿ���ֱ�ӷ��ʣ����磬����˽�е����Ժͷ�����
 * 
 * �������һ����ʱ��û�е���extends,�����ĸ�����java.lang.Object
 */
public class TestExtends {
	public static void main(String[] args) {
		Student   stu1  =  new Student();
		stu1.name="���";    //��Ȼstudent������û�ж���name������������Ϊ�̳���person,�������������������ֱ����
		stu1.height = 172;
		stu1.rest();
		
		Student  stu2 = new Student("ϣϣ",6,"�ھ��רҵ");
		
		System.out.println(stu2   instanceof  Student);
		System.out.println(stu2   instanceof   Person ); 
		System.out.println(stu2   instanceof   Object ); 
		System.out.println(new Person()   instanceof   Student );   //�˲��̳�student,����	 false
		System.out.println(new Student()   instanceof   Person );  	//true
		//instanceof�Ƕ�Ԫ�����������Ƕ����ұ����ࣻ���������ұ���������������Ķ���ʱ������true,���򷵻�false
		
	}
}


class  Person   /*extends  Object*/ {
	String  name;
	int   height;
	
	public void  rest(){
		System.out.println("��Ϣһ�ᣡ");
	}
}

class  Student   extends  Person  {
	//ֻҪд��extends,Person�������name�� height������ rest���������ҵ��ˣ��Ͳ�������дһ���ˣ�ʵ���˴��������
	String   major;				
	
	public   void   study(){
		System.out.println("ѧϰ��Сʱ��");
	}
	
	public  Student(String name,int height, String  major){    //����ǹ��캯��1
		this.name = name;
		this.height = height;
		this.major = major;
	}
	
	public Student(){		//����ǹ��캯��2
	}
	
	
}