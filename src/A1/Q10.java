package A1;
import java.util.Scanner;
public class Q10 {

	public static double sumColumn(double arr[][] ,int columnIndex) {
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i][columnIndex];
		}
		return sum;
	}
	
	public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);
	       System.out.print("Enter no. of rows: ");
	       int m=sc.nextInt();
	       System.out.print("Enter no. of columns: ");
	       int n=sc.nextInt();
	       
	       double arr[][]=new double[m][n];
	       System.out.print("Enter a "+m+"-by-"+n+" matrix row by row: ");
	       for(int i=0;i<m;i++) {
	    	   for(int j=0;j<n;j++) {
	    		   arr[i][j]=sc.nextDouble();
	    		  }
	       }
	       
	       for(int j=0;j<n;j++) {
	    	   System.out.println("The sum of elements at column "+j+" is "+sumColumn(arr,j));
	       }
	      

	}

}
