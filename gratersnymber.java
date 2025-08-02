package myproject;

import java.util.Scanner;

public class gratersnymber {
	 public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the first number: ");
		 int firstnum=sc.nextInt();
		 System.out.print("Enter the second number: ");
		 int secnum=sc.nextInt();
		 System.out.print("Enter the third number: ");
		 int thirdnum=sc.nextInt();
		 if(firstnum>secnum || firstnum>thirdnum) {
         System.out.print("First number is greatest:");
         
			 
		 }else if (secnum>thirdnum) {
			 System.out.print("Second number is grater: ");
					

}else 
	 System.out.print("Third number is the greatest: ");
}

}

