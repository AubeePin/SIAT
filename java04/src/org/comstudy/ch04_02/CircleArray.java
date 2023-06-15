package org.comstudy.ch04_02;


	
class Circle{ // 여긴 메소드
	int radius;
	public Circle(int radius) {
		this.radius = radius; //디스가 뭐엿드라... radius는 반지름을 뜻한다. 레디우스?
	}
	public double getArea() { // getArea() 메소드는 반지름를이용하여 면적을 계산하여 알려준다.
		return 3.14*radius*radius;//리턴기능 포함!
	}
}

public class CircleArray{ //여긴 필드
	public static void main(String[] args) {
		Circle[]c; //Circle객체에 대한 리스트 c변수 선언
		c= new Circle[5]; //c 는 새로운 리스트 0~4개를 만든다는 뜻.

		for(int i = 0; i<c.length; i++) //반복문 = i는 0부터 초기화 / i는 c리스트길이보다 작다. i<0,1,2,3,4 i++
			c[i] = new Circle(i);       //c[6] = 서클에 객체 6개 있다 라고 새로 저장 한줄이라 중괄호 없지만 두줄이상은 중괄호 넣는다.
		
		for(int i = 0; i<c.length; i++)
			System.out.print((int)(c[i].getArea()) + " ");// 반복문이고 어.. i<5 이라서 0*3.14/1*3.14 이렇게 순서대로 출력한다.
//		System.out.print((int)(c[i].getArea()) + " ");// 이것은 23번 포문 과 24번 다지우고 여기부터 넣어도 출력결과가 똑같다. 안나오면 괄호를 잘살펴보고 넣자.
//	}  이방법도 포함.
		}
	}

