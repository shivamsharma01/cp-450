package shivam.array;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicRotate7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), index, temp;
		int[] arrClock = new int[n], arrAntiClock;

		for (int i = 0; i < n; i++)
			arrClock[i] = scan.nextInt();

		arrAntiClock = Arrays.copyOf(arrClock, n);

		// rotate clockwise
		index = n - 1;
		temp = arrClock[index];
		while (index >= 1) {
			arrClock[index] = arrClock[index - 1];
			index--;
		}
		arrClock[index] = temp;

		// rotate anti-clockwise
		index = 0;
		temp = arrAntiClock[index];
		while (index < n - 1) {
			arrAntiClock[index] = arrAntiClock[index + 1];
			index++;
		}
		arrAntiClock[index] = temp;

		System.out.println(Arrays.toString(arrClock));
		System.out.println(Arrays.toString(arrAntiClock));
	}
}
