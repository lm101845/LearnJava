package chapter06;

import java.util.ArrayList;

public class Demo01ArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Egg> myList = new ArrayList<>();    //����
		
		Egg s = new Egg(); 
		myList.add(s);   //����Ԫ��
		
		Egg b = new Egg(); 
		myList.add(b);   //�ټ���Ԫ��
		
		int thesize = myList.size();  //��ѯ��С  ��ΪmyList������Ԫ�أ�size()�᷵��2
		
		boolean isIn = myList.contains(s);  //��ѯ�ض�Ԫ��  ��ΪmyList����s�����õ� Egg�������Դ˷����᷵��true
		
		boolean empty = myList.isEmpty();   //�жϼ����Ƿ�Ϊ��
		
		myList.remove(s);   //ɾ��Ԫ��
		
		
		
	}
	

}
