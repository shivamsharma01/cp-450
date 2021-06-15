package bitwise;

public class SetCount1ToN5 {
	public static void main(String[] args) {
		for (int i = 0; i <= 16; i++)
			System.out.println(i + "= " + Integer.toBinaryString(i) + " " + setCount(i));
	}

	private static int setCount(int n) {
		if (n <= 1)
			return n;
		int pow2 = 0, temp = n;
		while (temp != 0) {
			temp >>= 1;
			pow2++;
		}
		temp = 1 << (pow2 - 1);
		return (n - temp + 1) + (pow2 - 1) * ((int) Math.pow(2, pow2 - 2)) + setCount(n ^ temp);
	}
}
