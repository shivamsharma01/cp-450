package array;

import java.util.Arrays;
import java.util.Scanner;

public class KminMax3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), k = scan.nextInt(), count;
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++)
			arr[i] = scan.nextInt();

		Arrays.sort(arr);
		System.out.println("Maximum element is " + arr[n - k]);
		System.out.println("Minimum element is " + arr[k - 1]);
	}
}
