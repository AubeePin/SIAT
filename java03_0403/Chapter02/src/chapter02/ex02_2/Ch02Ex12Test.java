package chapter02.ex02_2;

import java.util.Scanner;

public class Ch02Ex12Test {

	
	public static void main(String[] args) {
		
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("점수를 입력해 주세요");
	 int score = scanner.nextInt();
	 
	 String grade = ""; // + - 문자를 넣기위해 포함?
	 
	      
	      if (score>=97 && score<=100) {
	         grade = "A+";
	      } else if (score>=94 && score<=96) {
	         grade = "A";
	      } else if (score>=90 && score<=93) {
	         grade = "A-";
	      } else if (score>=87 && score<=89) {
	         grade = "B+";
	      } else if (score>=84 && score<=86) {
		     grade = "B";
		  } else if (score>=80 && score<=83) {
		     grade = "B-";
		  } else if (score>=77 && score<=79) {
		     grade = "C+";
		  } else if (score>=74 && score<=76) {
			 grade = "C";
		  } else if (score>=70 && score<=73) {
			 grade = "C-";
		  } else if (score>=67 && score<=69) {
			 grade = "D+";
		  } else if (score>=64 && score<=66) {
			 grade = "D";
		  } else if (score>=60 && score<=63) {
			 grade = "D-";
		 
		  }else grade="F";
			 
	      System.out.println(grade + "입니다.");
	   }

}