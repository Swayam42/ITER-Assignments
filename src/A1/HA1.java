package A1;
import java.util.Scanner;
public class HA1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input a: ");
		int a=sc.nextInt();
		System.out.print("Input b: ");
		int b=sc.nextInt();
		System.out.print("Input c: ");
		int c=sc.nextInt();
		
		boolean isValid=false;
		if((a+b==c)||(a==b-c)||(a*b==c)) {
			isValid=true;
			
		}
	   if(isValid) {
	            System.out.println("The integers can be used in a correct arithmetic formula.");
	        } else {
	            System.out.println("The integers cannot be used in a correct arithmetic formula.");
	        }

	}

}
