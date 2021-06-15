package bitwise;

public class CopySetBits8 {
	public static void main(String[] args) {
		System.out.println(copySetBits(10, 13, 2, 3));
		System.out.println(copySetBits(8, 7, 1, 2));
	}

	private static int copySetBits(int x, int y, int l, int r) {
		int maxSetBitsY = rightMostBit(y), temp;
		r = Math.min(maxSetBitsY, r);
		if (l > maxSetBitsY)
			return x;
		while (l <= r) {
			temp = 1 << (l - 1);
			x = x | (y & temp);
			l++;
		}

		return x;
	}

	private static int rightMostBit(int num) {
		int count = 0;
		while (num != 0) {
			num >>= 1;
			count++;
		}
		return count;
	}
}
