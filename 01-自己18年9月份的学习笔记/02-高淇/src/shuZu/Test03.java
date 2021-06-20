package shuZu;

/**测试数组的遍历
 * @姓名 李明
 * @日期 2018年10月29日下午7:49:34
 * 
 *增强for循环for-each循环：专门用于读取数组或集合中所有的元素，即对数组进行遍历
 *注意：只能读取数组元素的值，不能修改元素的值
 * 
 */
public class Test03 {

	public static void main(String[] args) {
		
		int[] a = new int[4];
        //初始化数组元素的值
        for(int i=0;i<a.length;i++){
            a[i] = 100*i;
        }
        //读取元素的值
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("==================================");
        //foreach循环:用于读取数组元素的值，不能修改元素的值
        for(int   m : a){    //m为变量   a为数组    因为没有下标，所以不能直接饮用a里面的内容
        	System.out.println(m);  
        }
        
        String[] ss = { "aa", "bbb", "ccc", "ddd" };
        for (String temp : ss) {
            System.out.println(temp);
        }
        
        
	}
}
