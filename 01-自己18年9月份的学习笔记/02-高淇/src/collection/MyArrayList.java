package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**�Լ�ʵ��һ��ArrayList,�������Ǹ��õ����ArrayList�ĵײ�ṹ
 * @���� ����
 * @���� 2018��11��7������4:36:34
 * 
 * ���Կ��ܿ�get,set,remove
 */
public class MyArrayList /*implements List*/ {
	
	private Object[] elementData;		//���Ǿ��������������һ�������Ϊelement(Ԫ��)
	
	//���鳤���൱�ڳ�λ��size�൱�ڷ��˼�����
	
	 private int size;		//��ʾ�ߴ磬������˶��ٸ�Ԫ��
	 
	 public int size() {
		 return size;
	 }
	 
	 public boolean isEmpty() {
		 return size  == 0;
	 }
	 public MyArrayList() {			//��һ���յĹ�����
		 this(10);			//Ĭ������ĳ���Ϊ10
	 }
	 
	 public MyArrayList(int initialCapacity) {			//�ڶ������ι�����
		 if(initialCapacity<0) {
			 try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		 }
		 elementData = new Object[initialCapacity];		//�½�һ������
	 }
	 
	 public void add(Object obj) {
		 //�������ݺ����ݵĿ���
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
	 
	 public Object get(int index) {		//get����ĳ������λ��������
		 rangeCheck(index);	
		 return elementData[index];
	 }
	 
	 public void remove(int index) {
		 //ɾ��ָ��λ�õĶ���
		 rangeCheck(index);			//���ö���õķ���
		 int numMoved = size-index-1;
		 if(numMoved>0) {
			System.arraycopy(elementData, index+1, elementData, index, numMoved);
			elementData[--size] = null;   //let gc do its work
		 }
	}
		 
		 public void remove(Object obj) {
			 for(int i = 0;i < size;i++) {
				 if(get(i).equals(obj)) {		//ע�⣺�ײ���õ���equals�����������ǵ��ں�
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
		 
		 ensureCapacity();		//��������
		 
		 System.arraycopy(elementData, index,elementData, index + 1, size - index);
		 elementData[index] = obj;
		 size++;
	 }

		 private void ensureCapacity() {
			 //�������ݺ����ݵĿ���
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
		System.out.println(list.get(10));   //�쳣
	
	}

}
