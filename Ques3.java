//3. program to find maximum between three numbers using conditional operator.

import java.util.Scanner;
public class Ques3 {

	public static void main(String args[]) {
		int a, b, c;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter First number:");
		a = ob.nextInt();
		System.out.println("Enter Second Number: ");
		b = ob.nextInt();
		System.out.println("Enter Third Number: ");
		c = ob.nextInt();
		if( a > b && a > c)
		System.out.println(a + "is Greatest.");
		else if( b > a && b > c)
		System.out.println(b + "is Greatest.");
		else
		System.out.println(c + " is Greatest.");
		
	}
}

/*
O/P:
----
Enter First number: 5
Enter Second Number: 4
Enter Third Number: 98
98is Greatest.

*/
