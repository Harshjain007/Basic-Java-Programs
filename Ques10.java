// 10.program to find first and last digit of a number.

import java.util.Scanner;
public class Ques10 {
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
		System.out.println("First Digit of the Number is:" + fd);
		System.out.println("Last Digit of the Number is:" + ld);
	}
}
/*
O/P:
-----
Enter the number: 129853
First Digit of the Number is:1
Last Digit of the Number is:3
*/



