//19. program to convert Binary to Hexadecimal number system.

import java .util.Scanner;

public class Ques19 {
	public static void main(String args[]){
		String hexa;
		int num;
       Scanner s = new Scanner( System.in );
       System.out.print("Enter a binary number: ");
       hexa =s.nextLine();
	   
	   num = Integer.parseInt(hexa, 2);
       System.out.println("The Decimal Equivalent is:" + num);
	   String hexf = Integer.toHexString(num);
	   System.out.println("The Hexadecimal Equivalent is:" + hexf);
    }
}
