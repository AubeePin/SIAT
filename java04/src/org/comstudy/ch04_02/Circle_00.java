package org.comstudy.ch04_02;

public class Circle_00 {
	
	int radius; //원의 반지름 필드
	String name;//원의 이름 필드
	
	public Circle_00() {}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) {
		Circle_00 pizza;
		pizza = new Circle_00();
		pizza.radius = 10;
		pizza.name = "자바 피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 "+ area);
		
		Circle_00 donut = new Circle_00();
		donut.radius = 2;
		donut.name = "자바 도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 "+ area);

	}

}
