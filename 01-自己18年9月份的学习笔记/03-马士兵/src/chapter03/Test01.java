package chapter03;
/*
 * privateֱ�ӷ������Ϊ˽�еģ�����Java�����ĺ��岢����˽�еġ����Ǳ����п��õģ�
 * ��������˵ֻ�б����п���ʹ�ã����ģ��ñ������߷�����
��������һ������Ϊ��ֻҪ���������ķ�Χ�ڲ��������ڣ�����ʹ�ã���������ʹ������˭��
�����Լ����߱�����е�ʵ��������ͨ��thisʹ�ã���ֻҪ�����ҵ��������þ����ˡ�
����privateӦ�����Ϊ�����п�ʹ�õģ������Ǳ���˽�еġ�

 */

class Person001 {
	private String name;
    private int age;
    public void setName(String name) {				//set:����    get:�õ�
    	this.name=name;
    }
    public void setAge(int age) {
    	this.age=age;
    }
    public String getName(){
    	return name;
    }
    public int getAge(){
    	return age;
    }
}

class Student extends Person001 {			//extends��һ���ؼ��֣���ʾ��student����person�̳�һЩ���ԣ�ѧ�����ˣ�
										//���һ����̳��൱����ӵ�������������г�Ա���������з���
    private String school;		//����ӵ�е�person����֮�⣬student��ӵ�������Լ��ĳ�Ա����(school),��Ա������getschool/setschool)
    
    public String getSchool() {
    	return school;
    }
    public void setSchool(String school) {
    	this.school =school;
    } 
}

public class Test01 {
    public static void main(String args[]){
        Student student = new Student();
        student.setName("John");
        student.setAge(18);
        student.setSchool("SCH");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getSchool());
    }

}
