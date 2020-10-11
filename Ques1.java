
//1. program to enter two angles of a triangle and find the third angle.

import java.util.Scanner;
public class Ques1 {

	public static void main(String args[]) {
		float a1, a2;
		float a3 = 0;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter 1st Angle of triangle:");
		a1 = a.nextFloat();
		System.out.println("Enter 2nd Angle of TRiangle: ");
		a2 = a.nextFloat();
		a3 = (float) (180.0 -(a1 + a2));
		System.out.println("Angles of triangle are: " + a1 +"\n" + a2 +"\n" + a3 + "Degrees" );
	}
}
/*
 O/P:
 ----
 Enter 1st Angle of triangle: 60
 Enter 2nd Angle of TRiangle: 60
 Angles of triangle are: 60.0
 60.0
 60.0 
 */
 