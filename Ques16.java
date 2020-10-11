// 16. program to check whether a number is Prime number or not

import java.util.Scanner;
public class Ques16{
	public static void main(String args[]) {
		int a, i;
		int count = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number ");
		a = obj.nextInt();
		for(i = 2; i <= Math.sqrt(a); i++) {
			if(a % i == 0) {		
				count++;
				break;
				}
			}
		if(count == 1) {
			System.out.println("COMPOSITE");
			}
		else {
			System.out.println("PRIME");
		}
	}
}
/*
O/P:
----
Enter a number
2
PRIME

Enter a number
99
COMPOSITE

*/