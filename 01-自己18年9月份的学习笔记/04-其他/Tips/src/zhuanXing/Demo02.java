package zhuanXing;

/**
 * @���� ����
 * @���� 2018��11��7������1:38:45
 * 
 * ������ת�����Ӧ�ľ�������ת���ˡ�����ת���ǰѸ������תΪ�������(��ע�⣡�������пӵġ�)
 * 
 * �ȿ�һ�����ӣ�
 * //���������animal��cat dog
Animal a = new Cat();
Cat c = ((Cat) a);
c.eat();
//���  �ҳ���
 * 
Dog d = ((Dog) a);
d.eat();
// ���� �� java.lang.ClassCastException��com.chengfan.animal.Cat cannot be cast to com.chengfan.animal.Dog
 
Animal a1 = new Animal();
Cat c1 = ((Cat) a1);
c1.eat();
// ���� �� java.lang.ClassCastException��com.chengfan.animal.Animal cannot be cast to com.chengfan.animal.Cat
 * 
 * Ϊʲô��һ�δ��벻�����أ������Ҳ֪���ˣ���Ϊa�������Cat����������������Ȼ�Ŀ�������ת��ΪCat��Ҳ������Ȼ��
 * ����תΪDog�������һ����ͻȻ�ͱ��һֻè���ֲٵ�����

��a1ΪAnimal������Ҳ���ܱ�����ת��Ϊ�κ�������󡣱�����ȥ���ţ�������һ�������֪������һ�ֶ�������㲻��
ֱ��˵����������è������˵���ǹ���

����ת��ע������

����ת�͵�ǰ���Ǹ������ָ������������Ҳ����˵��������ת��֮ǰ������������ת�ͣ�
����ת��ֻ��ת��Ϊ�������è�ǲ��ܱ�ɹ��ģ���

������˵������ô�в�������������ת��������ת�ͣ���

���ǻص���������⣺ι����Է������˷�����ʲô�أ���ͬ�Ķ���϶�����ͬ���£���ô���أ�


 */
public class Demo02 {
	/*public void eat(Animal a){
	    if(a instanceof Dog){  
	        Dog d = (Dog)a;
	        d.eat();
	        d.run();//����һ���ܵķ���      
	    } 
	    if(a instanceof Cat){  
	        Cat c = (Cat)a;
	        c.eat();
	        System.out.println("��Ҳ���ܣ����ǲ���"); //è�ᱧԹ    
	    } 
	    a.eat();//��������ֻ���
	}

	eat(new Cat());
	eat(new Cat());
	eat(new Dog());*/
	//.....
	//�úڰ壬���ص㣡�����Ǹ�instanceof��ô��


}
