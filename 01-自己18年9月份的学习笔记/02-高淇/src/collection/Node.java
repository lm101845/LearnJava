package collection;

/**
 * @姓名 李明
 * @日期 2018年11月7日下午8:10:45
 */

//用来表示一个节点
//链表使用节点穿起来的，我们所有值使用节点串起来的
public class Node {
	
	//提供几个构造器处理一下
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
    
	//属性都是私有的，需要提供set,get方法
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
	


