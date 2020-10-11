 //2. program to enter base and height of a triangle and find its area.

import java.util.Scanner;
public class Ques2 {

	public static void main(String args[]) {
		int base, height;
		float area;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter Base of triangle:");
		base = a.nextInt();
		System.out.println("Enter Height of TRiangle: ");
		height = a.nextInt();
		area = (float) (0.5 * base * height);
		System.out.println("Area of triangle is: " + "\n" + area + "Units");
	}
}
/*
 
O/P:
----
Enter Base of triangle: 5
Enter Height of TRiangle: 98
Area of triangle is: 
245.0 Units
*/
