package myCollection;

/**
 * @姓名 李明
 * @日期 2018年11月5日下午10:41:34
 * 
 * 模拟实现JDK中提供的ArrayList类--自己动手写！
 */
public class MyArrayList {
	
	/**
     * The value is used for object storage.
     */
    private Object[] value;

    /**
     * The size is the number of characters used.
     */
    private int size;
    
    public 	MyArrayList() {
    	value = new Object[10];
    	//this(10);    这样也可以  一个构造器调另一个构造器
    }
    
    public int size() {
    	return size;
    }
    
    public 	MyArrayList(int size) {
    	if(size < 0) {
    		try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
    		
    	}
    	value = new Object[size];
    }
    
    public boolean isEmpty() {
    	return size ==0;
    }
    public void add(Object obj) {
    	value[size] = obj;
    	size++;
    	if(size >= value.length) {
    		//装不下啦，扩容吧
    		int newCapacity = value.length*2;
    		Object[] newList = new Object[newCapacity];
    	//System.arraycopy(src, srcPos, dest, destPos, length);  这个是可以的
    		
    		for (int i = 0; i < value.length; i++) {
    			newList[i] = value[i];
    		}
    		
    		value = newList;
    	}
    	
    }
    
    public Object get(int index) {
    	if(index < 0 ||index > size-1) {			//[0,size-1]
    		try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    	return value[index];
    }
    
    public int indexOf(Object obj) {
    	if(obj == null) {
    		return -1;
    	}else {
    		for(int i =0; i < value.length;i++) {
    			if(obj == value[i]) {
    				return i;
    			}
    		}
    		return -1;
    	}
    	
    }
    
    public int lastIndexOf(Object obj) {
    	if(obj == null) {
    		return -1;
    	}else {
    		for(int i = value.length-1;i >=0;i--) {
    			if(obj == value[i]) {
    				return i;
    			}
    		}
    		return -1;
    	}
    	
    }
    public static void main(String[] args) {
    	MyArrayList list = new MyArrayList(2);
    	list.add("aaa");
    	list.add(new Human("高淇"));
    	list.add("bbb");
    	
    	Human h = (Human)list.get(1);
    	System.out.println(h.getName());
    	
    	System.out.println(list.get(3));
    	System.out.println(list.size);
	}
}
