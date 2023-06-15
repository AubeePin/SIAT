package ch04_exerclse;

class Person {
	private int age;
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}

public class Ch04Ex07 {

   public static void main(String[] args) {
	      Person aPerson = new Person();
	      //aPerson.age = 17;
	      aPerson.setAge(17);
	}
}