package org.comstudy.ch04_02;


	
class Circle{ // ���� �޼ҵ�
	int radius;
	public Circle(int radius) {
		this.radius = radius; //�𽺰� �������... radius�� �������� ���Ѵ�. ����콺?
	}
	public double getArea() { // getArea() �޼ҵ�� ���������̿��Ͽ� ������ ����Ͽ� �˷��ش�.
		return 3.14*radius*radius;//���ϱ�� ����!
	}
}

public class CircleArray{ //���� �ʵ�
	public static void main(String[] args) {
		Circle[]c; //Circle��ü�� ���� ����Ʈ c���� ����
		c= new Circle[5]; //c �� ���ο� ����Ʈ 0~4���� ����ٴ� ��.

		for(int i = 0; i<c.length; i++) //�ݺ��� = i�� 0���� �ʱ�ȭ / i�� c����Ʈ���̺��� �۴�. i<0,1,2,3,4 i++
			c[i] = new Circle(i);       //c[6] = ��Ŭ�� ��ü 6�� �ִ� ��� ���� ���� �����̶� �߰�ȣ ������ �����̻��� �߰�ȣ �ִ´�.
		
		for(int i = 0; i<c.length; i++)
			System.out.print((int)(c[i].getArea()) + " ");// �ݺ����̰� ��.. i<5 �̶� 0*3.14/1*3.14 �̷��� ������� ����Ѵ�.
//		System.out.print((int)(c[i].getArea()) + " ");// �̰��� 23�� ���� �� 24�� ������� ������� �־ ��°���� �Ȱ���. �ȳ����� ��ȣ�� �߻��캸�� ����.
//	}  �̹���� ����.
		}
	}

