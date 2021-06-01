package array;

import java.util.Scanner;

public class UnionIntersection6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt(), n = scan.nextInt(), idx1, idx2;
		int[] arr1 = new int[m], arr2 = new int[n];
		// arrays are sorted
		for (int i = 0; i < m; i++)
			arr1[i] = scan.nextInt();
		for (int i = 0; i < n; i++)
			arr2[i] = scan.nextInt();

		System.out.println("Printing Union");
		idx1 = 0;
		idx2 = 0;
		while (idx1 < m && idx2 < n) {
			if (arr1[idx1] < arr2[idx2])
				System.out.print(arr1[idx1++] + " ");
			else if (arr1[idx1] > arr2[idx2])
				System.out.print(arr2[idx2++] + " ");
			else {
				System.out.print(arr1[idx1] + " ");
				idx1++;
				idx2++;
			}
		}
		while (idx1 < m)
			System.out.print(arr1[idx1++] + " ");
		while (idx1 < n)
			System.out.print(arr2[idx2++] + " ");

		System.out.println("\nPrinting Intersection");
		idx1 = 0;
		idx2 = 0;
		while (idx1 < m && idx2 < n) {
			if (arr1[idx1] < arr2[idx2])
				idx1++;
			else if (arr1[idx1] > arr2[idx2])
				idx2++;
			else {
				System.out.print(arr1[idx1] + " ");
				idx1++;
				idx2++;
			}
		}
	}
	
}
