//9. program to count number of digits in a number.
import java.util.Scanner;
public class Ques9 {
	public static void main(String args[]) {
		int a;
		int count = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number:");
		a = obj.nextInt();
		while(a != 0){
			a /= 10;
			count++;
		}
		System.out.println("The given number is:" + count + " digit" );
	}
}
/*
O/P:
-----
Enter a number: 123

The given number is: 3 digit

*/