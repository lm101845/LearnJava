package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**自己实现一个ArrayList,帮助我们更好的理解ArrayList的底层结构
 * @姓名 李明
 * @日期 2018年11月7日下午4:36:34
 * 
 * 面试可能考get,set,remove
 */
public class MyArrayList /*implements List*/ {
	
	private Object[] elementData;		//我们经常把容器里面的一个对象称为element(元素)
	
	//数组长度相当于车位，size相当于放了几个车
	
	 private int size;		//表示尺寸，里面放了多少个元素
	 
	 public int size() {
		 return size;
	 }
	 
	 public boolean isEmpty() {
		 return size  == 0;
	 }
	 public MyArrayList() {			//第一个空的构造器
		 this(10);			//默认数组的长度为10
	 }
	 
	 public MyArrayList(int initialCapacity) {			//第二个带参构造器
		 if(initialCapacity<0) {
			 try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		 }
		 elementData = new Object[initialCapacity];		//新建一个数组
	 }
	 
	 public void add(Object obj) {
		 //数组扩容和数据的拷贝
		 if(size==elementData.length) {
			 Object[] newArray = new Object[size*2+1];
			 System.arraycopy(elementData, 0, newArray,0, elementData.length);
//			 for(int i = 0; i< elementData.length;i++){
//				 newArray[i] = elementData[i];
//			 }
			 elementData = newArray;
		 }
		 elementData[size] = obj; 
		 size++;
	 }
	 
	 public Object get(int index) {		//get根据某个索引位置来返回
		 rangeCheck(index);	
		 return elementData[index];
	 }
	 
	 public void remove(int index) {
		 //删除指定位置的对象
		 rangeCheck(index);			//调用定义好的方法
		 int numMoved = size-index-1;
		 if(numMoved>0) {
			System.arraycopy(elementData, index+1, elementData, index, numMoved);
			elementData[--size] = null;   //let gc do its work
		 }
	}
		 
		 public void remove(Object obj) {
			 for(int i = 0;i < size;i++) {
				 if(get(i).equals(obj)) {		//注意：底层调用的是equals方法，而不是等于号
				remove(i);
					 
				 }
			 }
		 }
	 
	 public Object set(int index,Object obj) {
		 rangeCheck(index);
		 
	        Object oldValue = elementData[index];
	        elementData[index] = obj;
	        return oldValue;
	 }
	 
	 public void add(int index,Object obj) {
		 rangeCheck(index);
		 
		 ensureCapacity();		//数组扩容
		 
		 System.arraycopy(elementData, index,elementData, index + 1, size - index);
		 elementData[index] = obj;
		 size++;
	 }

		 private void ensureCapacity() {
			 //数组扩容和数据的拷贝
			 if(size==elementData.length) {
				 Object[] newArray = new Object[size*2+1];
				 System.arraycopy(elementData, 0, newArray,0, elementData.length);
//				 for(int i = 0; i< elementData.length;i++){
//					 newArray[i] = elementData[i];
			 }
		 }
	 
	 private void rangeCheck(int index) {
		 if(index < 0 || index >= size) {
			 try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		 }
	 }
	 
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList(3);
		list.add("333");
		list.add("444");
		list.add("555");
		list.add("666");
		System.out.println(list.size);
		System.out.println(list.get(3));   //666
		System.out.println(list.get(4));   //null
		System.out.println(list.get(10));   //异常
	
	}

}
