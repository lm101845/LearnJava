package myCollection;

/**
 * @���� ����
 * @���� 2018��11��5������10:41:34
 * 
 * ģ��ʵ��JDK���ṩ��ArrayList��--�Լ�����д��
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
    	//this(10);    ����Ҳ����  һ������������һ��������
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
    		//װ�����������ݰ�
    		int newCapacity = value.length*2;
    		Object[] newList = new Object[newCapacity];
    	//System.arraycopy(src, srcPos, dest, destPos, length);  ����ǿ��Ե�
    		
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
    	list.add(new Human("���"));
    	list.add("bbb");
    	
    	Human h = (Human)list.get(1);
    	System.out.println(h.getName());
    	
    	System.out.println(list.get(3));
    	System.out.println(list.size);
	}
}
