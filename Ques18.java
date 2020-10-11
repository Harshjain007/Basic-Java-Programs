//18. program to convert Binary to Decimal number system.

import java .util.Scanner;

public class Ques18 {
	public static void main(String args[]){
		String bin;
       Scanner s = new Scanner( System.in );
       System.out.print("Enter a binary number: ");
       bin =s.nextLine();
       System.out.println("Decimal Of given Binary Number is:  "+Integer.parseInt(bin,2));
    }
}
/*
O/P:
-----
Enter a binary number: 01010
Decimal Of given Binary Number is 10
*/