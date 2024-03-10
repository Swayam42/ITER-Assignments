package A1;
import java.util.Scanner;
public class Q3 {

	static void spy(int n) {
		int x;int sum=0;int prod=1;int temp=n;
		while(n>0) {
			x=n%10;
		    sum+=x;
			prod*=x;
			n=n/10;
		}
		if(sum==prod)
			System.out.println(temp+" is a spy num");
		else
			System.out.println(temp+" is not a spy num");
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input N: ");
		int n=sc.nextInt();
		spy(n);

	}

}
