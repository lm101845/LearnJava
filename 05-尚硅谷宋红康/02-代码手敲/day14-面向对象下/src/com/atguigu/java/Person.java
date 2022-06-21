package com.atguigu.java;

import java.util.Objects;

public class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println("人：吃饭");
	}

	public void walk() {
		System.out.println("人：走路");
	}
// IDEA生成的重写的equals也不对啊
//	@Override
//	public boolean equals(Object o) {
//		if (this == o) return true;
//		if (!(o instanceof Person)) return false;
//		Person person = (Person) o;
//		return age == person.age && Objects.equals(name, person.name);
//	}

		@Override
	public boolean equals(Object obj) {
		//eclipse生成的这个是对的
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			//判断这个对象是由哪个类造的
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	//自己写的equlas方法就有点不对了，健壮性不如系统生成的
//	public boolean equals(Object obj) {
//		if (obj == this) {
//			return true;
//		}
//
//		if (obj instanceof Person) {
//			Person p = (Person) obj;
//			return this.age == p.age && this.name.equals(p.name);
//		}
//
//		return false;
//	}

}
