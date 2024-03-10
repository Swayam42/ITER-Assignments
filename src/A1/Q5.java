package A1;

import java.util.Scanner;

public class Q5 {

//	public static int sum(int n) {
//	    while(n>=10) {
//	    	n=sumOfDigits(n);
//	    }
//	    return n;
//	}

	public static int sumOfDigits(int n) {
		int x;
		while (n >= 10) {

			int sum = 0;
			while (n != 0) {
				x = n % 10;
				sum += x;
				n = n / 10;
			}
			n = sum;
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input n: ");
		int n = sc.nextInt();
		System.out.println(sumOfDigits(n));
	}

}
