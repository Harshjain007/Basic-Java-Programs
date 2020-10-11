/*6. program to input electricity unit charges and calculate total electricity bill
according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill
*/
import java.util .Scanner;
public class Ques6 {
    public static void main(String args[]) {
        int unit;
        double charge = 0.0;
        Scanner a = new Scanner(System.in);
        System.out.println("Enter unit of Electricity Consumed:");
        unit = a.nextInt();
        if(unit <= 50) {
            charge = 0.50 * unit;
        }
        else if(unit <= 150) {
            unit = unit - 50;
            charge = (25 + (unit * 0.75));
        }
        else if(unit <= 250) {
            unit = unit - 150;
            charge = (100 + (unit * 1.20));
        }
        else {
            unit = unit - 250;
            charge = (220 + (unit * 1.50));
        }
		charge = charge + (0.2 * charge); 
        System.out.println("Your Electricity Bill is: " +  "Rs" + charge);
        
    }
    
}
/*
O/P:
----
Enter unit oF Elctricity: 100
Your Electricity Bill is: Rs 62.5

*/
