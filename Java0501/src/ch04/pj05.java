package ch04;
import java.util.Scanner;

class Circle {
	private double x, y;
	private int radius;
	
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius);
	}
}
public class pj05 {

//public CircleManager { 이거 왜 넣는지 잘모르겠다..
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle c [] = new Circle[3];
		for(int i = 0; i<3; i++) {
			System.out.println("x, y, radius>>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
		//	c[i] = //여기부터 ..막?히네요! ㅋㅋㅋㅋ
		}
	}

}
