package bitwise;

public class SquareWithoutMultPow10 {
	public static void main(String[] args) {
		int num = 5;
		System.out.println(square(num));
	}

	public static int square(int num) {
		if (num == 0)
			return 0;
		else if ((num & 1) == 1) // odd
			return 4 * square(num >> 1) + 4 * (num >> 1) + 1;
		else
			return 4 * square(num >> 1);
	}
}
