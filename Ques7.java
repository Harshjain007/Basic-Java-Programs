//7. program to check whether an alphabet is vowel or consonant using switch case.
import java.util.Scanner;
public class Ques7{
	public static void main(String args[]) {
		char c;
		Scanner a = new Scanner (System.in);
		System.out.println("Enter Character to check: ");
		c = a.nextLine().charAt(0);
		switch(c) {
			case 'a':System.out.println("The Character is Vowel.");
			        break;
			case 'e':System.out.println("The Character is Vowel.");
		            break;
			case 'i':System.out.println("The Character is Vowel.");
			        break;
			       
			case 'o':System.out.println("The Character is Vowel.");
			        break;
			case 'u':System.out.println("The Character is Vowel.");
			        break;
			case 'A':System.out.println("The Character is Vowel.");
			        break;
			case 'E':System.out.println("The Character is Vowel.");
			        break;
			case 'I':System.out.println("The Character is Vowel.");
			        break;
			case 'O':System.out.println("The Character is Vowel.");
			        break;
			case 'U':System.out.println("The Character is Vowel.");
			        break;
			default :System.out.println("The Character is Consonant.");
		}
	
	}
}

/*
O/P:
-----
Enter Character to check: a
The Character is Vowel.
*/
