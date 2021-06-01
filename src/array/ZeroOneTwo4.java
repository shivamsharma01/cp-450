package array;

import java.util.Scanner;

public class ZeroOneTwo4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), index = 0;
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++)
			arr[i] = scan.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[i] = arr[index];
				arr[index++] = 0;
			}
		}
		index = arr.length - 1;
		for (int i = arr.length - 1; i >= 0 && arr[i] != 0; i--) {
			if (arr[i] == 2) {
				arr[i] = arr[index];
				arr[index--] = 2;
			}
		}

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
