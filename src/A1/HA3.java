package A1;
import java.util.Scanner;
import java.util.Arrays;
public class HA3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input Length of Array a and b: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		System.out.print("Input elements of Array a: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Input elements of Array b: ");
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		System.out.print("Dot product of a and b: ");
		for(int i=0;i<c.length;i++) {
			c[i]=a[i]*b[i];
		}
		System.out.print(Arrays.toString(c));

	}

}
