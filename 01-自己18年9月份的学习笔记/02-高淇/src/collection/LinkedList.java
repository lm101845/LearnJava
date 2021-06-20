package collection;

/**
 * @���� ����
 * @���� 2018��11��7������8:06:14
 * 
 * ���Իῼ����
 */
public class LinkedList /*implements List*/{
	private static LinkedList list;
	private Node first;
	private Node last;
	
	private int size;			//size��¼���ǽڵ�ĳ��ȣ�ÿ�¼�һ��Ԫ�أ�size��Ҫ��һ��
	
	public void add(Object obj) {
		Node n = new Node(); 		//�ڵ�������Ԫ�أ�first,last,size
		
		if(first==null) {
			n.setPrevious(null);
			n.setObj(obj);
			n.setNext(null);
			
			first = n; 	//������ڵ㸳��first
			last = n; 	//����ڵ����firstҲ��last
			
		}else {
			//ֱ����last�ڵ�������µĽڵ�
			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);
			
			last.setNext(n);
			
			last = n;
		}
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public static void main(String[] args) {
		
		 LinkedList linkedlist = new  LinkedList();
		 list.add("aaa");
		 list.add("bbb");
		 System.out.println(list.size());
		 
		
	}
}


