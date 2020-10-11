//13. program to calculate sum of digits of a number.

import java.util.Scanner;
public class Ques13 {
	public static void main(String args[]) {
		int a,b;
		int sum = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number:");
		a = obj.nextInt();
		while(a > 0){
			b = a % 10;
			sum = sum + b;
			a = a/10;
		}
		System.out.println("The  sum given number is:" + sum );
		
	}
}

/*
O/P:
----
Enter a number:
1234
The  sum given number is:10
*/