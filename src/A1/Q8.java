package A1;
import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of Rows: ");
		int m=sc.nextInt();
		System.out.println("Enter no. of columns: ");
		int n=sc.nextInt();
		
		int arr[][]=new int[m][n];
		System.out.print("Enter the elements of 2D Array: ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		int sum=0;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
				sum+=arr[i][j];
			}
			System.out.println();
		}
		System.out.print("The sum of all elements of 2-D Array= "+sum);
		
		
		
		
		
		
		

	}

}
