package ch04;

class Rectangle {
	int x;
	int y;
	int width; //위드쓰 가로 너비 폭
	int height;//하이트 높이
	
	Rectangle(int x, int y, int width, int height){//필드를 초기화하는 생성자인가보다?
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public void show() {
		System.out.println("(" + x + "," + y + ")"+ " 에서 크기가 " + width + "x" + height + "인 사각형" );
	}
	public int square() {
		return (width*height);
	}
	
	boolean contains(Rectangle r) {
		if(x < r.x && y< r.y)//1<2 && 1<2 이 맞다면
			if((x+width)>(r.x+r.width)&& (y+height)>(r.y+r.height))//t11> r10
				return true;
		
			return false;
	}
}

public class pj04 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();
		System.out.println("s의 면적은 " + s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s을 포함합니다.");
			
	}

}
