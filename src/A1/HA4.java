package A1;
import java.util.Scanner;
public class HA4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input no. of row of Array a: ");
		int ra=sc.nextInt();
		System.out.print("Input no. of column of Array a: ");
		int ca=sc.nextInt();
		int a[][]=new int [ra][ca];
		for(int i=0;i<ra;i++) {
			for(int j=0;j<ca;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.print("Input no. of row of Array b: ");
		int rb=sc.nextInt();
		System.out.print("Input no. of column of Array b: ");
		int cb=sc.nextInt();
		int b[][]=new int [rb][cb];
		for(int i=0;i<rb;i++) {
			for(int j=0;j<cb;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		

	}

}
