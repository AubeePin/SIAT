package Ch03Ex;

public class Ch03Ex08 {

	public static void main(String[] args) {
		//0+ 1 + 1 - 2 + 3 - 5 + 8 - 13 + 21 = 14
		final int MAX =21;
		int total =0;
		for(int n=0, p=0,c=1; c<=21; n=c+p && n=c-p, p=c,c=n) {
			System.out.print(c);
			
		}

	}

}


public static void main(String[] args) {
	//0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 = 54
	final int MAX =21;
	int total = 0;
	for(int n=0, p=0, c=1; c <= 21; n=c+p, p=c, c=n) {
		
		System.out.print(c);
		total += c;
		System.out.print(c<MAX ? "+":"=");
}
	System.out.print(total);
}	