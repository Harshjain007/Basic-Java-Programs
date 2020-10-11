
//17. program to print all Prime numbers between 1 to n.
import java.util.Scanner;
public class Ques17{
	public static void main(String args[]) {
	 int i=0;
	 int num = 0;
	 int n;
	 Scanner ob = new Scanner(System.in);
	 System.out.println("Enter the value of n:");
	 n = ob.nextInt();
	 System.out.print("Prime Numbers between 1 to n are :" + 1 + " ");
	for( i = 0; i <= n; i++) {
		int count = 0;
		for(num = i; num >= 1; num--) {
			if(i % num == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.print(i + " ");
		}
	}
	}
}
/*
O/P:
----
Enter the value of n:
50
Prime Numbers between 1 to n are :1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47

*/