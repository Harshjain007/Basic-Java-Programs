/*5. program to input basic salary of an employee and calculate its Gross salary
according to following:
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%
*/

import java.util.Scanner;
public class Ques5 {
	public static void main (String args[]) {
		double bs, hra, da;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the basic Salary of the employee:");
		bs = s.nextDouble();
		if(bs <= 10000){
			hra  = (bs * 0.2);
			da = (bs * 0.8);
			System.out.println("The HRA of Employee is:" + hra);
			System.out.println("The DA of Employee is:" + da);
		}
		else if(bs <= 20000){
			hra  = (bs * 0.25);
			da = (bs * 0.9);
			System.out.println("The HRA of Employee is:" + hra);
			System.out.println("The DA of Employee is:" + da);
		}
		else {
			hra  = (bs * 0.3);
			da = (bs * 0.95);
			System.out.println("The HRA of Employee is:" + hra);
			System.out.println("The DA of Employee is:" + da);
		}
		
	}
}
/*
O/P:
-----
Enter the basic Salary of the employee:10000
The HRA of Employee is: 2000.0
The DA of Employee is: 8000.0
*/
