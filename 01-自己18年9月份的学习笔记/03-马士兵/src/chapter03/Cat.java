package chapter03;      
/*
 * 1.main��������Ҫnewһ������Ϳ�������
 *2.��̬���������ĳһ�����������õģ���̬�������������ĳ��������ã�û�ж�����������
 *3.java��û��ָ�룬ֻ�С����á�
*
*static�ؼ���:
*1.�����У���static�����ĳ�Ա����Ϊ��̬��Ա��������Ϊ����Ĺ��ñ������ڵ�һ��ʹ��ʱ����ʼ�������ڸ�������ж�����˵��
*static��Ա����ֻ��һ��
*
*2.��static�����ķ���Ϊ��̬�������ڵ��ø÷���ʱ�����Ὣ��������ô��ݸ�����������static�����в��ɷ��ʷ�static�ĳ�Ա
*����̬�������������ĳ��������ã����Բ��ܷ��ʷǾ�̬��Ա��
*
*3.����ͨ���������û�����������Ҫʵ���������ʾ�̬��Ա
*
*
 */
public class Cat {
	 private static int sid = 0;
	    private String name; 
	    int id;
	    Cat(String name) {
	        this.name = name;  
	        id = sid++;
	    }
	    public void info(){
	        System.out.println
	               ("My name is "+name+" No."+id);
	    }
	    public static void main(String arg[]){

	        Cat.sid = 100;
	        Cat mimi = new Cat("mimi");
	        mimi.sid = 2000;
	        Cat pipi = new Cat("pipi");
	        mimi.info(); 
	        pipi.info();
	    }

}
