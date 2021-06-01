package array;

import java.util.Scanner;

public class MinMax2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		System.out.println("Maximum element is " + max);
		System.out.println("Minimum element is " + min);
	}
}
