package com.atguigu.exer4;

/**
 * @Author liming
 * @Date 2022/6/23 18:44
 **/

/**
 * interface CompareObject{
	public int compareTo(Object o);
	//若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
 }

 */
public interface CompareObject {
	//若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
	public abstract int compareTo(Object o);
}
