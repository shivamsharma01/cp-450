package shivam.array;

import java.util.Scanner;

public class negativeElements5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), index = 0, temp;
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++)
			arr[i] = scan.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				temp = arr[i];
				arr[i] = arr[index];
				arr[index++] = temp;
			}
		}

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
