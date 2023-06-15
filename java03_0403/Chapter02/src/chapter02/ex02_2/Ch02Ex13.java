package chapter02.ex02_2;

import java.util.Scanner;

public class Ch02Ex13 {

	public static void main(String[] args) {		
	  Scanner scanner = new Scanner(System.in);
	  
		int a, b, c;
		int max=0, mid=0, min=0;
				
	System.out.print("정수 3개를 입력하세요 >>");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
	
	if((a>b) && (a>c)) {
		max = a;
	if((b>c)) 
	{mid = b; min = c;}
	else 
	{mid = c; min = b;}
	}
	else if((b>c))
	{max = b;
	 if((a>c)) {
		 mid = a; min = c; }
	 else {
		 mid = c; min = a;}
	} 
	else {max =c;
	if((a>b)) {
		mid = a; min = b;}
	else {mid = b; min = a;}
	}
System.out.printf("max=%d, mid=%d, min=%d\n", max, mid, min);
	scanner.close();
		
  }
}
				
 
	
	


	
	




