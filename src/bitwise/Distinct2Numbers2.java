package bitwise;

public class Distinct2Numbers2 {
	public static void main(String[] args) {
		System.out.println((7 & -7) + " : " + (7 & 6));
		int[] ans = new Distinct2Numbers2().singleNumber(new int[] { 1, 2, 3, 2, 1, 4 });
		System.out.println(ans[0] + " and" + ans[1]);
	}

	public int[] singleNumber(int[] nums) {
		int c = nums[0];
		for (int i = 1; i < nums.length; i++)
			c ^= nums[i];
		System.out.println(c);
		int rightMostBit = (c & -c), num1 = 0, num2 = 0;
		System.out.println(rightMostBit);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(rightMostBit & nums[i]);
			if ((rightMostBit & nums[i]) == 0)
				num1 ^= nums[i];
			else
				num2 ^= nums[i];
		}
		if (num1 > num2)
			return new int[] { num2, num1 };
		else
			return new int[] { num1, num2 };
	}
}
