package shivam.array;

public class TrappingRainWater29 {
	public static void main(String[] args) {
		System.out.println(trappingWater(new int[] { 7, 4, 0, 9 }, 4));
	}

	static int trappingWater(int arr[], int n) {
		if (n <= 2)
			return 0;

		int[] space = new int[n];
		int ans = 0;
		space[0] = arr[0];
		for (int i = 1; i < n; i++)
			space[i] = Math.max(space[i - 1], arr[i]);

		space[n - 1] = Math.min(arr[n - 1], space[n - 1]);

		for (int i = n - 2; i >= 0; i--)
			space[i] = Math.min(space[i], Math.max(space[i + 1], arr[i]));

		for (int i = 1; i < n; i++) {
			if (arr[i] < space[i])
				ans += space[i] - arr[i];
		}
		return ans;
	}
}
