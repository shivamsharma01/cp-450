package bitwise;

public class DivideTwoWithoutDivisionMultMod9 {
	public static void main(String[] args) {
		int a = 10, b = 6;
		System.out.println(divide(a, b));
		a = 43;
		b = -8;
		System.out.println(divide(a, b));
	}

	public static long divide(long dividend, long divisor) {
		long sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1, quotient = 0, temp = 0;
		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);
		for (int i = 31; i >= 0; --i) {
			if (temp + (divisor << i) <= dividend) {
				temp += divisor << i;
				quotient |= 1L << i;
			}
		}
		return (sign * quotient);
	}

}
