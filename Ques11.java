// 11.program to find sum of first and last digit of a number.


import java.util.Scanner;
public class Ques11 {
	public static void main(String args[]){
		int a, ld, fd;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the number:");
		a = ob.nextInt();
		ld = a % 10;
	
		while(a >= 10){
			a = a / 10;
		}
		fd = a;
		
		System.out.println("Sum of first and last  digit of a number is:" + (fd + ld));
	}
}
/*
O/P:
---
Enter the number: 569
Sum of first and last  digit of a number is:14
*/

