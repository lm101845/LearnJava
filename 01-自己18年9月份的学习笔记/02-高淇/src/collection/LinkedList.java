package collection;

/**
 * @姓名 李明
 * @日期 2018年11月7日下午8:06:14
 * 
 * 面试会考链表
 */
public class LinkedList /*implements List*/{
	private static LinkedList list;
	private Node first;
	private Node last;
	
	private int size;			//size记录的是节点的长度，每新加一个元素，size都要变一下
	
	public void add(Object obj) {
		Node n = new Node(); 		//节点有三个元素：first,last,size
		
		if(first==null) {
			n.setPrevious(null);
			n.setObj(obj);
			n.setNext(null);
			
			first = n; 	//把这个节点赋给first
			last = n; 	//这个节点既是first也是last
			
		}else {
			//直接往last节点后增加新的节点
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


