package bitwise;

public class FindPosSetBit7 {
	public static void main(String[] args) {
		System.out.println(findPosition(2));
	}

	static int findPosition(int N) {
		int count = -1;
		if (isPowerofTwo(N)) {
			count = 0;
			while (N != 0) {
				count++;
				N >>= 1;
			}
		}
		return count;

	}

	public static boolean isPowerofTwo(long n) {
		long temp = n;
		while (temp != 0) {
			if ((temp & 1) == 1) {
				if ((temp >> 1) == 0)
					return true;
				else
					return false;
			}
			temp >>= 1;
		}
		return false;
	}
}
