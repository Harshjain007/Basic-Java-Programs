/*4. program to input marks of five subjects Physics, Chemistry, Biology,
Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F
*/
import java.util.Scanner;
public class Ques4 {

	public static void main(String args[]) {
		int p, c, b, m, com;
		float per ;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter Marks in Physics:");
		p = ob.nextInt();
		System.out.println("Enter marks in Chemistry: ");
		c = ob.nextInt();
		System.out.println("Enter marks in Biology: ");
		b = ob.nextInt();
		System.out.println("Enter marks in Mathematics: ");
		m = ob.nextInt();
		System.out.println("Enter marks in Computer: ");
		com = ob.nextInt();
		per = (float)((p+c+b+m+com)/5);
		System.out.println("Total Percentage is " + per + "%");
	
		if( per >= 90)
		    System.out.println("Grade A");
		else if(per >= 80 )
		    System.out.println("Grade B");
		else if(per >= 70 )
		    System.out.println("Grade C");
		else if(per >= 60 )
		    System.out.println("Grade D");
		else if(per >= 40 )
		    System.out.println("Grade E");		
		else
		    System.out.println("Grade F");

	}
}
/*
O/P:
----
Enter Marks in Physics: 99
Enter marks in Chemistry: 99
Enter marks in Biology: 99
Enter marks in Mathematics: 99
Enter marks in Computer: 99
Total Percentage is 99.0%
Grade A

*/
