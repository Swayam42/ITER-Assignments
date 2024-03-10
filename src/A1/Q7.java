package A1;

import java.util.Scanner;

public class Q7 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			// Input the number of elements
			System.out.print("Enter number of elements of Array: ");
			int n = sc.nextInt();

			// Input the elements of the array
			System.out.print("Enter elements of the array: ");
			int[] array = new int[n];
			for (int i = 0; i < n; i++) {
				array[i] = sc.nextInt();
			}

			// Find maximum and minimum elements
			int max = array[0];
			int min = array[0];
			int maxCount = 0;
			int minCount = 0;
			int maxFirstPos = -1;
			int minLastPos = -1;
			for (int i = 0; i < n; i++) {
				if (array[i] > max) {
					max = array[i];
					maxCount = 1;
					maxFirstPos = i + 1;
				} else if (array[i] == max) {
					maxCount++;
				}

				if (array[i] < min) {
					min = array[i];
					minCount = 1;
					minLastPos = i + 1;
				} else if (array[i] == min) {
					minCount++;
					minLastPos = i + 1;
				}
			}

			// Output the results
			System.out.println("Maximum element of Array is " + max + " and occurs " + maxCount + " times.");
			System.out.println("Minimum element of Array is " + min + " and occurs " + minCount + " times.");
			System.out.println("First occurrence of maximum element is at position " + maxFirstPos + ".");
			System.out.println("Last occurrence of minimum element is at position " + minLastPos + ".");
		}
	}


