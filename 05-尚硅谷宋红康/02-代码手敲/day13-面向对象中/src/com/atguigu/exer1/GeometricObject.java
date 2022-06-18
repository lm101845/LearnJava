package com.atguigu.exer1;

public class GeometricObject {//几何图形

	protected String color;
	protected double weight;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public GeometricObject(String color, double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	
	public double findArea(){
		return 0.0;
		//几何图形不一样，求面积的方式千差万别，所以这里是无法写求面积公式的，一定要用到方法重写
	}
	
}
