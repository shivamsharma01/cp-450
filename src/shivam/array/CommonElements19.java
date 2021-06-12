package shivam.array;

import java.util.ArrayList;
import java.util.List;

public class CommonElements19 {
	public static void main(String[] args) {
		int[] A = { 1, 5, 10, 20, 40, 80 }, B = { 6, 7, 20, 80, 100 }, C = { 3, 4, 15, 20, 30, 70, 80, 120 };
		List<Integer> ans = commonElements(A, B, C, A.length, B.length, C.length);
		for (int a : ans)
			System.out.print(a + "\t");
	}

	static List<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
		List<Integer> ans = new ArrayList<>();
		int i1 = 0, i2 = 0, i3 = 0, num;
		while (i1 < n1 && i2 < n2 && i3 < n3) {
			if (A[i1] == B[i2] && A[i1] == C[i3]) {
				ans.add(A[i1]);
				num = A[i1];
				while (i1 < n1 && A[i1] == num)
					i1++;
				while (i2 < n2 && B[i2] == num)
					i2++;
				while (i3 < n3 && C[i3] == num)
					i3++;
			} else if (A[i1] < B[i2] && A[i1] < C[i3]) {
				i1++;
				if (B[i2] < C[i3])
					i2++;
				else if (C[i3] < B[i2])
					i3++;
			} else if (B[i2] < A[i1] && B[i2] < C[i3]) {
				i2++;
				if (A[i1] < C[i3])
					i1++;
				else if (C[i3] < A[i1])
					i3++;
			} else if (C[i3] < A[i1] && C[i3] < B[i2]) {
				i3++;
				if (A[i1] < B[i2])
					i1++;
				else if (B[i2] < A[i1])
					i2++;
			} else if (A[i1] > B[i2] && A[i1] > C[i3]) {
				i2++;
				i3++;
			} else if (B[i2] > A[i1] && B[i2] > C[i3]) {
				i1++;
				i3++;
			} else if (C[i3] > A[i1] && C[i3] > B[i2]) {
				i1++;
				i2++;
			}
		}
		return ans;
	}

}
