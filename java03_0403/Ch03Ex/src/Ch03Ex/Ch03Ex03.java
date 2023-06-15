package Ch03Ex;

public class Ch03Ex03 {

	public static void main(String[] args) {

		int total = 0;
		int i = 1;
		while (i < 10) {
			if (i % 2 == 1) {
				System.out.print(i);
		total = total + i;
				System.out.print(i == 9 ? "=" : "+");

			}
			i++;
		}
		
		System.out.print(total);
		
	}
}
