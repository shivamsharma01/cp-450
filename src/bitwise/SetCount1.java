package bitwise;

import java.util.Scanner;

public class SetCount1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println("Number of 1 bits in " + N + " = " + setCount(N));
	}

	private static int setCount(int n) {
		int count = 0;
		while (n != 0) {
			if ((n & 1) == 1)
				count++;
			n >>= 1;
		}
		return count;
	}
}
