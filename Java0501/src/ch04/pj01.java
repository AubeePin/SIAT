package ch04;

class TV {
	String title;
	int year;
	int num;
	
	TV(String title, int year, int num){
		this.title = title;
		this.year = year;
		this.num = num;
	}
	public void show() 
	{System.out.println(title+"에서 만든 " + year + "년 " + num + "인치 TV");
	}
}

public class pj01 {
	
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();

	}

}
