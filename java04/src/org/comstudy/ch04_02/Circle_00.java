package org.comstudy.ch04_02;

public class Circle_00 {
	
	int radius; //���� ������ �ʵ�
	String name;//���� �̸� �ʵ�
	
	public Circle_00() {}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) {
		Circle_00 pizza;
		pizza = new Circle_00();
		pizza.radius = 10;
		pizza.name = "�ڹ� ����";
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ "+ area);
		
		Circle_00 donut = new Circle_00();
		donut.radius = 2;
		donut.name = "�ڹ� ����";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ "+ area);

	}

}
