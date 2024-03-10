package A1;

import java.util.Scanner;

public class Q9 {

	public static double sumMajorDiagonal(double arr[][], int n) {
		double sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (i == j)
					sum += arr[i][j];
			}
		}
		return sum;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of a square matrix: ");
		int n = sc.nextInt();
		double arr[][] = new double[n][n];
		System.out.println("Enter a " + n + "-by-" + n + " matrix row by row: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextFloat();
			}
		}
		System.out.println("sum of all elements in the major diagonal: " + sumMajorDiagonal(arr, n));
	}

}
