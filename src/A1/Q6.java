package A1;
import java.util.Scanner;
public class Q6 {

	public static boolean isOdd(int i) {
	
		i=Math.abs(i); //to take the absolute value (if i is -ve)
		while(i>1) {
			i=i-2;
		}
		if(i==1)
			return true;
		else
			return false;
	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		boolean b=isOdd(n);
		if(b==true)
			System.out.println(n+" is Odd");
		else
			System.out.println(n+" is Even");
	}

}
