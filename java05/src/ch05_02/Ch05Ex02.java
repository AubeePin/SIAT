package ch05_02;

abstract class 노비 {
	public abstract void 공부(); 
}

class 상민 extends 노비{
	@Override
	public void 공부() {
		System.out.println("노비 아들이 공부한다.");
	}
}

public class Ch05Ex02 {

	public static void main(String[] args) {
		//추상 메소드로 참조 변수 선언 가능.
		노비 돌쇠 = new 상민();
		돌쇠.공부();
	}

}
