import java.util.Scanner;

public class Ques12{
public static void main(String args[]) {
	int n,f,l,r=0,tmp,swap,c,d;
	Scanner ob =new Scanner(System.in);
	System.out.println("Enter the number: ");
	n = ob.nextInt();
	tmp=n;
	l=n%10;
	while(n>10) {
		n=n/10;
		}
		f=n;
		n=tmp/10;
	while(n>10) {
		c=n%10;
		r=r*10+c;
		n=n/10;
		}
		swap=l;
	while(r>0){
		d=r%10;
		swap=swap*10+d;
		r=r/10;
		}
	swap=swap*10+f;
	System.out.println("Number Of your Desire is:"+swap);
	}
}
/*
O/P:
-----

Enter the number:
852641
After swap:152648

*/