package collection;

/**
 * @���� ����
 * @���� 2018��11��7������8:10:45
 */

//������ʾһ���ڵ�
//����ʹ�ýڵ㴩�����ģ���������ֵʹ�ýڵ㴮������
public class Node {
	
	//�ṩ��������������һ��
	public Node() {
		
	}
	public Node(Object previous, Object obj, Object next) {
		super();
		this.previous = previous;
		this.obj = obj;
		this.next = next;
	}

	private Object previous;
	private Object obj;
	private Object next;
    
	//���Զ���˽�еģ���Ҫ�ṩset,get����
	public Object getPrevious() {
		return previous;
	}

	public void setPrevious(Object previous) {
		this.previous = previous;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public Object getNext() {
		return next;
	}

	public void setNext(Object next) {
		this.next = next;
	}

}
	


