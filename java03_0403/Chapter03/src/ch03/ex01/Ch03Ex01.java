package ch03.ex01;

public class Ch03Ex01 {
	//디폴트 생성자는 컴파일러가 추가 해 준다.
	//개발자가 생성자를 직접 만들면 컴파일러는 생성자를 만들지 않는다.
	//생성자 만들기 단축키 : Ctrl + spaceber
	public Ch03Ex01() {
		//디폴트 생성자 (Default constructor)는 매개변수가 없다.
		//개발자가 직접 만들수 있다. 
		//자가 안 만들면 컴파일러가 컴파일 시 자동 추가 (생성자가 있어야 컴파일 가능)
		System.out.println("디폴트 생성자 호출 됨");
	}
	public static void main(String[] args) {
		Ch03Ex01 ex01;//참조 변수 선언
		//객체 생성 후 참조변수에 참조값 전달
		new Ch03Ex01();//Constructor(생성자)실행
		//생성자는 임의 호출 불가능. 오직 생성 할때만 자동 호출 됨.
		//일단 없어도 있다고 생각 하고 호출한다.
		//엑박을 누르면 crate method 아이템 실행
		ex01.start();
		
		ex01.sayHello("길동이");
		
		int result = ex01.sum(10,12);
	}
	
	
	private void start() {
		System.out.println("start()");
		
	}
	private int sum(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
	private void sayHello(String string) {
		// TODO Auto-generated method stub
		
	}
	

}
