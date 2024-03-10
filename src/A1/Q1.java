package A1;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input num: ");
		int n=sc.nextInt();
		if(n<2)
			System.out.println("Invalid num,Please enter a num greater than 2");
		
		int c=0;
		while(n>2) {
			n=n/2;
			c++;
		}
		System.out.println("the no. of times one must repeatedly divide this num by 2 before getting a value less than 2 is "+c);

	}

}
