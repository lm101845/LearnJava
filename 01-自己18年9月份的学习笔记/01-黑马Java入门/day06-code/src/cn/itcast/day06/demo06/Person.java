package cn.itcast.day06.demo06;
/**
 *@����
 *@���� 2018��11��26�� 
 *���ı�����1+1
 *
 * �������е��������ͣ�Getter�������getXXX�� Setter�������setXXX��������һ������
 * ����ǻ����������͵�blloeanֵ����ôsetXXX���򲻱䣬��getXXX��Ҫд��isXXX����ʽ
 */
public class Person {
	
	private String name;
	private int age;
	private boolean male;   //�ǲ���ү�ǣ�true����ү�ǣ�false������ү�Ƕ�
	
	public boolean isMale() {
		return male;
	}
	
	public void setMale(boolean male) {
		this.male = male; 
	}
	
	public String getName() {			//getû�в���     get�з���ֵ
		return name;
	}
	
	public void setName(String name) {	//set�����в���   setû�з���ֵ
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
