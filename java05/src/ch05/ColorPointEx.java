package ch05;

class Point {
	private int x, y;//������ �����ϴ� x,y��ǥ
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() {//���� ��ǥ ���
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point { //point�� ��ӹ��� ColorPoint ����
	private String color; //���� ��
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {//�÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint();// pointŬ������ showPoint()ȣ��
	}
}
public class ColorPointEx{
	
	public static void main(String [] args) {
		Point p = new Point();
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
	}
}




