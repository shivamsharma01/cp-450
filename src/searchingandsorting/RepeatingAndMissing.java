package searchingandsorting;

public class RepeatingAndMissing {
	public static void main(String[] args) {
		int[] ans = findTwoElement(
				new int[] { 13, 33, 43, 16, 25, 19, 23, 31, 29, 35, 10, 2, 32, 11, 47, 15, 34, 46, 30, 26, 41, 18, 5,
						17, 37, 39, 6, 4, 20, 27, 9, 3, 8, 40, 24, 44, 14, 36, 7, 38, 12, 1, 42, 12, 28, 22, 45 },
				47);
		System.out.println(ans[0] + " " + ans[1]);
	}

	static int[] findTwoElement(int arr[], int n) {
		int missing = -1, duplicate = -1, temp, i = 0, count = 0;
		while (i < n) {
			if (i == arr[i] - 1) {
				i++;
			} else {
				temp = arr[arr[i] - 1];
				arr[arr[i] - 1] = arr[i];
				arr[i] = temp;
			}
			for (int j = 0; j < n; j++)
				System.out.print("(" + (j + 1) + ":" + arr[j] + ") ");
			System.out.println("");
		}

		for (i = 0; i < n; i++) {
			if (i != arr[i] - 1) {
				missing = i + 1;
				duplicate = arr[i];
				break;
			}
		}
		return new int[] { duplicate, missing };
	}
}
