package shivam.array;

import java.util.Scanner;

public class RotateMatrix90Clock44 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * 5 
		 * 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
		 */
		int m = scan.nextInt();
		int[][] arr = new int[m][m];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		printSquareMatrix(arr, m);
		rotate90Clock(arr, m - 1);
		System.out.println("\n\nPrinting The rotated matrix\n\n");
		printSquareMatrix(arr, m);
	}

	private static void printSquareMatrix(int[][] arr, int m) {
		System.out.println();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++)
				System.out.print(arr[i][j] + "\t");
			System.out.println();
		}
	}

	private static void rotate90Clock(int[][] arr, int n) {
		int temp;
		for (int i = 0; i <= n / 2; i++) {
			for (int j = i; j <= n - i - 1; j++) {
				temp = arr[i][j];
				arr[i][j] = arr[n - j][i];
				arr[n - j][i] = arr[n - i][n - j];
				arr[n - i][n - j] = arr[j][n - i];
				arr[j][n - i] = temp;
				printSquareMatrix(arr, arr.length);
			}
		}
	}
}
