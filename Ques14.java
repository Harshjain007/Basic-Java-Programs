
// 14. program to calculate product of digits of a number.

import java.util.Scanner;
public class Ques14 {
	public static void main(String args[]) {
		int a,b;
		int sum = 1;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number:");
		a = obj.nextInt();
		while(a > 0){
			b = a % 10;
			sum = sum * b;
			a = a/10;
		}
		System.out.println("The  sum given number is:" + sum );
		
	}
}
/* 
O/P:
-----
Enter a number:
569
The  sum given number is:270
*/