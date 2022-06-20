package com.atguigu.java1;

import java.util.Objects;

public class Customer {
	
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Customer() {
		super();
	}
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//自动生成的equals()

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Customer customer = (Customer) o;
		return age == customer.age && Objects.equals(name, customer.name);
	}


	//重写的原则：比较两个对象的实体内容(即：name和age)是否相同
	//手动实现equals()的重写
//	@Override
//	public boolean equals(Object obj) {
//		
////		System.out.println("Customer equals()....");
//		if (this == obj) {
//            return true;
//        }
//		
//		if(obj instanceof Customer){
//			Customer cust = (Customer)obj;
//			//比较两个对象的每个属性是否都相同
	//		  基本数据类型(age)没得选，只能用==。引用数据类型(name)则必须用equals
////			if(this.age == cust.age && this.name.equals(cust.name)){
////				return true;
////			}else{
////				return false;
////			}
//			
//			//或
//			return this.age == cust.age && this.name.equals(cust.name);
//		}else{
//			return false;
//			
//		}
//		
//	}

	//手动实现
//	@Override
//	public String toString() {
//		return "Customer[name = " + name + ",age = " + age + "]"; 
//	}
	//自动实现
//	@Override
//	public String toString() {
//		return "Customer [name=" + name + ", age=" + age + "]";
//	}

	@Override
	public String toString() {
		return "Customer{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
