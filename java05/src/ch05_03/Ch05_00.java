package ch05_03;

class A{
	int i;
}
class B extends A{
	int j;
}
class C extends B{
	int k;
}
class D extends B{
	int m;
}


public class Ch05_00 {

	public static void main(String[] args) {
		System.out.println(new D() instanceof Object);
		System.out.println("Java" instanceof Object);
	}

}
