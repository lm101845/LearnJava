package day05;
/*
 * ��������д��ĸʹ��Сд������ɶ��������ɣ��ӵ�2�����ʿ�ʼ���������ʵ���д��ĸʹ�ô�д��
����ֲ����������ֺͳ�Ա������������ͬ�� Ҫ���ڸ÷�����ʹ�ó�Ա����������ʹ�ùؼ���this
 */
class People {
	String name = "�����ض����name";			//���еĳ�Ա��������ֵ
 
	People(){
	}
	
	public void speak() {
		String name = "���巽���ж����name";		//�ڷ���speak�ж���ͳ�Ա����������ͬ��name����ֵ
		System.out.println(name);
		System.out.println(this.name);		//ͨ��this���������еĳ�Ա����
		
	}
}
 
 
public class TestThis {          //Դ�ļ���ֻ����һ������public�࣬����Դ�ļ������ֱ�����������������ȫ��ͬ����
                                        //��û��public�࣬��ôԴ�ļ�������ֻҪ��ĳ�����������ͬ�Ϳ����ˡ�
	public static void main(String[] args) {       
		People myPeople = new People();
		myPeople.speak();
	}
 
}
