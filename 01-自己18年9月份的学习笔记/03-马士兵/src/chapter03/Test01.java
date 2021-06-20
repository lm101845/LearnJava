package chapter03;
/*
 * private直接翻译过来为私有的，但在Java中它的含义并不是私有的。而是本类中可用的，
 * 表面上是说只有本类中可以使用（更改）该变量或者方法。
但他还有一个含义为：只要在我这个类的范围内部（括号内）即可使用，他不关心使用者是谁，
是他自己或者别的类中的实例（例如通过this使用）。只要你在我的类里面用就行了。
所以private应该理解为本类中可使用的，而非是本类私有的。

 */

class Person001 {
	private String name;
    private int age;
    public void setName(String name) {				//set:设置    get:得到
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

class Student extends Person001 {			//extends是一个关键字，表示类student从类person继承一些特性（学生是人）
										//你从一个类继承相当于你拥有了这个类的所有成员变量，所有方法
    private String school;		//除了拥有的person特性之外，student还拥有属于自己的成员变量(school),成员方法（getschool/setschool)
    
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
