
// 20. program to convert Octal to Binary number system.
import java.util.Scanner;

public class Ques20{  
	public static void main(String args[]){    
		String num; 
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter number to Convert: ");
		num = ob.nextLine();
		int dec = Integer.parseInt(num,8);  
		System.out.println("Decimal Equivalent is:" + dec); 
		System.out.println("Binary Equvalent of Number is: " + Integer.toBinaryString(dec));
	}
}
/*
O/P:
-----
Enter number to Convert:
23
Decimal Equivalent is:19
Binary Equvalent of Number is: 10011

*/