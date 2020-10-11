// 15. program to enter a number and print its reverse.


import java.util.Scanner;
public class Ques15 {
	public static void main(String args[]) {
		int num;;
		int rnum = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = obj.nextInt();
		while(num != 0){
			int digit = num % 10;
            rnum = rnum * 10 + digit;
            num /= 10;
		}
		System.out.println("The reverse Number is:" + rnum );
		
	}
}
/*
O/P:
----
Enter a number:
9874523
The reverse Number is:3254789
*/